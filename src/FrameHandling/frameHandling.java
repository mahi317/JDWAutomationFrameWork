package FrameHandling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class frameHandling 
{

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mahes\\eclipse-workspace\\SeleniumPrograms\\chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://testpages.herokuapp.com/styled/iframes-test.html");
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver,60);
		Thread.sleep(5000);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h2[text()='iFrame Example List']")));
//		Switch to Frame
		driver.switchTo().frame("thedynamichtml");
		WebElement list1= driver.findElement(By.xpath("//li[@id='iframe3']"));
		String val= list1.getText();
		System.out.println(val);
		
//		Switch back to main window
		driver.switchTo().defaultContent();
		WebElement txt = driver.findElement(By.xpath("//h1[text()='iFrames Example']"));
		System.out.println(txt.getText());
		WebElement frameWebElm= driver.findElement(By.xpath("//iframe[@id='theheaderhtml']"));
		
//		Switch to another Frame
		driver.switchTo().frame(frameWebElm);
		WebElement nestedWebElm= driver.findElement(By.xpath("//h1[text()='Nested Page Example']"));
		String val1= nestedWebElm.getText();
		System.out.println(val1);
		
		
		

	}

}
