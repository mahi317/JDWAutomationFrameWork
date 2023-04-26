package WindowHandling;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class openMultipleWindows 
{

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mahes\\eclipse-workspace\\SeleniumPrograms\\chrome\\chromedriver_win32\\chromedriver.exe");
         WebDriver driver = new ChromeDriver();
         driver.get("https://www.irctctourism.com/");
         driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
         WebDriverWait wait = new WebDriverWait(driver,60);
         wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='Bus Tickets']")));
         WebElement busTktWebElm= driver.findElement(By.xpath("//span[text()='Bus Tickets']"));
         busTktWebElm.click();
         Thread.sleep(4000);
//        Capture main Windows Id
         String mainWinId = driver.getWindowHandle();
//         Capture All windows Id
        Set<String> allWinId = driver.getWindowHandles();
        for(String WinId: allWinId)
        {
        	if(mainWinId.equals(allWinId))
        	{
//        		Switch to unwanted window
        		driver.switchTo().window(WinId);
        		driver.close();
        	}
        }
         
         
	}

}
