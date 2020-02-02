package week2.day2.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {

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
		
		Thread.sleep(1000);
		driver.findElementByXPath("//span[text()='Email']").click();
		driver.findElementByXPath("//input[@name='emailAddress']").sendKeys("a123@gmail.com");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
		//WebElement leadId=driver.findElementByXPath("//table[@class='x-grid3-row-table']/tbody/tr[1]/td[1]/div/a");
		WebElement leadFirstName=driver.findElementByXPath("//table[@class='x-grid3-row-table']/tbody/tr[1]/td[3]/div/a");
		WebElement leadSecondName=driver.findElementByXPath("//table[@class='x-grid3-row-table']/tbody/tr[1]/td[4]/div/a");
		String firstName= leadFirstName.getText();
		String secondName= leadSecondName.getText();
		System.out.println(firstName);
		leadFirstName.click();
		
		Thread.sleep(2000);
		driver.findElementByXPath("//div[@class='frameSectionExtra']/a[text()='Duplicate Lead']").click();
		Thread.sleep(1000);
		String ExpectedTitle= "Duplicate Lead";
		String ActualTitle=driver.getTitle();
		if(ActualTitle.equals(ExpectedTitle))
		{
			System.out.println("Page Title is verified :" +ActualTitle);
		}
		else
		{
			System.out.println("Page itle is not verified");
		}
		driver.findElementByXPath("//input[@type='submit'][@value='Create Lead']").click();
		Thread.sleep(1000);
		WebElement fname=driver.findElementById("viewLead_firstName_sp");
		String ActualName=fname.getText();
		System.out.println(ActualName);
		if(ActualName.equals(firstName))
		{
			System.out.println("Duplicate record is created successfully with same name");
		}
		else
		{
			System.out.println("Failed.");
		}
		driver.close();
	}

}
