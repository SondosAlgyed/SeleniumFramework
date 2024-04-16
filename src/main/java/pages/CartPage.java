package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends PageBase{

	public CartPage(WebDriver driver) {
		super(driver);
	}

	public WebElement header=driver.findElement(By.cssSelector("h1"));
	public WebElement resultMassage=driver.findElement(By.cssSelector("div.no-data"));

	WebElement removeButton=driver.findElement(By.cssSelector("div.no-data"));

	WebElement updateButton=driver.findElement(By.xpath("//*[@id=\"updatecart\"]"));
	

	WebElement quntityTxt=driver.findElement(By.xpath("//*[@id=\"itemquantity11220\"]"));

	public WebElement TotalLabel=driver.findElement(By.cssSelector("span.product-subtotal"));
	

	WebElement CheckOutButton=driver.findElement(By.id("checkout"));

	WebElement AgreecheckoutBox=driver.findElement(By.id("termsofservice"));
	public void RemoveProductFromCart()
	{
		clickButton(removeButton);
		//clickButton(updateButton);
	}
	
	public void UpadateProductQuntityCart (String newQuntity) throws InterruptedException
	{
		//clear quntitytxtBox
		ClearTxt(quntityTxt);
		sendText(quntityTxt, newQuntity);
		clickButton(updateButton);
		Thread.sleep(2000);
	}
	public void checkoutproductpage()
	{
		//ScrolltoButtom();
		clickButton(AgreecheckoutBox);
		clickButton(CheckOutButton);
	}



}
