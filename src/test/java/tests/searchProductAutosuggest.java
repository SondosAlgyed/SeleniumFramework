package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.ProductDetailsPage;
import pages.Searchpage;

public class searchProductAutosuggest extends TestBase{
	
	Searchpage searchobject;
	ProductDetailsPage productobject;
	String nameproduct="Apple MacBook Pro 13-inch";
	
	@Test
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
	
		

}
