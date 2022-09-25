package tests;

import java.util.HashMap;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import utilitries.Helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
//import org.openqa.selenium.remote.CapabilityType;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class TestBase extends AbstractTestNGCucumberTests {
	
	public static WebDriver driver ;
	public static String downloadPath = System.getProperty("user.dir") + "\\DownLoads";

	public static FirefoxOptions firefoxOption() {
		FirefoxOptions option = new FirefoxOptions();
		// by defult 0 but 2 to change download
		option.addPreference("browser.download.folderList", 2);
		// place that will download in it     dir =directory =place
		option.addPreference("browser.download.dir", downloadPath);
		//for not ask the way to save for all types of download
		option.addPreference("browser.helperApps.neverAsk.saveToDisk", "application/pdf");
		// to never appeare the square when downloads
		option.addPreference("browser.download.manager.showWhenStarting", false);
		option.addPreference("pdfjs.disabled", true);
		return option;
	}
	
	public static ChromeOptions chromeOption() {
		ChromeOptions options = new ChromeOptions();
		//HashMap key object
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
		//by dafult of chrome ,chrome doesn't appeare options
		chromePrefs.put("profile.default.content_settings.popups", 0);
		//path of folder
		chromePrefs.put("download.default_directory", downloadPath);
		options.setExperimentalOption("prefs", chromePrefs);
		//accept ssl files and all files
		//options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		return options;
	}
	
	@BeforeSuite
	@Parameters({"chrome"})                               
	public void startDriver(@ Optional("chrome") String browserName) throws InterruptedException {

				if ( browserName.equalsIgnoreCase("chrome"))
				{
					System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
					driver = new ChromeDriver(chromeOption());
				}
				else if(browserName.equalsIgnoreCase("firefox"))
				{
					System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"//Drivers//geckodriver.exe");
					//when open driver pass firfoxoption
					driver = new FirefoxDriver(firefoxOption());
				}

				driver.manage().window().maximize();
				//driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
				driver.navigate().to("https://demo.nopcommerce.com/");
		       Thread.sleep(2000);
	}
	
	@AfterSuite
	public void closeDriver()
	{
		driver.quit();
	}
	
	// take screenshot when test case fail and add it in the Screenshot folder
		@AfterMethod
		public void screenshotOnFailure(ITestResult result) 
		{
			if (result.getStatus() == ITestResult.FAILURE)
			{
				System.out.println("Failed!");
				System.out.println("Taking Screenshot....");
				Helper.captureScreenshot(driver, result.getName());
			}
		}
	

	




}
