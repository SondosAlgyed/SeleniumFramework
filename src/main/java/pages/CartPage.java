package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends PageBase{

	public CartPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(css="h1")
	public WebElement header;
	@FindBy(css="div.no-data")
	public WebElement resultMassage;
	
	@FindBy(css="button.remove-btn")
	WebElement removeButton;
	
	@FindBy(xpath ="//*[@id=\"updatecart\"]")
	WebElement updateButton;
	
	@FindBy(xpath ="//*[@id=\"itemquantity11220\"]")
	WebElement quntityTxt;
	
	@FindBy(css="span.product-subtotal")
	public WebElement TotalLabel;
	
	@ FindBy(id="checkout")
	WebElement CheckOutButton;
	@FindBy(id="termsofservice")
	WebElement AgreecheckoutBox;
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
