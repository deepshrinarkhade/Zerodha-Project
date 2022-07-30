package Test;

import java.io.IOException;


import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import pojo.ChromeBrowser;
import pom.LoginPOM;
import pom.ZerodhaLoginPage;
import utility.ExcelSheet;
import utility.Reports;

@Listeners(Listener.class)
public class LoginPage extends BaseTest
	{
		ExtentReports extent;
		ExtentTest test;
					
		@BeforeTest
		public void configureReport()
		{
			extent=Reports.generateReports();
		}
		@BeforeMethod
		public void launchBrowser()
		{
			driver =ChromeBrowser.openBrowser();
		}
		@Test
		
		public void loginZerodhaTest() throws InterruptedException, IOException 
		{	test=extent.createTest("loginZerodhaTest");
			ZerodhaLoginPage ZerodhaLoginPage=new ZerodhaLoginPage(driver);
			String user=ExcelSheet.getdata("Sheet1",0,0);
			String id=ExcelSheet.getdata("Sheet1",1,0);
			String pin=ExcelSheet.getdata("Sheet1",2,0);
			ZerodhaLoginPage.UserId(user);
			ZerodhaLoginPage.Password(id);
			ZerodhaLoginPage.submit();
			Thread.sleep(3000);
			ZerodhaLoginPage.EnterPin(driver,pin);
			ZerodhaLoginPage.ClickOnContinue();
						//ZerodhaLoginPage.ForgotPassword();
		}
			
		
		@Test
		public void verifySignUpFeature()
		{
			test=extent.createTest("verifySignUpFeature");
			LoginPOM loginPOM=new LoginPOM(driver);
			loginPOM.clickOnSignUp("qweasd");
		}
		@Test
		public void ForgotPasswordTest()
		{
			test= extent.createTest("ForgotPasswordTest");
			LoginPOM loginPOM=new LoginPOM(driver);
			loginPOM.clickOnPassword("12345");
		}
		@AfterMethod
		public void PostExecution(ITestResult result)
		{
			if(result.getStatus()==ITestResult.SUCCESS)
			{
				test.log(Status.PASS, result.getName());
			}
			else
			{	
				if(result.getStatus()==ITestResult.FAILURE)
					{
					test.log(Status.FAIL, result.getName());
					
					}
					else
					{
						test.log(Status.SKIP,result.getName());
					}
			}
		}
		@AfterTest
		public void PublishRepord()
		{
			extent.flush();
		}
				
	}
						
			




