package week4.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;

public class DeleteLead extends ProjectSpecificMethods
{
	@Test
	public void runDeleteLead() throws InterruptedException
	{		
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

	}
}
