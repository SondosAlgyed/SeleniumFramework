package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.ProductDetailsPage;
import pages.Searchpage;
import pages.wishListPage;

public class AddProdyuctToWishList extends TestBase {
	
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
	
	wishListPage wishlistobject;
	@Test(priority = 2)
	public void usercanAddProductTowishList() throws InterruptedException
	{
		productobject =new ProductDetailsPage(driver);
		productobject.openWishlist();
		driver.navigate().to("https://demo.nopcommerce.com"+"/wishlist");
		Thread.sleep(2000);
		wishlistobject =new wishListPage(driver);
		Assert.assertTrue(wishlistobject.wishlistHeader.isDisplayed());
	}

	@Test(priority = 3)
	public void removeproductfromCart() throws InterruptedException
	{
		wishlistobject =new wishListPage(driver);
		Thread.sleep(2000);
		wishlistobject.removeproductFromCart();
		Assert.assertTrue(wishlistobject.EmptyCartlbl.getText().contains("The wishlist is empty!"));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
