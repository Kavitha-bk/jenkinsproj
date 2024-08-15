package demo;

import java.sql.Driver;
import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Validatelogin {

	@Test
	public void loginButtonPresent()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		try
		{
			WebElement loginBtn = driver.findElement(By.name("login"));
			Assert.assertTrue(true);
			System.out.println("Login button is present");
			String actualtextlogin = loginBtn.getText();
			String expectedtext ="Log in";
			Assert.assertEquals(actualtextlogin, expectedtext,"both texts are not matching");
			System.out.println(actualtextlogin);	
		}
		catch(NoSuchElementException e)	
		{
			Assert.fail();
		}
		driver.quit();
	}

}
