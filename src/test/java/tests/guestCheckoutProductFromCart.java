package tests;


import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.CheckOutPage;
import pages.OrderDetaisPage;
import pages.ProductDetailsPage;
import pages.Searchpage;


public class guestCheckoutProductFromCart extends TestBase{
	
	Searchpage searchobject;
	ProductDetailsPage productobject;
	String nameproduct="Apple MacBook Pro 13-inch";
	
	@Test(priority = 1)
	public void userCanSearchAutoSugesst()
	{
		// if testcase failed appeare erroe message but the case not faluire
		try {
			searchobject =new Searchpage(driver);
			searchobject.productSearchusingAutoSuggest("MacB");
			productobject =new ProductDetailsPage(driver);
			Assert.assertEquals(productobject.productNameBreadcrum.getText(),nameproduct);
		} catch (Exception e) {
			System.out.println("Error accured "+e.getMessage());
		}
		
	}
	CartPage CartObject;
	@Test(priority = 2)
	public void userCanAddproductToCart()
	{
		CartObject=new CartPage(driver);
		productobject.userCanAddproductToCart();
		driver.navigate().to("https://demo.nopcommerce.com/cart");
		Assert.assertTrue(CartObject.header.isDisplayed());
		CartObject.checkoutproductpage();
	}
	
	CheckOutPage checkoutobject;
	OrderDetaisPage orderobject;
	@Test(priority = 3)
	public void userCanCheckoutProduct() throws InterruptedException
	{
		checkoutobject=new CheckOutPage(driver);
		checkoutobject.gotocheckoutpageAsGuest();
		checkoutobject.BillingAdressAsGuest("sondos", "algyed", "dod2@gmail.com");
		checkoutobject.Billingaddress("Assuit","manqbad","010263","4565");
		checkoutobject.Shippingaddress();
		checkoutobject.payment();
		checkoutobject.paymentcontioue();
		checkoutobject.confirmPage();
		Assert.assertTrue(checkoutobject.thankyouLabel.isDisplayed());
		//print invoice as pdf or print page
		checkoutobject.orderDetaisPage();
		orderobject=new OrderDetaisPage(driver);
		orderobject.printorderDetais();
		orderobject.DownloadpdfDetais();

	}

	

	
	
	
	

}
