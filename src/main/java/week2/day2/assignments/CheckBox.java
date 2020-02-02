package week2.day2.assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/checkbox.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElementByXPath("(//label[text()='Select the languages that you know?']/following-sibling::input)[1]").click();
		driver.findElementByXPath("(//label[text()='Select the languages that you know?']/following-sibling::input)[3]").click();
		driver.findElementByXPath("(//label[text()='Select the languages that you know?']/following-sibling::input)[5]").click();
		System.out.println("Check box is selected");
		
		
		  WebElement ele= driver.findElementByXPath("//label[text()='Confirm Selenium is checked']/following-sibling::input");
		  ele.click(); 
		  if(!ele.isSelected()) 
		  {
		  System.out.println("Selenium check box is selected by default");
		  }
		  else 
		  {
		  System.out.println("Selenium check box is not selected by default");
		  }
		  
		  List<WebElement> ele1= driver.findElementsByXPath("//label[text()='DeSelect only checked']/following-sibling::input");
		  
		  for(int i=0;i<ele1.size();i++)
		  {
			  if(ele1.get(i).isSelected())
			  {
				  ele1.get(i).click();				  
			  }
		  }
		  System.out.println("Deselected the checked option");
		  
		  List<WebElement> list1 =driver.findElementsByXPath("(//div[@class='example'])[4]/input[@type='checkbox']");
			for(int i=0;i<list1.size();i++)
			{
				list1.get(i).click();
			}
			System.out.println("Check box is selected");
			
			
 driver.close();
	}

}
