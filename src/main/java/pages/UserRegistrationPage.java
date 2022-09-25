package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserRegistrationPage extends PageBase{

	//constructor must be exist to inheritance 
	public UserRegistrationPage(WebDriver driver) 
	{
		super(driver);

	}

	@FindBy(id = "gender-male")
	WebElement genderRadioButton;

	@FindBy(id = "FirstName")
	WebElement FirstnameTxtBox;

	@FindBy(id = "LastName")
	WebElement LastnameTxtBox;

	@FindBy(id = "Email")
	WebElement EmailtxtBox;

	@FindBy(id = "Password")
	WebElement PasswordTxtBox;

	@FindBy(id = "ConfirmPassword")
	WebElement ConfirmPasswordTxtBox;

	@FindBy(id = "register-button")
	WebElement registerButton;
	
	@FindBy(css = "div.result")
	 public WebElement seccessmessage;
	
	@FindBy(css = "a.ico-logout")
	public WebElement logout;
	
    @FindBy(linkText = "My account")
    WebElement myaccountlink;
    
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

