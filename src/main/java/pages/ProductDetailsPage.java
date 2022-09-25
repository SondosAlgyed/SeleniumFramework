package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetailsPage extends PageBase{

	public ProductDetailsPage(WebDriver driver) {
		super(driver);
		jse=(JavascriptExecutor) driver;
	}
	
	@FindBy(css="strong.current-item")
	public WebElement  productNameBreadcrum;
	 
	@FindBy(css="button.button-2.email-a-friend-button")
	WebElement friendEmail;
	
	public void EmailAfriend()
	{
		ScrolltoButtom();
		clickButton(friendEmail);
	}
	
	@FindBy(css="span.price.actual-price")
	public WebElement productprcie;
	
	@FindBy(linkText ="Add your review")
	 WebElement Addreviewlink;
	public void openAddReveiw()
	{
		clickButton(Addreviewlink);
	}
	
	@FindBy(id ="add-to-wishlist-button-4")
	 WebElement wishlistbox;
	public void openWishlist()
	{
		ScrolltoButtom();
		clickButton(wishlistbox);
	}
	
	@FindBy(css="button.button-2.add-to-compare-list-button")
	public WebElement AddToCompairelistButton;
	public void openAddToCompairelistButton()
	{
		ScrolltoButtom();
		clickButton(AddToCompairelistButton);
	}
	
	@FindBy(id="add-to-cart-button-4")
	WebElement  AddToCartButton;
	public void userCanAddproductToCart()
	{
		ScrolltoButtom();
		clickButton(AddToCartButton);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
