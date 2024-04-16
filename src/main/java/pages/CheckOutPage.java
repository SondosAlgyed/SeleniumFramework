package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;


public class CheckOutPage extends PageBase{

	public CheckOutPage(WebDriver driver) {
		super(driver);
	}

	WebElement checkoutasGuestButton=driver.findElement(By.cssSelector("button.button-1.checkout-as-guest-button"));
	public void gotocheckoutpageAsGuest()
	{
		clickButton(checkoutasGuestButton);
	}

	WebElement FirstNametxtbox=driver.findElement(By.id("BillingNewAddress_FirstName"));

	WebElement LastNametxtbox=driver.findElement(By.id("BillingNewAddress_LastName"));

	WebElement EmailtxtBox=driver.findElement(By.id("BillingNewAddress_Email"));
	public void BillingAdressAsGuest(String firstname,String lastname,String Email ) throws InterruptedException
	{
		Thread.sleep(2000);
		sendText(FirstNametxtbox, firstname);
		sendText(LastNametxtbox, lastname);
		sendText(EmailtxtBox, Email);
	}
	

	WebElement ContionueButtotonFirst=driver.findElement(By.cssSelector("button.button-1.new-address-next-step-button"));
	public void goTOShippingaddress()
	{
		clickButton(ContionueButtotonFirst);
	}

	WebElement countryLIst=driver.findElement(By.id("BillingNewAddress_CountryId"));

	WebElement CityTxtBox=driver.findElement(By.id("BillingNewAddress_City"));

	WebElement AdressTxtBox=driver.findElement(By.id("BillingNewAddress_Address1"));


	WebElement ZipTextBox=driver.findElement(By.id("BillingNewAddress_ZipPostalCode"));


	WebElement phoneNimberTxtBox=driver.findElement(By.id("BillingNewAddress_PhoneNumber"));


	WebElement ContionueButton=driver.findElement(By.xpath("//*[@id=\"billing-buttons-container\"]/button[4]"));

	public void Billingaddress(String CityName,String Adress,String Phone ,String ZIp) throws InterruptedException
	{
		Thread.sleep(2000);
		Select select= new Select(countryLIst);
		select.selectByIndex(3);
		sendText(CityTxtBox, CityName);
		sendText(AdressTxtBox, Adress);
		sendText(ZipTextBox, ZIp);
		sendText(phoneNimberTxtBox, Phone);
		clickButton(ContionueButton);

	}

	WebElement shipingMethodRado=driver.findElement(By.id("shippingoption_0"));

	WebElement continueShippingbtn=driver.findElement(By.cssSelector("button.button-1.shipping-method-next-step-button")) ;
	public void Shippingaddress() throws InterruptedException
	{
		Thread.sleep(2000);
		clickButton(shipingMethodRado);
		clickButton(continueShippingbtn);
	}


	WebElement PaymentMethodRado=driver.findElement(By.id("paymentmethod_0"));

	WebElement continuePaymentbtn =driver.findElement(By.cssSelector("button.button-1.payment-method-next-step-button"));
	public void payment() throws InterruptedException
	{
		Thread.sleep(2000);
		clickButton(PaymentMethodRado);
		clickButton(continuePaymentbtn);
	}


	WebElement continuePaymentinformationbtn=driver.findElement(By.cssSelector("button.button-1.payment-info-next-step-button")) ;
	public void paymentcontioue() throws InterruptedException
	{
		Thread.sleep(2000);
		clickButton(continuePaymentinformationbtn);
	}


	WebElement productName=driver.findElement(By.cssSelector("a.product-name"));

	WebElement confirmButton=driver.findElement(By.cssSelector("button.button-1.confirm-order-next-step-button"));
	public void confirmPage() throws InterruptedException
	{
		Thread.sleep(2000);
		clickButton(confirmButton);
	}

	public  WebElement thankyouLabel=driver.findElement(By.cssSelector("h1"));

	public  WebElement orderdetails=driver.findElement(By.linkText("Click here for order details.")) ;
	public void orderDetaisPage() throws InterruptedException
	{
		Thread.sleep(2000);
		clickButton(orderdetails);
	}
	


}
