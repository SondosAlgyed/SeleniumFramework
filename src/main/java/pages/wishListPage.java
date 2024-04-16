package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class wishListPage extends PageBase
{

	public wishListPage(WebDriver driver) {
		super(driver);
	}

	WebElement productCell=driver.findElement(By.cssSelector("a.product-name"));

	public WebElement wishlistHeader=driver.findElement(By.cssSelector("h1"));

	WebElement updatewishListButton=driver.findElement(By.id("updatecart"));

	WebElement removeFromCartcheck=driver.findElement(By.cssSelector("button.remove-btn"));


	public WebElement EmptyCartlbl=driver.findElement(By.cssSelector("div.no-data")) ;

	public void removeproductFromCart()
	{
		clickButton(removeFromCartcheck);
		//clickButton(updatewishListButton);
	}




	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

