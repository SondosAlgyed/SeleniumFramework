package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderDetaisPage extends PageBase{

	public OrderDetaisPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(css ="a.button-2.print-order-button")
	  WebElement printbtn;
	@FindBy(css ="a.button-2.pdf-invoice-button")
	  WebElement pdfbtn ;
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
