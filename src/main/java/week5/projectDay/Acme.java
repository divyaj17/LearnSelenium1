package week5.projectDay;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Acme {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://acme-test.uipath.com/account/login");
		driver.findElementByXPath("//input[@id='email']").sendKeys("kumar.testleaf@gmail.com");
		driver.findElementByXPath("//input[@id='password']").sendKeys("leaf@12");
		driver.findElementByXPath("//button[@id='buttonLogin']").click();
		WebElement vendor = driver.findElementByXPath("(//button[@class='btn btn-default btn-lg'])[4]");
		
		Actions builder = new Actions(driver);
		
		builder.moveToElement(vendor).pause(3000).click(driver.findElementByXPath("//a[text()='Search for Vendor']")).perform();
		
		Thread.sleep(3000);
		
		driver.findElementByXPath("//input[@id='vendorName']").sendKeys("Blue Lagoon");
		driver.findElementByXPath("//button[@id='buttonSearch']").click();
		
		String country = driver.findElementByXPath("//table[@class='table']/tbody/tr[2]/td[5]").getText();
		
		System.out.println("Country name is : " +country);
		driver.findElementByXPath("//a[text()='Log Out']").click();
		
		driver.close();		

	}

}
