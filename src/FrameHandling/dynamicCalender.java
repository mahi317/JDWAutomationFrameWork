package FrameHandling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamicCalender 
{
	public static WebDriver driver;

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mahes\\eclipse-workspace\\SeleniumPrograms\\chrome\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
         driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
         
         driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
         
         Thread.sleep(5000);
         WebElement datePIcWebElm = driver.findElement(By.xpath("//input[@id='datepicker']"));
         datePIcWebElm.click();
         Thread.sleep(5000);
         datepicker("2023","may","20");
	}
       	 public static void datepicker(String year,String month,String date) throws Exception
        	 {
        		 for(int i=1;i<=12;i++)
        		 {
        			 try
        			 {
        				 WebElement datepic = driver.findElement(By.xpath("//span[text()='April']//following::span[text()='2023']//following::a[text()='20']"));
        				 datepic.click();
        				 break;
        			 }
        			 catch(Exception e)
        			 {
        				 WebElement nxtWebElm = driver.findElement(By.xpath("//span[text()='Next']"));
        				 nxtWebElm.click();
        				 Thread.sleep(2000);
        				 
        			 }
        		 }
        	 }
         
         
         

	}


