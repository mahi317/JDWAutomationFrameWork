package BrowserDriver;
//1. Open Empty Browser
//2. Pass JDW Url
//3. Click on New IN link
//4. Select Blue clour
//5. Select the product from PLP page

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3
{
	public static void main(String[] args) throws Exception
	{
		System.out.println("------Test case started---------");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mahes\\eclipse-workspace\\JdWillims\\chrome\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.jdwilliams.co.uk/");
		Thread.sleep(5000);
		System.out.println("------Opened Jd williams website--------");
		try
		{
			 System.out.println("------Accepting the All Cookies---------");
			 WebElement cookieWebElemBtn = driver.findElement(By.xpath("//button[text()='Accept All Cookies']"));
			 cookieWebElemBtn.click();

			 Thread.sleep(3000);
		}
		catch(Exception e)
		{
	        e.printStackTrace();
		}
		WebElement newInEle = driver.findElement(By.xpath("//a[@name='topNav_NewIn']"));
		System.out.println("------click on NewIN---------");
		
		newInEle.click();
		Thread.sleep(3000);
		

		WebElement blueElm = driver.findElement(By.xpath("//a[@aria-label='refine via Colour Blue']"));
		
		blueElm.click();
		Thread.sleep(2000);
		
		WebElement imageEle = driver.findElement(By.xpath("(//img[@class='js-plp-image'])[1]"));
		
		imageEle.click();
		
		
//		WebElement feedBackEle = driver.findElement(By.xpath("(//div[text()='Feedback'])"));
//		
//		String feedBackText = feedBackEle.getText();
//        System.out.println("feedBackText --- " +  feedBackText);

        driver.close();
        System.out.println("Closing the window");
        System.out.println("------Test case completed---------");
	}

}
