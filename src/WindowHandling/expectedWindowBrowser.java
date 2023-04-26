package WindowHandling;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class expectedWindowBrowser 
{

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mahes\\eclipse-workspace\\SeleniumPrograms\\chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.irctctourism.com/");
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver,60);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='Bus Tickets']")));
		WebElement  busTktWebElm = driver.findElement(By.xpath("//span[text()='Bus Tickets']"));
		busTktWebElm.click();
		Thread.sleep(4000);
//		Capture Main window id
		String mainWinId= driver.getWindowHandle();
//		Capture all WIn ID
		Set<String> allWinId= driver.getWindowHandles();
		String expectedTitleVal = " Bus Reservation";
		for(String WinId : allWinId)
		{
			driver.switchTo().window(expectedTitleVal);
			String actualTitle= driver.getTitle();
			if(actualTitle.contains(expectedTitleVal))
			{
				WebElement busPageWebElm= driver.findElement(By.xpath("//h2[text()='Trending Packages ']"));
				Thread.sleep(5000);
				System.out.println(busPageWebElm.getText());
				driver.close();
			}
///		Switch back to main window
			driver.switchTo().window(mainWinId);
		}

	}
}


