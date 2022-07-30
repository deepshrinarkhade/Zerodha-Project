package Test;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pojo.ChromeBrowser;
import pom.ForgottenPasswordPage;
import pom.ZerodhaLoginPage;
import utility.ExcelSheet;

public class ZerodhaForgotPassword {
	WebDriver driver;
	@BeforeMethod
	public void launchBrowser()
	{
		driver=ChromeBrowser.openBrowser();
	}
	@Test
	public void ForgottenPassword() throws IOException, InterruptedException
	{
		ForgottenPasswordPage ForgottenPasswordPage=new ForgottenPasswordPage(driver);
		
		String user=ExcelSheet.getdata("Sheet1", 0, 0);
		String pass=ExcelSheet.getdata("Sheet1", 1, 0);
		String pin=ExcelSheet.getdata("Sheet1", 2, 0);
		
		ForgottenPasswordPage.enterEmail(user);
		ForgottenPasswordPage.enterPassword(pass);
		ForgottenPasswordPage.clickSubmit();

		Thread.sleep(2000);
		
		ForgottenPasswordPage.enterPin(pin);
		ForgottenPasswordPage.clickOnForgotPassword();
		Thread.sleep(3000);
		
		//ForgottenPasswordPage.RememberMyuserId();
		//Thread.sleep(3000);
		//ForgottenPasswordPage.enterUserId("sdac345");
		//ForgottenPasswordPage.enterEmailIdAccount("asder1234@gmail.com");
	
		ForgottenPasswordPage.ForgotMyUserId();						
		ForgottenPasswordPage.enterPanNo("123456789");
		ForgottenPasswordPage.clickOnSms();
		ForgottenPasswordPage.enterMobileNO("9876543210");
		//Thread.sleep(3000);
		//ForgottenPasswordPage.clickOnReset();
		
		ForgottenPasswordPage.clickDontHaveAnAccount();
		Set<String> handles=driver.getWindowHandles();//clild browser handles use
		Iterator<String> i=handles.iterator();
		String parentid=i.next();
		String childid=i.next();
		driver.switchTo().window(childid);
		Thread.sleep(4000);
		ForgottenPasswordPage.enterTenDigitMoNo("8921347658");
		ForgottenPasswordPage.thenClickContinue();
		
		
	}
}	