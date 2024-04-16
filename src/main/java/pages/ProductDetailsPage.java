package pages;

import org.openqa.selenium.By;
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
	public WebElement  productNameBreadcrum=driver.findElement(By.cssSelector(""));
	 
	@FindBy(css="button.button-2.email-a-friend-button")
	WebElement friendEmail=driver.findElement(By.cssSelector(""));
	
	public void EmailAfriend()
	{
		ScrolltoButtom();
		clickButton(friendEmail);
	}
	

	public WebElement productprcie=driver.findElement(By.cssSelector("span.price.actual-price"));

	 WebElement Addreviewlink=driver.findElement(By.linkText("Add your review"));
	public void openAddReveiw()
	{
		clickButton(Addreviewlink);
	}

	 WebElement wishlistbox=driver.findElement(By.id("add-to-wishlist-button-4"));
	public void openWishlist()
	{
		ScrolltoButtom();
		clickButton(wishlistbox);
	}
	

	public WebElement AddToCompairelistButton=driver.findElement(By.cssSelector("button.button-2.add-to-compare-list-button"));
	public void openAddToCompairelistButton()
	{
		ScrolltoButtom();
		clickButton(AddToCompairelistButton);
	}

	WebElement  AddToCartButton=driver.findElement(By.id("add-to-cart-button-4"));
	public void userCanAddproductToCart()
	{
		ScrolltoButtom();
		clickButton(AddToCartButton);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
