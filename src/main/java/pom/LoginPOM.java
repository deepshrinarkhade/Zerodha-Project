package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPOM 
{

	@FindBy (xpath="//input[@id=\"userid\"]") private WebElement id;
	@FindBy (xpath="//input[@id=\"password\"]") private WebElement password;
	@FindBy (xpath="//button[@type=\"submit\"]") private WebElement submit;
	@FindBy (xpath="//input[@id='pin']") private WebElement enterpin;
	@FindBy (xpath="//*[@class=\"button-orange wide\"]") private WebElement login;
	@FindBy (xpath="//a[text()='Forgot user ID or password?']") private WebElement forgot;
	@FindBy (xpath="//button[@class='button-orange wide']") private WebElement clickContinue;
	public  LoginPOM (WebDriver driver)
	{
		PageFactory. initElements(driver,this);
	}
	public void clickOnSignUp(String user)	
	{
		id.sendKeys(user);
	}	
	public void clickOnPassword(String pass)
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

}
