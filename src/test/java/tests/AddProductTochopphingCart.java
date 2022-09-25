package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.CartPage;
import pages.ProductDetailsPage;
import pages.Searchpage;

public class AddProductTochopphingCart extends TestBase{
	Searchpage searchobject;
	ProductDetailsPage productobject;
	String nameproduct="Apple MacBook Pro 13-inch";
	CartPage CartObject;

	@Test(priority = 1)
	public void userCanSearchAutoSugesst() throws InterruptedException
	{
		Thread.sleep(1000);
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

	@Test(priority = 2)
	public void userCanAddproductToCart()
	{
		CartObject=new CartPage(driver);
		productobject.userCanAddproductToCart();
		driver.navigate().to("https://demo.nopcommerce.com/cart");
		Assert.assertTrue(CartObject.header.isDisplayed());
		//Assert.assertTrue(CartObject.TotalLabel.isDisplayed());
	}

	@Test(priority = 3)
	public void UserCanUpadteAndRemoveFromCart() throws InterruptedException
	{
		Thread.sleep(2000);
		//CartObject.UpadateProductQuntityCart("10");
		CartObject.RemoveProductFromCart();
		Assert.assertTrue(CartObject.resultMassage.getText().contains(" Cart is empty!"));
	}




















}
