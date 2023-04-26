package testNG;

import javax.annotation.processing.SupportedSourceVersion;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testNG1 
{
	@BeforeTest
	public void initTest()
	{
		System.out.println("Initialize all the classes");
	}
	
	@Test
	public void m1()
	{
		System.out.println("m1 of JDW test");
	}
	@Test
	public void m2 ()
	{
		System.out.println("m2 of JDW test");
	}
	@AfterTest
	public void closeinitTest()
	{
		System.out.println("close all connection");
	}
	@BeforeSuite
	public void createDBconnection()
	{
		System.out.println("DB connection created");
		
	}
	@AfterSuite 
	public void closeDBconnection()
	
	{
		System.out.println("DB connection closed ");
	}
	

}
 