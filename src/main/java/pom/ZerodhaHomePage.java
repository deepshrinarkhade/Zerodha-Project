package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaHomePage {
	@FindBy (xpath="//input[@type='text']") private WebElement search;
	@FindBy (xpath="//button[@data-balloon='Buy']") private WebElement buy  ;
	@FindBy (xpath="//span[@class='tradingsymbol']") private List<WebElement> stock;
	////*[@class='button-blue buy']
////input[@icon='search']
	////span[@class='tradingsymbol']
		public ZerodhaHomePage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		public void searchStock(String stockname)
		{
			search.sendKeys(stockname);
		}
		
		public void selectStockFromSearchList(WebDriver driver,String nameofStock)
		{
			
			for (int i=0;i<stock.size();i++)
			{
				WebElement currentStock=stock.get(i);
				String name =currentStock.getText();
			if(name.equals(nameofStock))
			{
				Actions actions=new Actions(driver);
				actions.moveToElement(currentStock);
				
				actions.perform();
				buy.click();
				
			}
			}
		}////button[@data-balloon='Buy']
	//	public int getSearchListSize() {
			// TODO Auto-generated method stub
			
		}
			//class="button-blue buy"
////span[text()='TATAMOTORS']