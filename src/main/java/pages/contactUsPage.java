package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class contactUsPage extends PageBase{

	public contactUsPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id="FullName")
	WebElement nametxtBox;
	
	@FindBy(id="Email")
	WebElement EmailtxtBox;
	
	@FindBy(name ="send-email")
	WebElement submitbutton;
	
	@FindBy(id="Enquiry")
	WebElement Enquiry;
	
	@FindBy(css="div.result")
	public WebElement successmessage;
	
	
	public void userCanContactUs(String name,String Email ,String enquiry)
	{
		sendText(EmailtxtBox, Email);
		sendText(nametxtBox, name);
		sendText(Enquiry, enquiry);
		clickButton(submitbutton);
	}


}
