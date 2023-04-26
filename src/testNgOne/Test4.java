package testNgOne;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test4 
{
	@Test
	public void cat()
	{
		System.out.println("cat");
	}
	@Test
	public void dog()
	{
		System.out.println("Dog");
	}
	
	@Test
	public void rat()
	{
		System.out.println("rat");
	}
	@Test(dependsOnMethods="cat")
	
	public void mouse()
	{
		System.out.println("mouse");
	}
		 


}
