package runner;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Unwanted 
{
	public ChromeDriver driver;
	@Given("Click on the Find Lead Menu")
	public void clickFindLeadMenu() 
	{
		driver.findElementByXPath("//a[contains(text(),'Find Leads')]").click();	    
	}
	
	@Given("Enter the First Name as Selvi$")
	public void enterFirstName() 
	{
		driver.findElementByXPath("(//input[@name='firstName'][@type='text'])[3]").sendKeys("Divya");	    
	}

	@Given("Click Find Leads")
	public void clickFindLeads()
	{	   
		driver.findElementByXPath("//a[contains(text(),'Find Leads')]").click();
	}

	@Given("Click the first result")
	public void clickfirstresult() 
	{
		driver.findElementByXPath("(//table[@class='x-grid3-row-table'])[1]/tbody/tr[1]/td[1]/div/a[@class='linktext']").click();  	    
	}

	@Given("Click Edit lead")
	public void clickEditlead() 
	{
		driver.findElementByXPath("//div[@class='frameSectionExtra']/a[text()='Edit']").click();	    
	}

	@Given("Enter the updated Company Name as Hero")
	public void enterupdatedCompanyName()
	{
		WebElement company=driver.findElementByXPath("(//input[@name='companyName'])[2]");
		company.click();
		company.clear();
		company.sendKeys("Hero");	    
	}

	@When("Click the update button")
	public void clickupdatebutton()
	{
		driver.findElementByXPath("//input[@type='submit'][@value='Update']").click();	    
	}

	@Then("Verify Lead Updation is success")
	public void verifyLeadUpdation() 
	{
		WebElement companyName=driver.findElementByXPath("(//div[@class='fieldgroup-body'])[1]//tbody/tr[1]/td[2]");
		
		String ExpectedValue1 = companyName.getText();
		String t=ExpectedValue1.replaceAll("[^a-zA-Z]", "");
		String t1=t.replaceAll("\\s","");		
		System.out.println(t1);		 
		System.out.println("Updated company name is displayed");
	    
	}
}
