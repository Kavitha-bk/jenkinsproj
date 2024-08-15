package demo;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HtmldropdownSorted {
	@Test

	public void htmlSort() 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		//driver.get("file:///D:/html/statesselenium.html");
		List<String> expectedOptn = Arrays.asList("karnataka", "kerala","TamilNadu");
		List<String> actualoptn = Arrays.asList("karnataka", "kerala","TamilNadu");
		Assert.assertEquals(actualoptn, expectedOptn,"options are not sorted");
		Assert.assertTrue(expectedOptn.containsAll(actualoptn));
		System.out.println("Options are sorted");
		driver.quit();

	}
	

}
