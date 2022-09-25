package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.UserLoginPage;
import pages.UserRegistrationPage;

public class UserRegistrationWihDDTandDataProvider extends TestBase {

	HomePage homeobject;
	UserRegistrationPage registerobject;
	UserLoginPage loginobject;

	@DataProvider(name = "testData")
	public static Object [ ][ ] userData()
	{
		return new Object[ ][ ] {

			{"sondos","Algyed","dodoss@gmail.com","sondos99"},
			{"reem","ali","testy@ggmail.com","123456"}
		};

	}

	@Test(alwaysRun = true,dataProvider = "testData")
	public  void UsercanRegisterSuccssfuly(String FirstName ,String LastName ,String Email,String Password )
	{
		homeobject =new HomePage(driver);
		homeobject.openRegiterationPage(); 
		registerobject=new UserRegistrationPage(driver);
		registerobject.userRegestiration(FirstName,LastName,Email,Password);
		Assert.assertTrue(registerobject.seccessmessage.getText().contains("Your registration completed"));
		registerobject.userLogout();
		homeobject.openLoginPage();
		loginobject=new UserLoginPage(driver);
		loginobject.Userlogin(Email, Password);
		Assert.assertTrue(registerobject.logout.isDisplayed());
		registerobject.userLogout();
	}



}





