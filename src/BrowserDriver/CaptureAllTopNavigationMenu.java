package BrowserDriver;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureAllTopNavigationMenu 
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
		  List<WebElement> toNavLst= driver.findElements(By.xpath("//a[contains(@id,'topNav') and text()]"));
		 String[] val = new String[toNavLst.size()];
		 int i=0;
		 Iterator<WebElement> itr =toNavLst.iterator();
		 while(itr.hasNext())
		 {
			 WebElement w1 = itr.next();
			 String topNavValue = w1.getText();
			 val[i++] = topNavValue;
		 }
		 for(String s : val)
		 {
			 System.out.println(s);
			 
		 }
		 driver.close();

	}

}
