package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.UserRegistrationPage;
import pages.contactUsPage;

public class contactUsTest extends TestBase {

	UserRegistrationPage registerobject;
	contactUsPage   contactobject ;
	HomePage          homeobject;
     String name ="sondos";
     String  email ="sondosAlgyed@gmail.com";
     String enquiry ="sondos is boring";
	@Test(priority = 1)
	public void userCanUsecontactUs() throws InterruptedException
	{
		 contactobject =new contactUsPage(driver);
		 homeobject =new HomePage(driver);
		 homeobject.opencontactusPage();
		 contactobject.userCanContactUs(name, email, enquiry);
		 Thread.sleep(2000);
		 Assert.assertTrue(contactobject.successmessage.isDisplayed());
		 
	}

	
}

