package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class productReveiwPage extends PageBase{

	public productReveiwPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id="AddProductReview_Title")
	WebElement ReviewtitleTxtBox;
	
	@FindBy(id="AddProductReview_ReviewText")
	WebElement ReviewtextBox;
	
	@FindBy(id="addproductrating_3")
	WebElement checkBoxRating;
	
	@FindBy(name="add-review")
	WebElement submiteview;
	
	@FindBy(css="div.review-title")
	public WebElement successMessage;
	
	public void UserCanAddreveiw(String title ,String review)
	{
		sendText(ReviewtitleTxtBox, title);
		sendText(ReviewtextBox, review);
		clickButton(checkBoxRating);
		clickButton(submiteview);
	}
	
	
	
}
