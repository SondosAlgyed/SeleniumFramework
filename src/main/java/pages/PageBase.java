package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PageBase {
	
	protected WebDriver driver;
	public  JavascriptExecutor jse;
	public Select select ;
	public Actions action;
	
	//create constructor
	public  PageBase(WebDriver driver)
	{

			PageFactory.initElements(driver, this);
	}
	
	protected  static void clickButton(WebElement Button)
	{
			Button.click();
	}
	protected static void sendText(WebElement txt, String value)
	{
	    txt.sendKeys(value);
	}

	public void ScrolltoButtom()
	{
		jse.executeScript( "scrollBy(0,2500)" );
	}
	public void ClearTxt(WebElement value)
	{
		value.clear();
	}


}
