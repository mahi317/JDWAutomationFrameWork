package BrowserDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methods {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\mahes\\eclipse-workspace\\JdWillims\\chrome\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.jdwilliams.co.uk/");
		Thread.sleep(5000);
		try {
			WebElement cookieWebElemBtn = driver.findElement(By.xpath("//button[text()='Accept All Cookies']"));
			cookieWebElemBtn.click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// Method 1
//		  WebElement myActWebElm = driver.findElement(By.xpath("//div[contains(@class,'gui-my-account')]"));
//		  
//		  boolean b1= myActWebElm.isDisplayed();
//		  
//		  if (b1)
//		  {
//			  System.out.println("We are in Home page");
//			  
//		  }
//		  else
//		  {
//			  System.out.println("We are not in Home page");
//	
//		  }
//		  Method 2

		List<WebElement> actLstWebElm = driver.findElements(By.xpath("//div[contains(@class,'gui-my-account')]"));
		int len = actLstWebElm.size();
		System.out.println(len);
		if (len >= 1) {
			System.out.println("We are in Homepage ");

		} else {
			System.out.println("We are not in home page");
		}
		WebElement SearchtxtBox = driver.findElement(By.id("searchKeyWords2"));

//		  Verify whether the web Element is enabled or not
		boolean b2 = SearchtxtBox.isEnabled();
		System.out.println("b2 will trye if web element is enabled = " + b2);

//		  Capture the css value
		String color = SearchtxtBox.getCssValue("color");
		System.out.println("color = " + color);

//		  Get the location (x-axis and y-axis)
		Point point = SearchtxtBox.getLocation();
		int Xaxis = point.x;
		int Yaxis = point.y;

		System.out.println("X-axis=" + Xaxis);
		System.out.println("Y-axis=" + Yaxis);

//		Capture the size high and width
		Dimension d1 = SearchtxtBox.getSize();

		int h1 = d1.height;
		int w1 = d1.width;
		System.out.println("height = " + h1);
		System.out.println("width = " + w1);

		System.out.println(SearchtxtBox.getTagName());

	}

}
