package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class UserLoginPage extends PageBase {

	public UserLoginPage(WebDriver driver) {
		super(driver);
	}

	WebElement EmailtxtBox= driver.findElement(By.id("Email"));

	WebElement PasswordltxtBox=driver.findElement(By.id("Password"));;

	WebElement loginbtn= driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button"));

	public void Userlogin (String email,String password)
	{
		sendText(EmailtxtBox, email);
		sendText(PasswordltxtBox, password);
		clickButton(loginbtn);

	}


}

