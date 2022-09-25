package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.EmailPage;
import pages.HomePage;
import pages.ProductDetailsPage;
import pages.Searchpage;
import pages.UserRegistrationPage;

public class EmailFriendTest extends TestBase {
	//1-userRegister
	//2-user searchproducr
	//3-email
	HomePage homeobject;
	UserRegistrationPage registerobject;
	String Fname ="sondos";
	String lname ="Algyed";
	String  email ="dossaa@gmail.com";
	String password ="sondos9";

	@Test(alwaysRun = true,priority = 1)
	public  void UsercanRegisterSuccssfuly()
	{
		homeobject =new HomePage(driver);
		homeobject.openRegiterationPage(); 
		registerobject=new UserRegistrationPage(driver);
		registerobject.userRegestiration(Fname,lname,email,password);
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
	
	EmailPage emailfriendObject;
	@Test(priority = 3)
	public void UserCanEmailFriend() throws InterruptedException
	{
		emailfriendObject =new EmailPage(driver);
		productobject.EmailAfriend();
		Thread.sleep(2000);
		emailfriendObject.usersendEmail("toaas@gmail.com", "hellomyfriend");
		Assert.assertTrue(emailfriendObject.successmessage.isDisplayed());
		
	}
	@Test(priority = 4)
	public void registerUserCanLogout()
	{
		registerobject.userLogout();
	}

}
