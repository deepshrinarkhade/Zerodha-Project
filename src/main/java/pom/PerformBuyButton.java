package pom;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PerformBuyButton {

	@FindBy (xpath="//input[@type='text']") private WebElement search;
	@FindBy (xpath="//button[@data-balloon='Buy']") private WebElement buy  ;
	@FindBy (xpath="//span[@class='tradingsymbol']") private List<WebElement> stock;

	@FindBy (xpath="//input[@id=\"userid\"]") private WebElement id;
	@FindBy (xpath="//input[@id=\"password\"]") private WebElement password;
	@FindBy (xpath="//button[@type=\"submit\"]") private WebElement submit;
	@FindBy (xpath="//input[@id='pin']") private WebElement enterpin;
	@FindBy (xpath="//*[@class=\"button-orange wide\"]") private WebElement login;
	@FindBy (xpath="//a[text()='Forgot user ID or password?']") private WebElement forgot;
	@FindBy (xpath="//button[@class='button-orange wide']") private WebElement clickContinue;
@FindBy(xpath="(//input[@type='number'])[1]")private WebElement quantity;
@FindBy(xpath="(//label[@class='su-radio-label'])[9]")private WebElement market;
@FindBy(xpath="(//span[@class='su-checkbox-box'])[1]")private WebElement stoploss;
@FindBy(xpath="//span[@data-balloon='More options']")private WebElement moreoption;
	public PerformBuyButton(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

public void UserId(String user)
{
	id.sendKeys(user);
}	
public void Password(String pass)
{
	password.sendKeys(pass);
}
public void EnterPin (WebDriver driver,String p)
{
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofMillis(3000));//explicit Wait use
	wait.until(ExpectedConditions.visibilityOf(enterpin));
	enterpin.sendKeys(p);
}
public void Login()
{
	login.click();
}


public void ForgotPassword()
{
	forgot.click();
	
	
}
public void ClickOnContinue()
{
	clickContinue.click();
}
public void submit() {
	submit.click();
	
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
	}
	public void inputOnQuantity(String s)
	
	{
		quantity.sendKeys(s);
	}
	public void clickOnMarket()
	{
		market.click();
	}
	public void clickOnStoploss()
	{
		stoploss.click();
	}
	public void clickOnMoreOption()
	{
		moreoption.click();
	}
}

		