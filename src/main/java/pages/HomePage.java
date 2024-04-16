package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends PageBase {

	public HomePage(WebDriver driver) {
		super(driver); 
		//for Scroll buttom
		jse=(JavascriptExecutor) driver;
       action =new Actions(driver);
	}


	WebElement registerLink=driver.findElement(By.linkText("Register"));
	public void openRegiterationPage()
	{
		clickButton(registerLink);
	}

	WebElement loginLonk=driver.findElement(By.linkText("Log in"));
	public void openLoginPage()
	{
		clickButton(loginLonk);
	}

	WebElement contactusPage=driver.findElement(By.linkText("Contact us"));
	public void opencontactusPage()
	{
		//call method in pagebase
		ScrolltoButtom();
		clickButton(contactusPage);
	}

	WebElement cuencyList= driver.findElement(By.id("customerCurrency"));
	public void UserCanChangeCurncy()
	{
		select=new Select(cuencyList);
		select.selectByIndex(1);
	}
 /*not true because din't select
	@FindBy(id="customerCurrency")
	List<WebElement> cuencyList;
	public void UserCanChangeCurncy()
	{
		cuencyList.get(1).click();;
	}
*/

	WebElement Computersmenue= driver.findElement(By.linkText("Computers"));

	WebElement Notebooks= driver.findElement(By.linkText("Notebooks"));
	
	public void SelectNoteBooksMenue() throws InterruptedException
	{
		Thread.sleep(2000);
	   action.moveToElement(Computersmenue). moveToElement(Notebooks).click().build().perform();
		
	}
	



















}
