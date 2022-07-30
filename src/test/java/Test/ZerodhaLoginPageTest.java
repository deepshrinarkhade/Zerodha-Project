package Test;

import java.io.IOException;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import pojo.ChromeBrowser;
import pom.ZerodhaLoginPage;
import utility.ExcelSheet;
@Listeners(Listener.class)

public class ZerodhaLoginPageTest  extends BaseTest
{			
		//	WebDriver driver;
			
			@BeforeMethod
			public void launchBrowser()
			{
				driver =ChromeBrowser.openBrowser();
			}
			@Test
		
			public void loginZerodhaTest() throws IOException, InterruptedException
			{
				ZerodhaLoginPage ZerodhaLoginPage=new ZerodhaLoginPage(driver);
				String user=ExcelSheet.getdata("Sheet1",0,0);
				String id=ExcelSheet.getdata("Sheet1",1,0);
				String pin=ExcelSheet.getdata("Sheet1",2,0);
				ZerodhaLoginPage.UserId(user);
				ZerodhaLoginPage.Password(id);
				ZerodhaLoginPage.submit();
			//Thread.sleep(3000);
				ZerodhaLoginPage.EnterPin(driver,pin);
				ZerodhaLoginPage.ClickOnContinue();
				//ZerodhaLoginPage.ForgotPassword();
			}
	
}
		
				
	


