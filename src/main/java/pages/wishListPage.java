package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class wishListPage extends PageBase{

	public wishListPage(WebDriver driver) {
		super(driver);
	}
@FindBy(css ="a.product-name")
WebElement productCell;

@FindBy(css = "h1")
public WebElement wishlistHeader;

@FindBy(id = "updatecart")
WebElement updatewishListButton;

@FindBy(css= "button.remove-btn")
WebElement removeFromCartcheck;

@FindBy(css= "div.no-data")
public WebElement EmptyCartlbl ;

public void removeproductFromCart()
{
	clickButton(removeFromCartcheck);
	//clickButton(updatewishListButton);
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

