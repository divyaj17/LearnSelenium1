package week2.day2.assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownPages {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//---------------1st check-------------
		Thread.sleep(1000);
		WebElement drpDown=driver.findElementByXPath("//select[@id='dropdown1']");
		Select drp1=new Select(drpDown);
		drp1.selectByIndex(1);
		
		WebElement drpDown1=driver.findElementByXPath("//select[@name='dropdown2']");
		Select drp2=new Select(drpDown1);
		drp2.selectByVisibleText("Selenium");
		
		WebElement drpDown2=driver.findElementByXPath("//select[@id='dropdown3']");
		Select drp3=new Select(drpDown2);
		drp3.selectByValue("1");
		
		WebElement drpDown3=driver.findElementByXPath("//select[@class='dropdown']");
		Select drp4=new Select(drpDown3);
		List<WebElement> allOptions=drp4.getOptions();
		int size=allOptions.size();
		System.out.println("Number of options available are :" +size);
		
		WebElement drpDown4=driver.findElementByXPath("(//div[@class='example']/select)[5]");
		drpDown4.sendKeys("Selenium");
		
		
		WebElement drpDown5=driver.findElementByXPath("(//div[@class='example']/select)[6]");
		Select drp5=new Select(drpDown5);
		drp5.selectByValue("4");
		drp5.selectByValue("3");		
		System.out.println("All options verified");
		//driver.close();
		
	}

}
