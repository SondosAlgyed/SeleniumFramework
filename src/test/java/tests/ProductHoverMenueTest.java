package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;

public class ProductHoverMenueTest extends TestBase{
       HomePage homeobject;
       @Test
       public void userCanSelectSubcataogry() throws InterruptedException
       {
    	   homeobject =new HomePage(driver);
    	   homeobject.SelectNoteBooksMenue();
    	   Assert.assertTrue(driver.getCurrentUrl().contains("notebooks"));
    	   
       }
}
