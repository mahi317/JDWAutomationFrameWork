package testNG;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testNg 
{
	@BeforeClass
	public void openTheBrowser()
	{
		System.out.println("open the Browser");
	}
	
	@BeforeMethod 
	public void logInToApp()
	{
		System.out.println("logIn From JDW");
	}
	
	@Test
	public void searchProductTest()
	{
		System.out.println("searchProductTest ");
	}
	
	@Test
	public void addproductToBagTest()
	{
		System.out.println("addproductToBagTest");
	}
	
	@Test
	public void writeReviewTest()
	{
		System.out.println("writeReviewTest");
	}
	
	@AfterMethod
	public void logoutFromapp()
	{
		System.out.println("Logout From JDW");
	}
	
	@AfterClass
	public void closeTheBrowser()
	{
		System.out.println("Close the Browser");
	}

}
