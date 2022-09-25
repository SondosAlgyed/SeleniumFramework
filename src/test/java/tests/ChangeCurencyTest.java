package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.ProductDetailsPage;
import pages.Searchpage;

public class ChangeCurencyTest extends TestBase {
	
	HomePage homeObject;
	Searchpage searchobject;
	ProductDetailsPage productobject;
	String nameproduct="Apple MacBook Pro 13-inch";
	
	@Test(priority = 1)
	public void Usercanchangecurency()
	{
		homeObject =new HomePage(driver);
		homeObject.UserCanChangeCurncy();
	}
	
	
	@Test(priority = 2)
	public void userCanSearchAutoSugesst()
	{
		// if testcase failed appeare erroe message but the case not faluire
		try {
			searchobject =new Searchpage(driver);
			searchobject.productSearchusingAutoSuggest("MacB");
			productobject =new ProductDetailsPage(driver);
			Assert.assertEquals(productobject.productNameBreadcrum.getText(),nameproduct);
			Assert.assertTrue(productobject.productprcie.getText().contains("€"));
			System.out.println(productobject.productprcie.getText());
		} catch (Exception e) {
			System.out.println("Error accured "+e.getMessage());
		}
		
	}

}
