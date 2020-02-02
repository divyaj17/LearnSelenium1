package week5.day1;

import java.util.List;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;

public class CreateLead extends ProjectSpecificMethods 
{
	@BeforeTest
	public void setFileName()
	{
		excelFileName="TC001_CreateLead";
	}
	
	@Test(dataProvider="sendData")
	public void runCreateLead(String cName,String fName,String lName)
	{			
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys(cName);
		driver.findElementById("createLeadForm_firstName").sendKeys(fName);
		driver.findElementById("createLeadForm_lastName").sendKeys(lName);		
		
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
		

	}

}
 