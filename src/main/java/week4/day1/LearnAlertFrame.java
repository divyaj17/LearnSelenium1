package week4.day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlertFrame 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		driver.manage().window().maximize();
		
		WebElement ele=driver.findElementByXPath("//iframe[@id='iframeResult']");
		driver.switchTo().frame(ele);
		
		driver.findElementByXPath("//button[text()='Try it']").click();
		Alert alertName=driver.switchTo().alert();
		
		alertName.sendKeys("Divya");
		alertName.accept();
		
		String text=driver.findElementByXPath("//p[@id='demo']").getText();
		System.out.println("Text displayed is :" +text);
		if(text.contains("Divya"))
		{
			System.out.println("Given name is displayed in frame");
		}
		else
		{
			System.out.println("Given name is not displayyed");
		}
		
		
		driver.close();
	}

}
