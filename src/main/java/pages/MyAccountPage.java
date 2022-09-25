package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends PageBase {

	public MyAccountPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(linkText = "Change password")
	WebElement changepassword;
	public void openchangePasswordPage ()
	{
		clickButton(changepassword);
	}

	@FindBy(name = "OldPassword")
	WebElement oldPasswordtxtBox ;

	@FindBy(name = "NewPassword")
	WebElement newPasswordtxtBox ;

	@FindBy(name = "ConfirmNewPassword")
	WebElement ConfirmNewPasswordtxtBpx ;

	@FindBy( xpath = "/html/body/div[6]/div[3]/div/div[2]/div/div[2]/form/div[2]/button")
	WebElement changpasswordButton ;

	@FindBy(css ="p.content")
	public WebElement result;
	
	@FindBy(css ="span.close")
	public WebElement signalX;

	public void changepassword(String oldpassword,String newpassword)
	{
		sendText(oldPasswordtxtBox, oldpassword);
		sendText(newPasswordtxtBox, newpassword);
		sendText(ConfirmNewPasswordtxtBpx, newpassword);
		clickButton(changpasswordButton);
		clickButton(signalX);
	}






}

