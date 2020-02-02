package week2.day2.assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/radio.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// *******************

		driver.findElementByXPath("//input[@id='yes']").click();
		System.out.println("Radio button is selected");

		// ***************************************

		Thread.sleep(1000);
		  WebElement ele= driver.findElementByXPath("(//input[@type='radio'])[3]");
		  ele.click(); 
		  if(!ele.isSelected()) 
		  {
		  System.out.println("Unchecked radio button is selected .This is not the default selected option");
		  }
		  else 
		  {
		  System.out.println("Checked radio button is the default selected option");
		  }
		 

		/*
		 * List<WebElement> radioOptions = driver.findElementsByXPath(
		 * "//section[@class='innerblock']/div[2]/div/div/input");
		 * System.out.println("inside");
		 * 
		 * for (WebElement options : radioOptions) {
		 * System.out.println(options.getText()); }
		 * 
		 * for(int i=0;i<=(radioOptions.size()-1);i++) {
		 * System.out.println(radioOptions.get(i).getAttribute("input")); }
		 */
		  
		  //------------------------------------
		  List<WebElement> allAgeOptions= driver.findElementsByXPath("//section[@class='innerblock']/div[3]/div/div/input");
		  for(int i=0;i<allAgeOptions.size();i++)
		  {
			  if(allAgeOptions.get(i).isSelected())
			  {
				  System.out.println("Age is selected" +(allAgeOptions.get(i).getText()));
				  break;
			  }
		  }
		  driver.close();
	}

}
