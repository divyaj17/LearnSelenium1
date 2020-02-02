package week2.day2.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByXPath("//input[@id='username']").sendKeys("DemoSalesManager");
		driver.findElementByXPath("//input[@id='password']").sendKeys("crmsfa");
		driver.findElementByXPath("//input[@class='decorativeSubmit']").click();
		driver.findElementByXPath("//a[contains(text(),'CRM/SFA')]").click();
		Thread.sleep(1000);
		driver.findElementByXPath("//a[contains(text(),'Leads')]").click();
		driver.findElementByXPath("//a[contains(text(),'Find Leads')]").click();
		
		driver.findElementByXPath("//span[text()='Phone']").click();
		Thread.sleep(1000);
		WebElement countryCode=driver.findElementByXPath("//input[@name='phoneCountryCode']");
		countryCode.click();
		countryCode.clear();
		countryCode.sendKeys("+91");
		driver.findElementByXPath("//input[@name='phoneAreaCode']").sendKeys("427");
		driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("2352788");
		Thread.sleep(1000);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
		WebElement leadId=driver.findElementByXPath("(//table[@class='x-grid3-row-table'])[1]/tbody/tr[1]/td[1]/div/a");
		String LeadID=leadId.getText();
		leadId.click();
		Thread.sleep(2000);
		driver.findElementByXPath("//a[text()='Delete']").click();
		
		driver.findElementByXPath("//a[contains(text(),'Find Leads')]").click();
		Thread.sleep(1000);
		driver.findElementByXPath("//input[@type='text'][@name='id']").sendKeys(LeadID);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
		
		WebElement ele=driver.findElementByXPath("//div[@class='x-panel-bbar']/div//div[text()='No records to display']");
		if(ele.isDisplayed())
		{
			System.out.println("Successfully the record " +LeadID + " is deleted");
		}
		else
		{
			System.out.println("Record is not deleted");
		}
driver.close();
	}

}
