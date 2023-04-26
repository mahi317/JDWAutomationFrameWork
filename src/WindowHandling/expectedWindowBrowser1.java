package WindowHandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class expectedWindowBrowser1 
{

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mahes\\eclipse-workspace\\SeleniumPrograms\\chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(4000);
		//Capture main window Id
		String mainwinId=driver.getWindowHandle();
		//Capture all WinId
		Set<String>allwinId=driver.getWindowHandles();
		String expectedTitleVal="Bus reservation";
		for(String winId:allwinId)
		{
			driver.switchTo().window(winId);
			String actualTitle=driver.getTitle();
			if(actualTitle.contains(expectedTitleVal))
			{
			WebElement buspageWebElm=driver.findElement(By.xpath("//h2[text()='Trending Packages']"));
			System.out.println(buspageWebElm.getText());
			driver.close();
			}
			}
		
	}

}

