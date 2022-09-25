package tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Data.ExelReader;
import pages.HomePage;
import pages.UserLoginPage;
import pages.UserRegistrationPage;


public class UserRegisterationTestWithDDTandExcelFile extends TestBase {

	HomePage homeobject;
	UserRegistrationPage registerobject;
	UserLoginPage loginobject;

	@DataProvider(name="ExcelData")
	public Object[][] userRegisterData() throws IOException
	{
		//get Data from excel Reader Class
		ExelReader Er =new ExelReader();	
		return Er.getExcelData();


	}


	@Test(alwaysRun = true,dataProvider = "ExcelData")
	public  void UsercanRegisterSuccssfuly(String FN,String LN,String Email,String password)
	{
		//3 Iteration
		homeobject =new HomePage(driver);
		homeobject.openRegiterationPage(); 
		registerobject=new UserRegistrationPage(driver);
		registerobject.userRegestiration(FN,LN,Email,password);
		Assert.assertTrue(registerobject.seccessmessage.getText().contains("Your registration completed"));
		
		registerobject.userLogout();
		
		homeobject.openLoginPage();
		loginobject=new UserLoginPage(driver);
		loginobject.Userlogin(Email, password);
		Assert.assertTrue(registerobject.logout.isDisplayed());
		
		registerobject.userLogout();
		
	}

}
