package FrameHandling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertPopHandling {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mahes\\eclipse-workspace\\SeleniumPrograms\\chrome\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://demo.guru99.com/test/delete_customer.php");
	    driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
	    System.out.println("looking for search bar");
	    WebElement custInWebElm = driver.findElement(By.xpath("//input[@name='cusid']"));
	    custInWebElm.sendKeys("asdf@1234");
	    Thread.sleep(5000);

	    WebElement submitBtnWebElm  = driver.findElement(By.name("submit"));
	    submitBtnWebElm.click();
	    Thread.sleep(5000);
	    try
	    {
//	    	Switch to alert Window
	    	Alert alt = driver.switchTo().alert();
//	    	Capture the alert text
	    	String val = alt.getText();
	    	System.out.println(val);
	    	Thread.sleep(5000);
//	    	Click on ok button
	    	alt.accept();
	    	String expectedTxt = "Customer successfully Delete !";
//	    	Switch to other alert popup for verification
	    	Alert alt1 = driver.switchTo().alert();
	    	String actualTxt = alt1.getText();
	    	if(actualTxt.equals(expectedTxt))
	    	{
	    		System.out.println("Customer deleted sucessfully");
	    	}
	    	else
	    	{
	    		System.out.println("Customer not deleted successfully");
	    	}
	    	Thread.sleep(3000);
	    	alt1.accept();
	    }
	    catch(Exception e)
	    {
	    	e.printStackTrace();
	    }


	}

}
