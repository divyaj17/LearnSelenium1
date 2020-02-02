package week5.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;

public class EditLead extends ProjectSpecificMethods
{
	@BeforeTest
	public void setFileName()
	{
		excelFileName="TC002_EditLead";
	}
	@Test(dependsOnMethods = {"week5.day1.CreateLead.runCreateLead"},dataProvider="sendData")
	public void runEditLead(String fName,String cName) throws InterruptedException
	{		
		driver.findElementByXPath("//a[contains(text(),'Leads')]").click();
		driver.findElementByXPath("//a[contains(text(),'Find Leads')]").click();
		
		driver.findElementByXPath("(//input[@name='firstName'][@type='text'])[3]").sendKeys(fName);
		Thread.sleep(1000);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(5000);
		driver.findElementByXPath("(//table[@class='x-grid3-row-table'])[1]/tbody/tr[1]/td[1]/div/a[@class='linktext']").click();
		String ActualTitle=driver.getTitle();
		
		String ExpectedTitle = "View Lead | opentaps CRM";
		if(ActualTitle.equals(ExpectedTitle))
		{
			System.out.println("Page title is verified and the title is : " +ActualTitle);
		}
		else
		{
			System.out.println("Page title is not verified");
		}
		driver.findElementByXPath("//div[@class='frameSectionExtra']/a[text()='Edit']").click();
		WebElement company=driver.findElementByXPath("(//input[@name='companyName'])[2]");
		company.click();
		company.clear();
		company.sendKeys(cName);
		Thread.sleep(1000);
		//String ValuePassed = "Google";
		driver.findElementByXPath("//input[@type='submit'][@value='Update']").click();
		Thread.sleep(5000);
		WebElement companyName=driver.findElementByXPath("(//div[@class='fieldgroup-body'])[1]//tbody/tr[1]/td[2]");
		Thread.sleep(1000);
		String ExpectedValue1 = companyName.getText();
		String t=ExpectedValue1.replaceAll("[^a-zA-Z]", "");
		String t1=t.replaceAll("\\s","");
		
		System.out.println(t1);
		/*
		 * if(t.equals(ValuePassed)) {
		 * System.out.println("Updated company name is displayed"); } else {
		 * System.out.println("Updated name is not displayed"); }
		 */
		
}
}
