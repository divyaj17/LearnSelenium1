package week2.day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLeadUsingXPath {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.findElementByXPath("//input[@id='username']").sendKeys("DemoSalesManager");
		driver.findElementByXPath("//input[@id='password']").sendKeys("crmsfa");
		driver.findElementByXPath("//input[@class='decorativeSubmit']").click();
		driver.findElementByXPath("//a[contains(text(),'CRM/SFA')]").click();
		
		driver.findElementByXPath("//a[contains(text(),'Leads')]").click();
		driver.findElementByXPath("//a[contains(text(),'Create Lead')]").click();
		
		driver.findElementByXPath("//input[@id='createLeadForm_companyName']").sendKeys("TCS");
		driver.findElementByXPath("//input[@id='createLeadForm_firstName']").sendKeys("Jaya");
		driver.findElementByXPath("//input[@id='createLeadForm_lastName']").sendKeys("JK");

		
		WebElement source = driver.findElementByXPath("//select[@id='createLeadForm_dataSourceId']");
		Select obj=new Select(source);
		
		obj.selectByVisibleText("Employee");
		
		WebElement industry=driver.findElementByXPath("//select[@id='createLeadForm_industryEnumId']");
		Select obj1=new Select(industry);
		
		obj1.selectByValue("IND_AEROSPACE");
		
		WebElement currency=driver.findElementByXPath("//select[@id='createLeadForm_currencyUomId']");
		Select obj2=new Select(currency);
		List<WebElement> allOptions=obj2.getOptions();
		int size=allOptions.size();
		System.out.println(size);
	    obj2.selectByIndex(size-1);   
	    
	    for (WebElement all : allOptions)
	    {
			System.out.println(all.getText());
		}
	   
	   
		Thread.sleep(5000);
		WebElement ele=driver.findElementById("createLeadForm_primaryPhoneCountryCode");
		ele.click();
		ele.clear();
		ele.sendKeys("+91");
		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("2352788");
		driver.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys("427");
		
		driver.findElementById("createLeadForm_primaryEmail").sendKeys("a123@gmail.com");
		
		
		
		 WebElement dd = driver.findElementByXPath("//input[@class='smallSubmit']");
		    dd.click();
			String ActualTitle=driver.getTitle();
			String ExpectedTitle="View Lead | opentaps CRM";
			
			if(ActualTitle.equals(ExpectedTitle))
			{
			System.out.println("Page title is verified and the tite is :" +ActualTitle );
			}
			else
			{
				System.out.println("Page title is not verified");
			}
			
		driver.close();	
		

	}

}
