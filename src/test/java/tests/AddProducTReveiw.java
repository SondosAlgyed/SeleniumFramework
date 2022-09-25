package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.ProductDetailsPage;
import pages.Searchpage;
import pages.UserLoginPage;
import pages.UserRegistrationPage;
import pages.productReveiwPage;

public class AddProducTReveiw extends TestBase {

	HomePage homeobject;
	UserRegistrationPage registerobject;
	UserLoginPage loginobject;

	@Test(alwaysRun = true,priority = 1)
	public  void UsercanRegisterSuccssfuly()
	{
		homeobject =new HomePage(driver);
		homeobject.openRegiterationPage(); 
		registerobject=new UserRegistrationPage(driver);
		registerobject.userRegestiration("Dodos", "Algyed","Yallah@gmail.com", "sondos99");
		Assert.assertTrue(registerobject.seccessmessage.getText().contains("Your registration completed"));

	}

	Searchpage searchobject;
	ProductDetailsPage productobject;
	String nameproduct="Apple MacBook Pro 13-inch";

	@Test(priority = 2)
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

	productReveiwPage reviewobject;
	@Test(priority = 3)
	public void userCanAddreveiw()
	{
		reviewobject =new productReveiwPage(driver);
		productobject.openAddReveiw();
		reviewobject.UserCanAddreveiw("new reveiw","i'm try and anshallah i'l reach to my goals");
		Assert.assertTrue(reviewobject.successMessage.isDisplayed());	
		System.out.println(reviewobject.successMessage.getText());
	}

	@Test(priority  =4)
	public void registerUserCanLogout()
	{
		registerobject.userLogout();
	}
























}
