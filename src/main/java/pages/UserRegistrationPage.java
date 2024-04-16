package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserRegistrationPage extends PageBase{

	//constructor must be exist to inheritance 
	public UserRegistrationPage(WebDriver driver) 
	{
		super(driver);

	}

	WebElement genderRadioButton= driver.findElement(By.id("gender-male"));

	WebElement FirstnameTxtBox= driver.findElement(By.id("FirstName"));

	WebElement LastnameTxtBox= driver.findElement(By.id("LastName"));

	WebElement EmailtxtBox= driver.findElement(By.id("Email"));

	WebElement PasswordTxtBox= driver.findElement(By.id("Password"));

	WebElement ConfirmPasswordTxtBox= driver.findElement(By.id("ConfirmPassword"));

	WebElement registerButton= driver.findElement(By.id("register-button"));;

	 public WebElement seccessmessage= driver.findElement(By.cssSelector("div.result"));

	public WebElement logout=driver.findElement(By.cssSelector("a.ico-logout"));
	
    WebElement myaccountlink= driver.findElement(By.linkText("My account"));
    
	public void  userRegestiration(String firstName ,String lastNmae,String Email,String password)
	{
		//1-
		clickButton(genderRadioButton);
		//2-
	   sendText(FirstnameTxtBox, firstName);
		//3-
		sendText(LastnameTxtBox, lastNmae);
		//4-
		sendText(EmailtxtBox, Email);
		//5-
		sendText(PasswordTxtBox, password);
		//6-
		sendText(ConfirmPasswordTxtBox,password);
		//7-
		clickButton(registerButton);


	}

	public void userLogout()
	{
		clickButton(logout);
	}
	
	public void openMyaccountPage ()
	{
		clickButton(myaccountlink);
	}















}

