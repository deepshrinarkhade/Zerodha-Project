package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class PageObjectModuleClass {

	 
		@FindBy (xpath="//input[@id=\"userid\"]") private WebElement id;
		@FindBy (xpath="//input[@id=\"password\"]") private WebElement password;
		@FindBy (xpath="//button[@type=\"submit\"]") private WebElement submit;
		@FindBy (xpath="//input[@id=\"pin\"]") private WebElement pin;
		@FindBy (xpath="//*[@class=\"button-orange wide\"]") private WebElement login;
		@FindBy (xpath="//a[text()='Forgot user ID or password?']") private WebElement forgot;
		@FindBy (xpath="//button[@type=\"submit\"]") private WebElement clickContinue;
	public  PageObjectModuleClass (WebDriver driver)
	{
		PageFactory. initElements(driver,this);
	}
	public void UserId(String user)
	{
		id.sendKeys(user);
	}	
	public void Password(String pass)
	{
		id.sendKeys(pass);
	}
	public void pin (String p)
	{
		
	pin.sendKeys(p);
	}
	public void Login()
	{
		login.click();
	}
	
	public void ForgotPassword()
	{
		forgot.click();
		
		
	}
	public void clickOnContinue()
	{
		clickContinue.click();
	}
	public void submit() {
		submit.click();
		
	}
	

}
