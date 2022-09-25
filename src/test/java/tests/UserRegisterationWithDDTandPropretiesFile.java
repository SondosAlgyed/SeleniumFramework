package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Data.LoadProperteis;
import pages.HomePage;
import pages.UserLoginPage;
import pages.UserRegistrationPage;


public class UserRegisterationWithDDTandPropretiesFile extends TestBase {

	HomePage homeobject;
	UserRegistrationPage registerobject;
	UserLoginPage loginobject;
	String FN = LoadProperteis.userdata.getProperty("FirstName");
	String LN =LoadProperteis.userdata.getProperty("LastName");
	String email =LoadProperteis.userdata.getProperty("Email");
	String password=LoadProperteis.userdata.getProperty("password");


	@Test(alwaysRun = true)
	public  void UsercanRegisterSuccssfuly()
	{
		System.out.println(LoadProperteis.userdata);
		homeobject =new HomePage(driver);
		homeobject.openRegiterationPage(); 
		registerobject=new UserRegistrationPage(driver);
		registerobject.userRegestiration(FN,LN,email,password);
		Assert.assertTrue(registerobject.seccessmessage.getText().contains("Your registration completed"));

	}

	@Test(dependsOnMethods = {"UsercanRegisterSuccssfuly"})
	public void registerUserCanLogout()
	{
		registerobject.userLogout();
	}

	@Test(dependsOnMethods = {"registerUserCanLogout"})
	public void registerUserCanLogin()
	{
		homeobject.openLoginPage();
		loginobject=new UserLoginPage(driver);
		loginobject.Userlogin(email, password);
		Assert.assertTrue(registerobject.logout.isDisplayed());
	}

	@Test(dependsOnMethods= {"registerUserCanLogin"})
	public void registerUserCanLogoutagain()
	{
		registerobject.userLogout();
	}
























}
