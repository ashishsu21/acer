package Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testscript extends Base_class
{
	@Test (dataProvider = "SignupCredentials",dataProviderClass = DataProviderClass.class)
	public void demoqa(String un,String email,String hi)
	{
	wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("email")))).sendKeys(un);
	Reporter.log("username entered");
	
	driver.findElement(By.id("email")).sendKeys(email);
	Reporter.log("Email Entered...", true);
	
	driver.findElement(By.id("pass")).sendKeys(hi);
	Reporter.log("Current pass Entered...", true);
	
	
	driver.findElement(By.name("login")).submit();
	Reporter.log("All the data is submitted...", true);
	
	}
}
