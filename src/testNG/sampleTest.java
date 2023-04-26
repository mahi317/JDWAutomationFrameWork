package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class sampleTest 
{
	@BeforeGroups(groups= {"SmokeTest"})
	public void beforeGroupTest()
	{
		System.out.println("beforeGroupTest");
	}
	
	@AfterGroups(groups= {"SmokeTest"})
	public void afterGroupTest()
	{
		System.out.println("afterGroupTest");
	}
	
	@Test(groups= {"SmokeTest","RegressionTest"})
	public void searchProductTest()
	{
		System.out.println("searchProductTest");
	}
	
	@Test(groups= {"SmokeTest"})
	public void addProductToBagTest()
	{
		System.out.println("addProductToBagTest");
	}
	
	@Test(groups= {"RegressionTest"})
	public void writeReviewTest()
	{
		System.out.println("writeReviewTest");
	}

}
