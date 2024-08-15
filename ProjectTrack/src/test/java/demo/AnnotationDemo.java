package demo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationDemo {
	@BeforeSuite
	public void beforesuite()
	{
		System.out.println("Before suite");
	}
	@BeforeClass
	
	public void beforeclass()
	{
		System.out.println("Before class");
	}
@BeforeTest
public void beforetest()
{
	System.out.println("Before test");
}
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("Before Method");
	}
	
	@Test
	public void test1()
	{
		System.out.println("Am writing testscript here");

	}
	
	@AfterSuite
	public void aftersuite()
	{
		System.out.println("after suite");
	}
	@AfterClass
	
	public void afterclass()
	{
		System.out.println("after class");
	}
@AfterTest
public void aftertest()
{
	System.out.println("after test");
}
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("Before Method");
	}
	
	
}
