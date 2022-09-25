package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class Searchpage extends PageBase {

	public Searchpage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id ="small-searchterms")
	WebElement searchtxtBox;
	
	@FindBy(css="button.button-1.search-box-button")
	WebElement serchButton;
	
	@FindBy(id="ui-id-1") 
	//find list type of it (webelement)
	List<WebElement> productList;
	
	@FindBy(css="h2.product-title")
	WebElement producttitle;
	
	
	
//	Select select = new Select(productList);
	public void ProductSearch(String productName)
	{
		sendText(searchtxtBox, productName);
		clickButton(serchButton);
		
	}
	
	public void OpenProductDetailsPage()
	{
		clickButton(producttitle);
	}
	
	public void productSearchusingAutoSuggest(String Productname)
	{
		sendText(searchtxtBox, Productname);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		productList.get(0).click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

