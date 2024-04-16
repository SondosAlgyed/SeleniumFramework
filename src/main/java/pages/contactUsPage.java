package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class contactUsPage extends PageBase{

	public contactUsPage(WebDriver driver) {
		super(driver);
	}


	WebElement nametxtBox=driver.findElement(By.id("FullName"));

	WebElement EmailtxtBox=driver.findElement(By.id("Email"));
	

	WebElement submitbutton=driver.findElement(By.name("send-email"));
	

	WebElement Enquiry=driver.findElement(By.id("Enquiry"));
	

	public WebElement successmessage=driver.findElement(By.cssSelector("div.result"));
	
	
	public void userCanContactUs(String name,String Email ,String enquiry)
	{
		sendText(EmailtxtBox, Email);
		sendText(nametxtBox, name);
		sendText(Enquiry, enquiry);
		clickButton(submitbutton);
	}


}
