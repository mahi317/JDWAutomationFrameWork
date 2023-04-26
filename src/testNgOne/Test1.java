package testNgOne;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test1 
{
     @Test
	public  void launchfacebook()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mahes\\eclipse-workspace\\JdWillims\\chrome\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
	}

}
