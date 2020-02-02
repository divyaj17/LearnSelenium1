package week2.day2.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonPage
{

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Button.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//--------------------1stcheck------------------
		String ExpectedHomeURL="http://leafground.com/home.html";
		
		Thread.sleep(1000);
		driver.findElementByXPath("//button[@id='home']").click();
		String homeURL_After=driver.getCurrentUrl();
		System.out.println(homeURL_After);
		Thread.sleep(1000);
		
		if(homeURL_After.equals(ExpectedHomeURL))
		{
			System.out.println("Verified go to home page button validation");
		}
		else
		{
			System.out.println("Go to home page button doesn't navigates back to home");
		}
		//-------------------------2nd check------------------
		driver.findElementByXPath("//img[@alt='Buttons']").click();
		System.out.println("Position of button is :");
		System.out.println(driver.findElementByXPath("//button[@id='position']").getLocation());
		
		//----------------------3rd check-----------------------
		System.out.println("Background color of the button is :");
		System.out.println(driver.findElementByXPath("//button[@id='color']").getCssValue("background-color"));
		
		//----------------------4th check-------------------------
		System.out.println("Height & width of the button is :");
		System.out.println(driver.findElementByXPath("//button[@id='size']").getSize());
		
		driver.close();

	}

}
