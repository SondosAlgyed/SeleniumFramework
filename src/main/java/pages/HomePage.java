package pages;
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

	@FindBy(linkText = "Register")
	WebElement registerLink;
	public void openRegiterationPage()
	{
		clickButton(registerLink);
	}

	@FindBy(linkText = "Log in")
	WebElement loginLonk;
	public void openLoginPage()
	{
		clickButton(loginLonk);
	}

	@FindBy(linkText = "Contact us")
	WebElement contactusPage;
	public void opencontactusPage()
	{
		//call method in pagebase
		ScrolltoButtom();
		clickButton(contactusPage);
	}

	@FindBy(id="customerCurrency")                                     
	WebElement cuencyList;
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

	@FindBy(linkText ="Computers ")                                     
	WebElement Computersmenue ;
	
	@FindBy(linkText ="Notebooks")                                     
	WebElement Notebooks  ;
	
	public void SelectNoteBooksMenue() throws InterruptedException
	{
		Thread.sleep(2000);
	   action.moveToElement(Computersmenue). moveToElement(Notebooks).click().build().perform();
		
	}
	



















}
