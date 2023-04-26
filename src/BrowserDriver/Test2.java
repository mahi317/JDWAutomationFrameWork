package BrowserDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 
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
		WebElement SearchtxtBox = driver.findElement(By.id("searchKeyWords2"));
		SearchtxtBox.sendKeys("jeans");
		
		WebElement SearchBtn = driver.findElement(By.xpath("//button[@id='searchButton']"));
		SearchBtn.click();
		Thread.sleep(3000);
		 
        WebElement PlpProduct = driver.findElement(By.xpath("(//img[@class='js-plp-image'])[1]"));
        PlpProduct.click();
	}

}
	