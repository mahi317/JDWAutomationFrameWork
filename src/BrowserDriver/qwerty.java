package BrowserDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class qwerty 
{

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mahes\\eclipse-workspace\\JdWillims\\chrome\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.jdwilliams.co.uk/");
		Thread.sleep(5000);
		try
		{
			 WebElement cookieWebElemBtn = driver.findElement(By.xpath("//button[text()='Accept All Cookies']"));
			 cookieWebElemBtn.click();
			 Thread.sleep(3000);
		}
		catch(Exception e)
		{
	        e.printStackTrace();
		}
		//Method 1
//		  WebElement myActWebElm = driver.findElement(By.xpath("//div[contains(@class,'gui-my-account')]"));
//		  
//		  boolean b1= myActWebElm.isDisplayed();
//		  
//		  if (b1)
//		  {
//			  System.out.println("We are in Home page");
//			  
//		  }
//		  else
//		  {
//			  System.out.println("We are not in Home page");
//	
//		  }
//		  Method 2
		  
		  List<WebElement> actLstWebElm = driver.findElements(By.xpath("//div[contains(@class,'gui-my-account')]"));
		  int len= actLstWebElm.size();
		  System.out.println(len);
		  if(len>=1)
		  {
			  System.out.println("We are in Homepage ");
			  
		  }
		  else
		  {
			  System.out.println("We are not in home page");
		  }
		 
		WebElement SearchtxtBox = driver.findElement(By.id("searchKeyWords2"));
		SearchtxtBox.sendKeys("jeans");
		
		WebElement SearchBtn = driver.findElement(By.xpath("//button[@id='searchButton']"));
		SearchBtn.click();
		Thread.sleep(3000);
		 
        WebElement PlpProduct = driver.findElement(By.xpath("(//img[@class='js-plp-image'])[1]"));
        PlpProduct.click();
	}

}
