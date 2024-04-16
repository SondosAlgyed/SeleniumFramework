package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmailPage extends PageBase{
	 public EmailPage(WebDriver driver) {
		super(driver);
	}

	 WebElement FriendsemailtxtBox= driver.findElement(By.id("FriendEmail"));

	 WebElement MyemailaddresstxBox= driver.findElement(By.id("YourEmailAddress"));

	 WebElement PersonalmessagetxtBox= driver.findElement(By.id("PersonalMessage"));

	 WebElement sendEmailButton=driver.findElement(By.name("send-email")) ;

	public  WebElement successmessage= driver.findElement(By.cssSelector("div.result"));
	 
	 public void usersendEmail(String Friendsemail,String message)
	 {
		 sendText(FriendsemailtxtBox, Friendsemail);
		 sendText(PersonalmessagetxtBox, message);
		 clickButton(sendEmailButton);
		 
	 }
	

}
