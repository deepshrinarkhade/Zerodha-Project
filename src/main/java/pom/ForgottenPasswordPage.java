package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgottenPasswordPage {
	

	@FindBy (xpath="//input[@id=\"userid\"]") private WebElement id;
	@FindBy (xpath="//input[@id=\"password\"]") private WebElement password;
	@FindBy (xpath="//button[@type=\"submit\"]") private WebElement submit;
	@FindBy (xpath="//input[@id='pin']") private WebElement enterpin;
	@FindBy (xpath="//input[@placeholder='Mobile number (as on account)']") private WebElement MobileNo;
	@FindBy (xpath="//a[@class='text-light forgot-link']") private WebElement forgot;
	//@FindBy (xpath="//button[@class='button-orange wide']") private WebElement clickContinue;
	@FindBy (xpath="//button[@type='submit']") private WebElement reset;
	@FindBy (xpath="(//label[@class='su-radio-label'])[4]") private WebElement sms;
	@FindBy (xpath="//input[@label='I remember my user ID']") private WebElement rememberId;
	@FindBy (xpath="//input[@placeholder='User ID']") private WebElement userid;
	@FindBy (xpath="(//label[@class='su-radio-label'])[2]") private WebElement forgotId;
	@FindBy (xpath="//input[@placeholder='PAN']") private WebElement Pan;
	@FindBy (xpath="//input[@label='E-mail']") private WebElement Email;
	@FindBy (xpath="//input[@placeholder='E-mail (as on account)']") private WebElement EmailidAcc;
	@FindBy (xpath="//a[text()=\"Don't have an account? Signup now!\"]") private WebElement  signupnow;
	@FindBy (xpath="//input[@placeholder='Your 10 digit mobile number']") private WebElement mono;
	@FindBy (xpath="//button[contains(@id,'open_account')]") private WebElement thenclick;
		public  ForgottenPasswordPage(WebDriver driver) 
		{
			PageFactory.initElements(driver,this);
		}
		public void enterPassword(String p)
		{
			password.sendKeys(p);
		}
		public void enterEmail(String mail)
		{
			id.sendKeys(mail);
			
		}
		public void clickSubmit() {
			
			submit.click();
		}
		public void enterPin(String pin) {
			enterpin.sendKeys(pin);
		}
		public void clickOnForgotPassword()
		{
			forgot.click();
		}
		public void clickOnSms()
		{
			sms.click();
		}
		public void clickOnReset()
		{
			reset.click();
		}
		public void RememberMyuserId()
		{
			
			rememberId.click();
		//	System.out.println(rememberId.isSelected());
		}

		public void ForgotMyUserId()
		{
			forgotId.click();
		}

		public void enterPanNo(String no)
		{
		//	Pan.click();
			Pan.sendKeys(no);
		}

		public void enterEmailIdAccount(String acc)
		{
			EmailidAcc.sendKeys(acc);
		}
		public void clickOnMail()
		{
			Email.click();
		}

		public void enterUserId(String ui)
		{
			//userid.click();
			userid.sendKeys(ui);
		}	
		public void enterMobileNO(String moNo)
		{
			MobileNo.sendKeys(moNo);
		}
		public void clickDontHaveAnAccount()
		{
			signupnow.click();
		}
		public void enterTenDigitMoNo(String enterNo)
		{
			
			mono.sendKeys(enterNo);
		}
		public void thenClickContinue()
		{
			thenclick.click();
		}

	
}
