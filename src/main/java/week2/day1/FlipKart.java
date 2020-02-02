package week2.day1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipKart {

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		int count=0;
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Thread.sleep(2000);		
		driver.findElementByXPath("(//input[@type='text'])[2]").sendKeys("8015017291");
		
		Thread.sleep(1000);
		driver.findElementByXPath("//input[@type='password']").sendKeys("Ashok@08");
		
		Thread.sleep(1000);
		driver.findElementByXPath("(//button[@type='submit'])[2]").click();
		
		Thread.sleep(2000);
	    WebElement mainMenu= driver.findElementByXPath("//div[@id='container']/div/div[2]/div/ul/li[1]");
	   // WebElement subMenu = driver.findElementByXPath("//div[@id='container']/div/div[2]/div/ul/li[1]/ul/li/ul/li/ul/li[2]/a[@title='Mi']");
		Actions actions = new Actions(driver);
		
		Thread.sleep(2000);
		actions.moveToElement(mainMenu).pause(1000).click(driver.findElementByXPath("//div[@id='container']/div/div[2]/div/ul/li[1]/ul/li/ul/li/ul/li[2]/a[@title='Mi']")).perform();
		System.out.println("Mouse hover on Electronics passed");
		
		Thread.sleep(2000);
		//actions.moveToElement(subMenu);
		//actions.click().build().perform();
		
		 
		//Sub Menu
		//WebElement subMenu = driver.findElementByXPath("//div[@id='container']/div/div[2]/div/ul/li[1]/ul/li/ul/li/ul/li[2]/a[@title='Mi']");
		//actions.moveToElement(subMenu).perform();
		//build() method is used to compile all the actions into a single step 
		//actions.click().build().perform();
		//actions.moveToElement(subMenu).click();
		System.out.println("Mi page is loaded successfully");
		
		String ActualTitle=driver.getTitle();
		System.out.println(ActualTitle);
		String ExpectedTitle= "Mi Mobile Phones and Smartphones Online at Lowest Prices in India";
		if(ActualTitle.contains("ExpectedTitel"))
		{
			System.out.println("Page title is verified & the title is :" +ActualTitle);
		}
		else
		{
			System.out.println("Page title is not verified");
		}
		
		List<WebElement> pageNo=driver.findElementsByXPath("//nav[@class='_1ypTlJ']/a");		
		for(int i=0;i<pageNo.size();i++)
		{
			if(i != 0)
			{
			pageNo.get(i).click();
			}
			Thread.sleep(5000);
		    List<WebElement> name= driver.findElementsByXPath("//div[@class='_1-2Iqu row']/div[1]/div[1]");		
		    for(int  j=0;j<name.size();j++)
		    {
			System.out.println(name.get(j).getText());
			count++;
		    }
		}
		
		System.out.println("Mobile names are displayed successfully & the number of mobiles that got displayed under brand Mi are :" +count);
		driver.close();
	
	}

}
