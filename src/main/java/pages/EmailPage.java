package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmailPage extends PageBase{
	 public EmailPage(WebDriver driver) {
		super(driver);
	}
	 
	 @FindBy(id="FriendEmail")
	 WebElement FriendsemailtxtBox;
	 
	 @FindBy(id="YourEmailAddress")
	 WebElement MyemailaddresstxBox;
	 
	 @FindBy(id="PersonalMessage")
	 WebElement PersonalmessagetxtBox;
	 
	 @FindBy(name="send-email")
	 WebElement sendEmailButton ;
	 
	 @FindBy(css="div.result")
	public  WebElement successmessage;
	 
	 public void usersendEmail(String Friendsemail,String message)
	 {
		 sendText(FriendsemailtxtBox, Friendsemail);
		 sendText(PersonalmessagetxtBox, message);
		 clickButton(sendEmailButton);
		 
	 }
	

}
