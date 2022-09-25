package pages;


import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class compareProductPage extends PageBase {

	public compareProductPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(css="table.compare-products-table")
	WebElement table;
	@FindBy(tagName = "tr")
	public List<WebElement> allRows;
	@FindBy(tagName = "td")
	public List<WebElement> allColmous;
	@FindBy(css="h1")
	WebElement comparelistHeader;

	@FindBy(css = "div.no-data")
	WebElement result;
	
	@FindBy(css="a.clear-list")
	WebElement clearlistButton;
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
	@FindBy(linkText = "Asus N551JK-XO076H Laptop")
	public WebElement NameSecondproduct;
	
	@FindBy(linkText = "Apple MacBook Pro 13-inch")
	public WebElement NameFirstproduct;
	












}
