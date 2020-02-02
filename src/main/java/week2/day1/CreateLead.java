package week2.day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("TCS");
		driver.findElementById("createLeadForm_firstName").sendKeys("Divya");
		driver.findElementById("createLeadForm_lastName").sendKeys("Jayasekaran");
		
		
		WebElement source = driver.findElementById("createLeadForm_dataSourceId");
		Select obj=new Select(source);
		
		obj.selectByVisibleText("Employee");
		
		WebElement industry=driver.findElementById("createLeadForm_industryEnumId");
		Select obj1=new Select(industry);
		
		obj1.selectByValue("IND_AEROSPACE");
		
		WebElement currency=driver.findElementById("createLeadForm_currencyUomId");
		Select obj2=new Select(currency);
		List<WebElement> allOptions=obj2.getOptions();
		int size=allOptions.size();
		System.out.println(size);
	    obj2.selectByIndex(size-1);   
	    
	    for (WebElement all : allOptions)
	    {
			System.out.println(all.getText());
		}
	   
	    WebElement dd = driver.findElementByClassName("smallSubmit");
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
