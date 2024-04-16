package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends PageBase {

	public MyAccountPage(WebDriver driver) {
		super(driver);
	}

	WebElement changepassword=driver.findElement(By.linkText("Change password"));
	public void openchangePasswordPage ()
	{
		clickButton(changepassword);
	}

	WebElement oldPasswordtxtBox=driver.findElement(By.name("OldPassword")) ;

	WebElement newPasswordtxtBox=driver.findElement(By.name("NewPassword"))  ;

	WebElement ConfirmNewPasswordtxtBpx=driver.findElement(By.name("ConfirmNewPassword"))  ;

	WebElement changpasswordButton=driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div/div[2]/form/div[2]/button")) ;

	public WebElement result=driver.findElement(By.cssSelector("p.content"));

	public WebElement signalX= driver.findElement(By.cssSelector("span.close"));

	public void changepassword(String oldpassword,String newpassword)
	{
		sendText(oldPasswordtxtBox, oldpassword);
		sendText(newPasswordtxtBox, newpassword);
		sendText(ConfirmNewPasswordtxtBpx, newpassword);
		clickButton(changpasswordButton);
		clickButton(signalX);
	}






}

