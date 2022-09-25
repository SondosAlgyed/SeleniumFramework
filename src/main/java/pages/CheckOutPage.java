package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;


public class CheckOutPage extends PageBase{

	public CheckOutPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(css ="button.button-1.checkout-as-guest-button")
	WebElement checkoutasGuestButton;
	public void gotocheckoutpageAsGuest()
	{
		clickButton(checkoutasGuestButton);
	}
	@FindBy(id ="BillingNewAddress_FirstName")
	WebElement FirstNametxtbox;
	@FindBy(id ="BillingNewAddress_LastName")
	WebElement LastNametxtbox;
	@FindBy(id ="BillingNewAddress_Email")
	WebElement EmailtxtBox;
	public void BillingAdressAsGuest(String firstname,String lastname,String Email ) throws InterruptedException
	{
		Thread.sleep(2000);
		sendText(FirstNametxtbox, firstname);
		sendText(LastNametxtbox, lastname);
		sendText(EmailtxtBox, Email);
	}
	
	@FindBy(css ="button.button-1.new-address-next-step-button")
	WebElement ContionueButtotonFirst;
	public void goTOShippingaddress()
	{
		clickButton(ContionueButtotonFirst);
	}
	@FindBy(id="BillingNewAddress_CountryId")
	WebElement countryLIst;
	@FindBy(id="BillingNewAddress_City")
	WebElement CityTxtBox;
	@FindBy(id="BillingNewAddress_Address1")
	WebElement AdressTxtBox;

	@FindBy(id="BillingNewAddress_ZipPostalCode")
	WebElement ZipTextBox;

	@FindBy(id ="BillingNewAddress_PhoneNumber")
	WebElement phoneNimberTxtBox;

	@FindBy(xpath  ="//*[@id=\"billing-buttons-container\"]/button[4]")
	WebElement ContionueButton;

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
	@FindBy(id="shippingoption_0")
	WebElement shipingMethodRado;
	@FindBy(css="button.button-1.shipping-method-next-step-button")
	WebElement continueShippingbtn ;
	public void Shippingaddress() throws InterruptedException
	{
		Thread.sleep(2000);
		clickButton(shipingMethodRado);
		clickButton(continueShippingbtn);
	}

	@FindBy(id="paymentmethod_0")
	WebElement PaymentMethodRado;
	@FindBy(css="button.button-1.payment-method-next-step-button")
	WebElement continuePaymentbtn ;
	public void payment() throws InterruptedException
	{
		Thread.sleep(2000);
		clickButton(PaymentMethodRado);
		clickButton(continuePaymentbtn);
	}

	@FindBy(css="button.button-1.payment-info-next-step-button")
	WebElement continuePaymentinformationbtn ;
	public void paymentcontioue() throws InterruptedException
	{
		Thread.sleep(2000);
		clickButton(continuePaymentinformationbtn);
	}

	@FindBy(css="a.product-name")
	WebElement productName;
	@FindBy(css="button.button-1.confirm-order-next-step-button")
	WebElement confirmButton;
	public void confirmPage() throws InterruptedException
	{
		Thread.sleep(2000);
		clickButton(confirmButton);
	}

	@FindBy(css="h1")
	public  WebElement thankyouLabel;
	@FindBy(linkText ="Click here for order details.")
	public  WebElement orderdetails ;
	public void orderDetaisPage() throws InterruptedException
	{
		Thread.sleep(2000);
		clickButton(orderdetails);
	}
	


}
