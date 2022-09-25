package Steps;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CartPage;
import pages.CheckOutPage;
import pages.HomePage;
import pages.OrderDetaisPage;
import pages.ProductDetailsPage;
import pages.Searchpage;
import pages.UserRegistrationPage;
import tests.TestBase;

public class E2Etests extends TestBase {
	 	HomePage homeObject;
	    UserRegistrationPage registerObject ;
	    Searchpage searchobject;
		ProductDetailsPage productobject;
		CartPage CartObject;
		CheckOutPage checkoutobject;
		OrderDetaisPage orderobject;
		
	    @Given("user is on home page")
	    public void TheUserInhomePage() throws InterruptedException 
	    {
	        Assert.assertTrue(driver.getCurrentUrl().contains("demo.nopcommerce.com")); 
	        Thread.sleep(2000);
	    }

	    @When("he search for {string}")
	    public void he_search_for_product (String productNmae)
	    {
	    	searchobject =new Searchpage(driver);
			searchobject.productSearchusingAutoSuggest(productNmae);
			productobject =new ProductDetailsPage(driver);
	    }

	    @When("choose by two items")
	    public void choose_by_two_items() throws InterruptedException
	    {
	    	Thread.sleep(2000);
	    	CartObject=new CartPage(driver);
			productobject.userCanAddproductToCart();
			driver.navigate().to("https://demo.nopcommerce.com/cart");
			CartObject.checkoutproductpage();
	    }
	    
	    @When("moves to checkout cart and enter personal details on checkout page and place the order")
	    public void moves_to_checkout_cart_and_enter_personal_detail_on_checkou_page_and_place_the_order() throws InterruptedException
	    {
	    	checkoutobject=new CheckOutPage(driver);
			checkoutobject.gotocheckoutpageAsGuest();
			checkoutobject.BillingAdressAsGuest("sondos", "algyed", "dodo2@gmail.com");
			checkoutobject.Billingaddress("Assuit","manqbad","010263","4565");
			checkoutobject.Shippingaddress();
			checkoutobject.payment();
			checkoutobject.paymentcontioue();
			checkoutobject.confirmPage();
			Assert.assertTrue(checkoutobject.thankyouLabel.isDisplayed());
	    }

	    @Then("he can view the order and download the invoice")
	    public void he_can_view_the_order_and_downloa_the_invoice() throws InterruptedException
	    {
	    	checkoutobject.orderDetaisPage();
			orderobject=new OrderDetaisPage(driver);
			orderobject.printorderDetais();
			orderobject.DownloadpdfDetais();
	    }

}
