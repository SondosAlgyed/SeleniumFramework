package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;




public class Searchpage extends PageBase
{

	public Searchpage(WebDriver driver) {
		super(driver);
	}

	WebElement searchtxtBox=driver.findElement(By.id("small-searchterms"));

	WebElement serchButton= driver.findElement(By.cssSelector("button.button-1.search-box-button"));

	//find list type of it (webelement)
	List<WebElement> productList=driver.findElements(By.id("ui-id-1"));

	WebElement producttitle=driver.findElement(By.cssSelector("h2.product-title"));;
	
	
	
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

