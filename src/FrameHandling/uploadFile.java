package FrameHandling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class uploadFile 
{

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mahes\\eclipse-workspace\\SeleniumPrograms\\chrome\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("file:///C:/ExcelData/Upload/Uploadc.html");
	    driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
	    Thread.sleep(5000);
	    WebElement uploadBtm = driver.findElement(By.xpath("//label[text()='choode a file!']"));
	    uploadBtm.click();
	    Thread.sleep(5000);
	    
	    Runtime.getRuntime().exec("C:\\ExcelData\\Upload\\upload.exe");
	    


	}

}
