package demo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidateTitle {
	@Test
	public void title()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		String title1 = driver.getTitle();
		 
		Assert.assertEquals(title1, "Google", "title doesnt match");
		if(driver!=null)
		{
			System.out.println("Title="+title1);
			driver.quit();
		}
	}

}
