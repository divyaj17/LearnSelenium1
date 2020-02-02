package week2.day2.assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkPage {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Link.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//---------------1st check-------------
		Thread.sleep(1000);
		String ExpRes =driver.findElementByXPath("(//a[text()='Go to Home Page'])[1]").getAttribute("href");
		driver.findElementByXPath("(//a[text()='Go to Home Page'])[1]").click();
		String ActRes = driver.getCurrentUrl();
		if(ActRes.equals(ExpRes))
		{
			System.out.println("Home page is reached successfully through hyperlinks");
		}
		else
		{
			System.out.println("Home page is not reached & failed");
		}
		
		//----------------------2nd check-------------
		driver.findElementByXPath("//img[@alt='Link']").click();
		System.out.println("Find to which screen to navigate :");
		System.out.println(driver.findElementByXPath("//a[text()='Find where am supposed to go without clicking me?']").getAttribute("href"));

		//------------------3rd check-------------------
		String res= driver.findElementByXPath("//a[text()='Verify am I broken?']").getAttribute("href");
		if(res.contains("error"))
		{
			System.out.println("Link is broken");
		}
		else
		{
			System.out.println("Not broken");
		}
		
		//---------------------4th check----------------
		driver.findElementByXPath("(//a[text()='Go to Home Page'])[1]").click();
		System.out.println("Home page is reached successfully through hyperlinks");
		driver.findElementByXPath("//img[@alt='Link']").click();
		
		//----------------------5th check-----------------
		List<WebElement> linksNo= driver.findElementsByXPath("//div[@class='example']//a");
		int size=linksNo.size();
		System.out.println("Number of links that are available are :" +size);
		
		driver.close();
	}

}
