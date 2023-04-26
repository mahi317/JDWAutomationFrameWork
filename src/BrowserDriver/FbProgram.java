package BrowserDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbProgram {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\mahes\\eclipse-workspace\\JdWillims\\chrome\\chromedriver_win32\\chromedriver.exe");

		System.out.println("------opening empty chrome brower------");
		WebDriver driver = new ChromeDriver();

		System.out.println("------loading facbook website------");

		driver.get("https://www.facebook.com/login/");

		System.out.println("------maximizing the window------");
		driver.manage().window().maximize();

		WebElement facebookLogin = driver.findElement(By.xpath("//div[@class ='_9axz']"));
		String textFB = facebookLogin.getText();

		System.out.println("---Log in page text is : - " + textFB);

		Thread.sleep(3000);

		System.out.println("------closing the window------");

		driver.close();

	}

}
