package BrowserDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestM 
{

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mahes\\eclipse-workspace\\JdWillims\\chrome\\chromedriver_win32\\chromedriver.exe");
         
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.jdwilliams.co.uk/");
		
		System.out.println("Verified Homepage");
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
		
		WebElement webElm = driver.findElement(By.xpath("(//a[@name='topNav_NewIn'])"));
		webElm.click();
		Thread.sleep(3000);
		
		WebElement w1= driver.findElement(By.xpath("//span[text()='Product Type']"));
		String ActualSignInText= w1.getText();
		if(ActualSignInText.equals("Product Type"))
		{
			System.out.println("We are in sign in page");
		}
		else
		{
			System.out.println("We are not in sign in page");
		}
		
		System.out.println("Verified PLP Page");
		
		WebElement topBtnElm = driver.findElement(By.xpath("//span[text()='Tops & T-Shirts']"));
		topBtnElm.click();
		Thread.sleep(3000);
		
		WebElement firBtmElm = driver.findElement(By.xpath("(//img[@class='js-plp-image'])[1]"));
		firBtmElm.click();
		System.out.println("Verified plp page of single item");
		 
		WebElement sizebtnElm= driver.findElement(By.xpath("//select[@aria-label='Select Size']"));
		sizebtnElm.click();
		
		
		WebElement addToBtn= driver.findElement(By.xpath("//a[@name='addToBag-main']"));
		addToBtn.click();
		
		System.out.println("moved to add to bag page");
		
	}

}
