package Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_class
{
	public static WebDriver driver;
	public static WebDriverWait wait;
	
	@BeforeMethod
	public void openapp() 
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		wait=new WebDriverWait(driver, 10);
		
	}
	
	@AfterMethod
	public void closeapp()
	
	{
	driver.close();
	}
	
}



