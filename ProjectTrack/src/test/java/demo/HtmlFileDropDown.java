package demo;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HtmlFileDropDown {

	
	@Test

	public void htmlDrop_Down() 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("file:///D:/html/statesselenium.html");
		WebElement selectstates = driver.findElement(By.id("states"));
		Select s=new Select(selectstates);
		s.selectByVisibleText("kerala");
		List<String> expectedOptn = Arrays.asList("karnataka", "kerala","TamilNadu");
		List<String> actualoptn = Arrays.asList("karnataka", "kerala","TamilNadu");
		Assert.assertEquals(actualoptn, expectedOptn);
		System.out.println(actualoptn);
		driver.quit();
	}
	

}
