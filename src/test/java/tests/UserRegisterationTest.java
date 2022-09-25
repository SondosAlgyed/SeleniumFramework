package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.UserLoginPage;
import pages.UserRegistrationPage;


public class UserRegisterationTest extends TestBase {

	HomePage homeobject;
	UserRegistrationPage registerobject;
	UserLoginPage loginobject;

	@Test(alwaysRun = true)
	public  void UsercanRegisterSuccssfuly()
	{
		homeobject =new HomePage(driver);
		homeobject.openRegiterationPage(); 
		registerobject=new UserRegistrationPage(driver);
		registerobject.userRegestiration("Dodos", "Algyed","yaAllaahaah@gmail.com", "sondos99");
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
		loginobject.Userlogin("yaAllahaah@gmail.com", "sondos99");
		Assert.assertTrue(registerobject.logout.isDisplayed());
	}

	@Test(dependsOnMethods= {"registerUserCanLogin"})
	public void registerUserCanLogoutagain()
	{
		registerobject.userLogout();
	}
























}
