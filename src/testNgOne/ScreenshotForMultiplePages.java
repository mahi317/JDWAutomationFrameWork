package testNgOne;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ScreenshotForMultiplePages
{
	public WebDriver driver;
	@Test
	public void captureScreenShotTest() throws Exception
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mahes\\eclipse-workspace\\JdWillims\\chrome\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();

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
		
//		Capture the screenshot for Homepage.
		
		CaptureScreenShot("jdwHome");
		driver.findElement(By.id("searchKeyWords2")).sendKeys("jeans");
		driver.findElement(By.id("searchButton")).click();
		WebDriverWait wait = new WebDriverWait(driver,60);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@title='Home']")));
		
//		Capturing the Screenshot for plp page.
		
		CaptureScreenShot("PLP");
		driver.findElement(By.xpath("(//img[@class='js-plp-image'])[1]")).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text()='Add To Bag']")));

//		capture the screenshot for PLD page
		
		CaptureScreenShot("PLD");
		
		
	}
	public void CaptureScreenShot(String ScreenShotName) throws Exception
	{
    	TakesScreenshot ts = (TakesScreenshot)driver;
		File source= ts.getScreenshotAs(OutputType.FILE);
		File destination = new File ("C:\\Users\\mahes\\eclipse-workspace\\SeleniumPrograms\\screenshot\\"+ScreenShotName+".jpg");
	    FileUtils.copyFile(source, destination);
	}
	
		
}


