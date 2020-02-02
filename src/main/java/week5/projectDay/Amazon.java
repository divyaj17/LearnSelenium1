package week5.projectDay;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		
		WebElement searchBox = driver.findElementByXPath("//input[@id='twotabsearchtextbox']");
		searchBox.sendKeys("oneplus 7 pro mobiles");
		driver.findElementByXPath("(//input[@type='submit'])[1]").click();
		
		Thread.sleep(3000);
		
		String price1 = driver.findElementByXPath("(//a[@class='a-size-base a-link-normal s-no-hover a-text-normal']/span[1])[1]").getText();
		
		System.out.println("Price of first mobile is : " +price1);
		
		String parentWindow=driver.getWindowHandle();
		
		driver.findElementByXPath("(//div[@class='a-section aok-relative s-image-fixed-height']/img)[1]").click();		
		Thread.sleep(1000);
		
		Set<String> windows=driver.getWindowHandles();
		List<String> listOfWindows=new ArrayList<>();
		listOfWindows.addAll(windows);
		int sizeOfWindows = listOfWindows.size();
		System.out.println("Size of Windows" +sizeOfWindows);
		
		Thread.sleep(3000);
		
		driver.switchTo().window(listOfWindows.get(1));
		
		String ratingsText = driver.findElementByXPath("//span[@id='acrCustomerReviewText']").getText();
		
		String ratings = ratingsText.replaceAll("[^0-9]", " ");
		//String rat=ratings.replaceAll(" ", "\\s");
		System.out.println("Ratings for the mobile is :" +ratings);
		
		driver.findElementByXPath("//input[@id='add-to-cart-button']").click();
		Thread.sleep(3000);
		
		String text = driver.findElementByXPath("//h1[@class='a-size-medium a-text-bold']").getText();
		
		if(text.equals("Added to Cart"))
		{
			System.out.println("Mobile added successfully in cart");
		}
		else
		{
			System.out.println("Mobile not added auccessfully");
		}
		
		driver.findElementByXPath("//a[@id='hlb-ptc-btn-native']").click();
		Thread.sleep(3000);
		
		String title = driver.getTitle();
		System.out.println(title);
		
		if(title.equals("Amazon Sign In"))
		{
			System.out.println("Title is verified");
		}
		else
		{
			System.out.println("Title is not verified");
		}
		
		driver.findElementByXPath("//input[@id='continue']").click();
		
		String error = driver.findElementByXPath("(//div[@class='a-alert-content'])[2]").getText();
		
		if(error.equals("Enter your email or mobile phone number"))
		{
			System.out.println("Error message is displayed successfully:" );
		}
		else
		{
			System.out.println("Error message is not displayed");
		}

		driver.close();
		driver.quit();
	}

}
