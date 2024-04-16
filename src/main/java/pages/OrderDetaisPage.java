package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderDetaisPage extends PageBase
{

	public OrderDetaisPage(WebDriver driver) {
		super(driver);
	}


	  WebElement printbtn=driver.findElement(By.cssSelector("a.button-2.print-order-button"));

	  WebElement pdfbtn=driver.findElement(By.cssSelector("a.button-2.pdf-invoice-button")) ;
	public void printorderDetais() throws InterruptedException
	{
		Thread.sleep(4000);
		clickButton(printbtn);
	}
	public void DownloadpdfDetais() throws InterruptedException
	{
		Thread.sleep(4000);
		clickButton(pdfbtn);
	}
}
