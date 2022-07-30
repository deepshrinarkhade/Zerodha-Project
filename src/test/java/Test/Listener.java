package Test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import utility.ScreenShot;

public class Listener extends BaseTest implements ITestListener
{
	//	BaseTest.driver=ChromeBrowser.openBrowser();
	public void onTestStart(ITestResult result)
	{
		System.out.println("Test has Started"+result.getName());
	}
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("Test passed" + result.getName());
	}
	public void onTestFailure(ITestResult result)
	{
		try
		{
			
			ScreenShot.takeScreenShot(driver,result.getName());
			
		}catch(IOException e)
		{
			e.printStackTrace();
			
		}
		//System.out.println("Test is fail");
	}
	public void onTestSkipped(ITestResult result)
	{
		System.out.println("Test Skipped"+result.getName());
	}
	public void onFinish(ITestContext result) {
		System.out.println("Test is finish");
	}

}
