package week2.day1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Thread.sleep(2000);
		driver.findElementByXPath("//input[@id='src']").sendKeys("Chennai");		
		driver.findElementByXPath(".//*[@id='search']/div/div[1]/div/ul/li[1]").click();
		
		Thread.sleep(2000);
		driver.findElementByXPath(".//input[@id='dest']").sendKeys("Trichy");
		driver.findElementByXPath(".//*[@id='search']/div/div[2]/div/ul/li[1]").click();
		
		//driver.findElementByXPath("//input[@id='onward_cal']").click(); //ElementClickInterception
        //driver.findElementByXPath("//label[@class='db text-trans-uc']").click(); //No such element exception
		
		//Onward date selection
		Thread.sleep(2000);
		driver.findElementByXPath(".//*[@id='search']/div/div[3]/div/label").click();
		//driver.findElementByXPath("//div[@id='rb-calendar_onward_cal']/table[@class='rb-monthTable first last']/tbody/tr[7]/td[6]").click(); //ElementNotInteractable
		
		List<WebElement> allDates=driver.findElementsByXPath("//div[@id='rb-calendar_onward_cal']/table[@class='rb-monthTable first last']/tbody/tr/td");
		System.out.println("Before");
		for (WebElement ele : allDates) 
		{
			String date=ele.getText();
			//System.out.println(date);
			if(date.equalsIgnoreCase("29"))
			{
				ele.click();
			}
		}
		
		//Return date selection
		Thread.sleep(2000);
		driver.findElementByXPath(".//*[@id='search']/div/div[4]/div/label").click();
		List<WebElement> allDatesReturn=driver.findElementsByXPath("//div[@id='rb-calendar_return_cal']/table[@class='rb-monthTable first last']/tbody/tr/td");
		for (WebElement ele1 : allDatesReturn) 
		{
			String date=ele1.getText();
			//System.out.println(date);
			if(date.equalsIgnoreCase("31"))
			{
				ele1.click();
			}
		}
		
		driver.findElementByXPath("//button[@id='search_btn']").click();
		
		Thread.sleep(2000);
		
		WebElement text=driver.findElementByXPath("//span[contains(@class,'f-bold busFound')]");
		String actualValue=text.getText();
		System.out.println(actualValue);
		String modifiedValue=actualValue.replaceAll("[^0-9]", "");
		System.out.println("Number of buses that are displayed through general search is :" +modifiedValue);
		
		//Clicking check box after 6pm
		Thread.sleep(1000);
		driver.findElementByXPath("//ul[@class='dept-time dt-time-filter']/li[4]").click();
		
		//Clicking AC check box
		Thread.sleep(1000);
		driver.findElementByXPath("//ul[@class='list-chkbox']/li[3]").click();
		
		Thread.sleep(1000);
		WebElement text1=driver.findElementByXPath("//span[contains(@class,'f-bold busFound')]");
		String actualValue1=text1.getText();
		System.out.println(actualValue1);
		String modifiedValue1 = actualValue1.replaceAll("[^0-9]","");
		System.out.println("Number of buses that are displayed after filters are :" +modifiedValue1);
		
		driver.close();
		driver.quit();
	}

	
}
