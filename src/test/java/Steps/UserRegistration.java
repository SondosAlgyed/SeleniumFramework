package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.HomePage;
import pages.UserRegistrationPage;
import tests.TestBase;

public class UserRegistration extends TestBase {

    HomePage homeObject;
    UserRegistrationPage registerObject ;
    @Given("the user in home page")
    public void TheUserInhomePage() throws InterruptedException {
        homeObject =new HomePage(driver);
        homeObject.openRegiterationPage();
    }

    @When("I click on register link")
    public void IClickOnRegisterLink()
    {
        Assert.assertTrue(driver.getCurrentUrl().contains("register"));
    }

  /*  @When("I entered the user data")
    public void IEnteredTheUserData()
    {
        registerObject=new UserRegistrationPage(driver);
        registerObject.userRegestiration("dodaso","sded","dod@gmail.com","123456");

    }*/
    
    @When("I entered {string}, {string},{string},{string}")
    public void i_entered(String firstname, String lastname, String email, String password) {
    	 registerObject=new UserRegistrationPage(driver);
         registerObject.userRegestiration(firstname,lastname,email,password);
    }

    @Then("the registration page displayed successfully")
    public void theRegistrationPageDisplayed_successfully()
    {
        registerObject.userLogout();
    }




}