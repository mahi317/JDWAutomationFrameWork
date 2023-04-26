package BrowserDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignInProgram
{

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mahes\\eclipse-workspace\\JdWillims\\chrome\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.jdwilliams.co.uk/shop/signin/display.action");
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
		
//		Verification
		WebElement w1 = driver.findElement(By.xpath("//h1[text()='Sign in']"));
//		Capture the visible text
		String ActualSignInText= w1.getText();
		if(ActualSignInText.equals("Sign In"))
		{
			System.out.println("We are in sign in page");
		}
		else
		{
			System.out.println("We are not in sign in page");
		}
		WebElement unTxtFldWebElem = driver.findElement(By.id("username"));
		unTxtFldWebElem.sendKeys("qlcadda@gmail.com");
		
		@SuppressWarnings("unused")
		WebElement pwTxtWebElm = driver.findElement(By.id("password"));
		pwTxtWebElm.sendKeys("abcd@gmail.com");
		
		WebElement chkBox1 = driver.findElement(By.id("rememberMe"));
        boolean b1= chkBox1.isSelected();
		System.out.println(b1);
		
		chkBox1.click();
		boolean b2 = chkBox1.isSelected();
		System.out.println(b2);
		
		WebElement signInBtnWebElem = driver.findElement(By.xpath("//button[@id='signInButton']"));
		signInBtnWebElem.click();
		
		WebElement errorTxtWebElm = driver.findElement(By.xpath("//p[@class='alert__text_error']"));
		String errortext = errorTxtWebElm.getText();
		if(errortext.contains("incorrect"))
		{
			System.out.println("Error message is displaying on page");
			
		}
		else
		{
			System.out.println("Error is not displaying");
		}

	}

}
