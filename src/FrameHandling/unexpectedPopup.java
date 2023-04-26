package FrameHandling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class unexpectedPopup 
{

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mahes\\eclipse-workspace\\SeleniumPrograms\\chrome\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.jdwilliams.co.uk/");
	    driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
	    for(int i=0;i<=10;i++)
	    {
	    	try
			{
				 WebElement cookieWebElemBtn = driver.findElement(By.xpath("//button[text()='Accept All Cookies']"));
				 cookieWebElemBtn.click();
				 Thread.sleep(3000);
			}
			catch(Exception e)
			{
		        Thread.sleep(5000);
		        System.out.println("exit from browser");
			}
	    }

	}

}
