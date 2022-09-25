package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserLoginPage extends PageBase {

	public UserLoginPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "Email")
	WebElement EmailtxtBox;

	@FindBy(id = "Password")
	WebElement PasswordltxtBox;

	@FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")
	WebElement loginbtn;

	public void Userlogin (String email,String password)
	{
		sendText(EmailtxtBox, email);
		sendText(PasswordltxtBox, password);
		clickButton(loginbtn);

	}


}

