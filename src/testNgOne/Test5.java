package testNgOne;


import org.testng.annotations.Test;

public class Test5 
{
	@Test(enabled=false)
	public void searchProductTest()
	{
		System.out.println("searchProductTest ");
	}
	
	@Test(priority=3)
	public void addproductToBagTest()
	{
		System.out.println("addproductToBagTest");
	}
	
	@Test(priority=2)
	public void writeReviewTest()
	{
		System.out.println("writeReviewTest");
	}
	@Test
	public void cat()
	{
		System.out.println("cat");
	}
	@Test(invocationCount=5)
	public void apple()
	{
		System.out.println("apple");
	}
}

