package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.ProductDetailsPage;
import pages.Searchpage;
import pages.compareProductPage;

public class AddProductTocompairTest extends TestBase{
	compareProductPage compareobject;
	Searchpage searchobject;
	ProductDetailsPage productobject;
	String nameFirstproduct="Apple MacBook Pro 13-inch";
	String nameSecondProduct="Asus N551JK-XO076H Laptop";

	@Test(priority = 1)
	public void userCanSearchAutoSugesst() throws InterruptedException
	{
		searchobject =new Searchpage(driver);
		productobject =new ProductDetailsPage(driver);
		compareobject = new compareProductPage(driver);

		searchobject.productSearchusingAutoSuggest("MacB");
		Assert.assertEquals(productobject.productNameBreadcrum.getText(),nameFirstproduct);
		productobject.openAddToCompairelistButton();
        
		searchobject.productSearchusingAutoSuggest("Asus");
		Assert.assertEquals(productobject.productNameBreadcrum.getText(),nameSecondProduct);
		productobject.openAddToCompairelistButton();
		driver.navigate().to("https://demo.nopcommerce.com/compareproducts");
		Assert.assertTrue(compareobject.NameFirstproduct.getText().equals("Apple MacBook Pro 13-inch"));
		Assert.assertTrue(compareobject.NameSecondproduct.getText().equals("Asus N551JK-XO076H Laptop"));
	
		compareobject.compareProducts();
		
	}



	@Test(priority = 2)
	public void usercanClearCompairList()
	{

		compareobject.clearCompareList();

	}





























}
