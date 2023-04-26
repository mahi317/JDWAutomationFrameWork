package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class testNG2 
{
	@Test()
	public void test2()
	{
		System.out.println("Log In to FB");
	}
	
	@Test
	public void test3()
	{
		Assert.assertTrue(true);
		System.out.println("Enter The ID and Password");
	}
	

	

}
