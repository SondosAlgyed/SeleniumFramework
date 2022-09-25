package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.MyAccountPage;
import pages.UserLoginPage;
import pages.UserRegistrationPage;

public class MyAccountTest extends TestBase {
	MyAccountPage accountobject;
	HomePage homeobject;
	UserRegistrationPage registerobject;
     UserLoginPage  loginobject;
     
	String firstname="sondos";
	String lastname="Algyes";
	String Email="rem@gmail.com";
	String password="12354g569";
	String Newpassword="sondos59999";
     
	@Test(priority = 1)
	public  void UsercanRegisterSuccssfuly()
	{
		homeobject =new HomePage(driver);
		homeobject.openRegiterationPage(); 
		registerobject=new UserRegistrationPage(driver);
		registerobject.userRegestiration(firstname,lastname, Email,password);
		Assert.assertTrue(registerobject.seccessmessage.getText().contains("Your registration completed"));
	}

	@Test(priority = 2)
	public void registeruserCanChangePassword() throws InterruptedException
	{
	
		accountobject=new MyAccountPage(driver);
		registerobject.openMyaccountPage();
		accountobject.openchangePasswordPage();
		Thread.sleep(2000);
		accountobject.changepassword(password, Newpassword);
		Assert.assertTrue(accountobject.result.isDisplayed());
		
		}
	@Test(priority = 3)
	public void registerUserCanLogout() throws InterruptedException
	{
		Thread.sleep(2000);
		registerobject.userLogout();
	}

	@Test(priority = 4)
	public void registerUserCanLogin() throws InterruptedException
	{
		Thread.sleep(2000);
		homeobject.openLoginPage();
		loginobject=new UserLoginPage(driver);
		loginobject.Userlogin(Email,Newpassword );
		Assert.assertTrue(registerobject.logout.isDisplayed());
	}

	@Test(priority = 5)
	public void registerUserCanLogoutagain()
	{
		registerobject.userLogout();
	}
	
	 
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	




}

