package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class productReveiwPage extends PageBase{

	public productReveiwPage(WebDriver driver) {
		super(driver);
	}


	WebElement ReviewtitleTxtBox=driver.findElement(By.id("AddProductReview_Title"));
	

	WebElement ReviewtextBox=driver.findElement(By.id("AddProductReview_ReviewText"));
	

	WebElement checkBoxRating=driver.findElement(By.id("addproductrating_3"));
	

	WebElement submiteview=driver.findElement(By.name("add-review"));
	

	public WebElement successMessage= driver.findElement(By.cssSelector("div.review-title"));
	
	public void UserCanAddreveiw(String title ,String review)
	{
		sendText(ReviewtitleTxtBox, title);
		sendText(ReviewtextBox, review);
		clickButton(checkBoxRating);
		clickButton(submiteview);
	}
	
	
	
}
