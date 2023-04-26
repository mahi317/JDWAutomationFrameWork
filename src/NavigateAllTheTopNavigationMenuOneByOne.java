import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateAllTheTopNavigationMenuOneByOne
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
		  
		  String [] urlVal = new String[toNavLst.size()];
		  
		  int i=0;
		  for(WebElement W : toNavLst)
		  {
			  String url = W.getAttribute("href");
			  
			  urlVal[i++]= url;
		  }
		  System.out.println(urlVal.length);
		  for(int j=0;j<=urlVal.length-1;j++)
		  {
			String url = urlVal[j];
			driver.navigate().to(url);
		    Thread.sleep(5000);
		    List<WebElement> lst = driver.findElements(By.xpath("(//span[text()='Home'])"));
		    if(lst.size()>=1)
		    {
		    	System.out.println("We are in flp page");
		    	
		    }
		    else
		    {
		    	System.out.println("We are not in flp page");
		    }
		    
		  }

	}

}
