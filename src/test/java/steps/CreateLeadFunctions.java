package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import projectCommonMethods.ProjectCommonMethods;

public class CreateLeadFunctions 
{
	public static ChromeDriver driver;
	
	//****************** Scenario 1
	@Given("Launch the Browser")
	public void launchBrowser() 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
	}

	@Given("Load the URL")
	public void loadURL() 
	{
		driver.get("http://leaftaps.com/opentaps");
	}

	@Given("Maximise the Browser")
	public void maximiseBrowser() {
		driver.manage().window().maximize();
	}

	@Given("Set the Timeouts")
	public void setTimeouts() {
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Given("Enter Username as Demosalesmanager")
	public void enterUsernamer() 
	{
		driver.findElementById("username").sendKeys("DemoSalesManager");
	}

	@Given("Enter Password as crmsfa")
	public void enterPassword() {
		driver.findElementById("password").sendKeys("crmsfa");
	}

	@When("Click on the Login Button")
	public void clickLogin() {
		driver.findElementByClassName("decorativeSubmit").click();
	}

	@Given("Click CRMSFA Link")
	public void clickCRMSFA() {
		driver.findElementByLinkText("CRM/SFA").click();
	}

	@Given("Click on the Leads Tab")
	public void clickLeads() {
		driver.findElementByLinkText("Leads").click();
	}

	@Given("Click on the Create Lead Menu")
	public void clickCreateLead() {
		driver.findElementByLinkText("Create Lead").click();
	}

	@Given("Enter the Company Name")
	public void enterCompanyName() {
		driver.findElementById("createLeadForm_companyName").sendKeys("TCS");
	}

	@Given("Enter the First Name")
	public void enterFirstName() {
		driver.findElementById("createLeadForm_firstName").sendKeys("Divi");
	}

	@Given("Enter the Last Name")
	public void enterLastName() {
		driver.findElementById("createLeadForm_lastName").sendKeys("J");
	}

	@When("Click on the Create Lead Button")
	public void clickCreateLeadButton() {
		 WebElement dd = driver.findElementByClassName("smallSubmit");
		    dd.click();
	}

	@Then("Verify Lead Creation is success")
	public void verifyLeadCreation() 
	{
		String ActualTitle=driver.getTitle();
		String ExpectedTitle="View Lead | opentaps CRM";
		
		if(ActualTitle.equals(ExpectedTitle))
		{
		System.out.println("Page title is verified and the tite is :" +ActualTitle );
		System.out.println("Lead created successfully");
		}
		else
		{
			System.out.println("Page title is not verified");
		}
		driver.close();
	}
	
	//***************Scenario 2 functions****************
	
	@Given("Enter the Company Name as (.*)$")
	public void enterCompanyName(String cName) 
	{
		driver.findElementById("createLeadForm_companyName").sendKeys(cName);
	}

	@Given("Enter the First Name as (.*)")
	public void enterFirstName(String fName) 
	{
		driver.findElementById("createLeadForm_firstName").sendKeys(fName);
	}

	@Given("Enter the Last Name as (.*)")
	public void enterLastName(String lName) 
	{
		driver.findElementById("createLeadForm_lastName").sendKeys(lName);
	}
	
	///****************Scenario 3
	@Given("Click on the Find Lead Menu")
	public void clickFindLeadMenu() 
	{
		driver.findElementByXPath("//a[contains(text(),'Find Leads')]").click();	    
	}
	@Given("Enter the F Name as Deepi")
	public void enterFName() throws InterruptedException {
		driver.findElementByXPath("(//input[@name='firstName'][@type='text'])[3]").sendKeys("Swathi");
		Thread.sleep(2000);
	}
	@Given("Click Find Leads")
	public void clickFindLeads() throws InterruptedException
	{	   
		driver.findElementByXPath("//a[contains(text(),'Find Leads')]").click();
		Thread.sleep(2000);
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
