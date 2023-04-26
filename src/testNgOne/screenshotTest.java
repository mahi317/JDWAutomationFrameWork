package testNgOne;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.apache.poi.examples.util.TempFileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class screenshotTest 
{
	@Test
	public void captureScreenShot() throws Exception
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
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source= ts.getScreenshotAs(OutputType.FILE);
		File destination = new File ("C:\\Users\\mahes\\eclipse-workspace\\SeleniumPrograms\\screenshot\\jdwHome.jpg");
	    FileUtils.copyFile(source, destination);
	}

}
