package week5.projectDay;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZoomCar {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.zoomcar.com/chennai/");
		
		driver.findElementByXPath("//a[text()='Start your wonderful journey']").click();
		Thread.sleep(1000);
		driver.findElementByXPath("(//div[@class='items'])[1]").click();
		
		driver.findElementByXPath("//button[text()='Next']").click();
		
		Date date = new Date(); // Get the current date
		System.out.println("Current date is : " +date);
		DateFormat sdf = new SimpleDateFormat("dd"); //Get only the date (and not month, year, time etc)
		String today = sdf.format(date); // Get today's date
		int tomorrow = Integer.parseInt(today)+1; // Convert to integer and add 1 to it
		System.out.println("Tomorrow's date is : " +tomorrow); // Print tomorrow's date
		String date1 = Integer.toString(tomorrow);
		System.out.println("String converted date is : " +date1);
		
		Thread.sleep(3000);
		List<WebElement> texts = driver.findElementsByXPath("//div[@class='days']/div");		
		for (WebElement webElement : texts) 
		{
			if(webElement.getAttribute("innerHTML").contains(date1))
			{
				webElement.click();
				break;
			}
		}
		
		driver.findElementByXPath("//button[text()='Next']").click();
		Thread.sleep(3000);
		
		String pickUpDate = driver.findElementByXPath("(//div[@class='label time-label'])[1]").getText();
		System.out.println("Pick up date displayed is :" +pickUpDate);
		if(pickUpDate.contains(date1))
		{
			System.out.println("Selected start date is displayed here successfully");
		}
		else
		{
			System.out.println("Selected start date is not displayed");
		}
		
		driver.findElementByXPath("//button[text()='Done']").click();
		Thread.sleep(3000);
		
		List<WebElement> numberOfResults = driver.findElementsByXPath("//div[@class='car-listing']");
		int size = numberOfResults.size();
		System.out.println("Number of results displayed from the search are : " +size);
		//SElecting High to low sort
		driver.findElementByXPath("//div[text()=' Price: High to Low ']").click();
		Thread.sleep(3000);
		WebElement highestRate = driver.findElementByXPath("(//div[@class='price'])[1]");
		String rate = highestRate.getText();
		rate=rate.replaceAll("[^0-9,]", " ");
		rate=rate.replaceAll("\\s+", "");
		System.out.println("Price of the highest car that is displayed is :" +rate);
		driver.findElementByXPath("(//div[@class='car-listing'])[1]//div[@class='per-km']/following-sibling::button").click();
		Thread.sleep(2000);
		System.out.println("Into Book now");
		
driver.close();
	}

}
