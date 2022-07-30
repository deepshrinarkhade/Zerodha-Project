package Test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pojo.ChromeBrowser;
import pom.PerformBuyButton;
import utility.ExcelSheet;

public class ActionPerformBuy {

		WebDriver driver;
		@BeforeMethod
		public void loginToZerodha() throws IOException, InterruptedException
		{
			driver=ChromeBrowser.openBrowser();

			PerformBuyButton ZerodhaLoginPage=new PerformBuyButton(driver);
			String title=driver.getTitle();
			
		//	SoftAssert soft=new SoftAssert();
			//soft.assertEquals(title,"Dashboard/kite");
			
			
		String user=ExcelSheet.getdata("Sheet1",0,0);
			String id=ExcelSheet.getdata("Sheet1",1,0);
			String pin=ExcelSheet.getdata("Sheet1",2,0);
			ZerodhaLoginPage.UserId(user);
			ZerodhaLoginPage.Password(id);
			ZerodhaLoginPage.submit();
			Thread.sleep(3000);
			ZerodhaLoginPage.EnterPin(driver,pin);
			ZerodhaLoginPage.ClickOnContinue();
			//soft.assertAll();
		}
		@Test
		
		public void searchStockAndClickOnBuy() throws InterruptedException
		{
			PerformBuyButton zerodhaHomePage=new PerformBuyButton(driver);
			Thread.sleep(2000);
			zerodhaHomePage.searchStock("Tata");
			zerodhaHomePage.selectStockFromSearchList(driver, "TATAMOTORS");
			zerodhaHomePage.inputOnQuantity("3");
			zerodhaHomePage.clickOnMarket();
			zerodhaHomePage.clickOnStoploss();
			zerodhaHomePage.clickOnMoreOption();
		}
		/*@Test
		public void searchStock()
		{
			ZerodhaHomePage ZerodhaHomePage= new ZerodhaHomePage(driver);
			ZerodhaHomePage.searchStock("tata");
			int size=ZerodhaHomePage.getSearchListSize();
			Assert.assertTrue(size>0);//hard assert to stop the assert
			ZerodhaHomePage.selectStockFromSearchList(driver, "TATAMOTORS");
			
		}*/
		
	}


