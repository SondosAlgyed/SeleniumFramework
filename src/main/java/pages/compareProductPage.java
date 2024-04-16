package pages;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class compareProductPage extends PageBase {

	public compareProductPage(WebDriver driver) {
		super(driver);
	}

	WebElement table=driver.findElement(By.cssSelector("table.compare-products-table"));
	public List<WebElement> allRows=driver.findElements(By.tagName("tr"));

	public List<WebElement> allColmous=driver.findElements(By.tagName("td"));

	WebElement comparelistHeader=driver.findElement(By.cssSelector("h1"));

	WebElement result= driver.findElement(By.cssSelector("div.no-data"));

	WebElement clearlistButton= driver.findElement(By.cssSelector("a.clear-list"));
	public void clearCompareList()
	{
		clickButton(clearlistButton);
	}

	//TO assure the data apperead
	public void compareProducts()
	{
		//Get All Rows
		System.out.println(allRows.size());
		//Get Data From AllRows
		for(WebElement row : allRows)
		{
			System.out.println(row.getText() +"\t");

			for(WebElement coloum :allColmous)
			{
				System.out.println(coloum.getText()+"\t");
			}
		}
	}

	public WebElement NameSecondproduct=driver.findElement(By.linkText("Asus N551JK-XO076H Laptop"));
	

	public WebElement NameFirstproduct= driver.findElement(By.linkText("Apple MacBook Pro 13-inch"));
	












}
