package week2.day2.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/table.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//-----------------------
		List<WebElement> row=driver.findElementsByXPath("//table[@id='table_id']/tbody/tr");
		List<WebElement> col=driver.findElementsByXPath("//table[@id='table_id']/tbody/tr[2]/td");
		int rowCount=row.size();
		int colCount=col.size();
		System.out.println("No of rows : " +rowCount);
		System.out.println("No of columns : " +colCount);
		WebElement value=driver.findElementByXPath("//table[@id='table_id']/tbody/tr[3]/td[2]");
		System.out.println(value.getText());
		
		List<WebElement> progressColumn=driver.findElementsByXPath("//table[@id='table_id']/tbody/tr/td[2]");
		System.out.println("Progress column values are :" );
		
		  for(int i=0;i<progressColumn.size();i++) 
		  { 
		  WebElement ele=progressColumn.get(i); 
		  String ele1=ele.getText();
		  System.out.println(ele1); 
		   }
		 driver.findElementByXPath("//table[@id='table_id']/tbody/tr[4]/td[3]/input[@type='checkbox']").click();
		 System.out.println("Checkbox is checked");
		
		
		driver.close();
	}

}
