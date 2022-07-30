package pojo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeBrowser {
	public static WebDriver openBrowser()
	{
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");//
		System.setProperty("webdriver.chrome.driver","D:\\Softwares\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(option);
		
		driver.get("https://kite.zerodha.com/");
		
		driver.manage().window().maximize();
	//	driver.manage().timeouts().implicitlyWait(10000,TimeUnit.MILLISECONDS);//we use the nimplicit wait
		return driver;
		
	}

}
