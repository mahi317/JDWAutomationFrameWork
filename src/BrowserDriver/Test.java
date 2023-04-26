package BrowserDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test 
{

	public static void main(String[] args) throws Exception 
	{
//		Set the property for browser Driver
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mahes\\eclipse-workspace\\JdWillims\\chrome\\chromedriver_win32\\chromedriver.exe");

//		Open Empty Browser
		WebDriver driver = new ChromeDriver();
		
//		Passing the URL to Empty Browser
		driver.get("https://www.jdwilliams.co.uk/");
		
//		Identify the web Element or Component
		WebElement SearchTxtBoxWebElem=driver.findElement(By.id("searchKeyWords2"));
	
		
//		Perform the action on the WebElement 
		SearchTxtBoxWebElem.sendKeys("Jeans");
	
//	    Close the Browser
//		driver.close();
		

	}

}
