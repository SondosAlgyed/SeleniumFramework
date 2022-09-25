package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
//import org.testng.asserts.Assertion;

import pages.ProductDetailsPage;
import pages.Searchpage;


public class SearchProductTest extends TestBase{
	
	Searchpage searchobject;
	ProductDetailsPage productDetailsObject;
	String productName="Apple MacBook Pro 13-inch";
	
	@Test
	public void userCanSearchForProduct()
	{
		searchobject=new Searchpage(driver);
		productDetailsObject =new ProductDetailsPage(driver);
		searchobject.ProductSearch(productName);
		searchobject.OpenProductDetailsPage();
	   // Assert.assertTrue(productDetailsObject.productNameBreadcrum.getText().equalsIgnoreCase(productName) );
		Assert.assertEquals(productDetailsObject.productNameBreadcrum.getText(),productName);
		
	}
	
	

}
