package week4.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandling {

	public static void main(String[] args) throws InterruptedException {
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
		
		driver.findElementByXPath("//a[text()='Merge Leads']").click();
		String parentWindow=driver.getWindowHandle();
		driver.findElementByXPath("(//img[@src='/images/fieldlookup.gif'])[1]").click();
		Thread.sleep(1000);
		Set<String> windows= driver.getWindowHandles();
		List<String> listOfWindows= new ArrayList<>();
		listOfWindows.addAll(windows);
		int len = listOfWindows.size();
		System.out.println(len);
		Thread.sleep(3000);
		driver.switchTo().window(listOfWindows.get(1));
		System.out.println("In child window");
		System.out.println(driver.getTitle());
		driver.findElementByXPath("//input[@name='firstName']").sendKeys("Divya");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
		driver.close();
		driver.switchTo().window(parentWindow);
		System.out.println("In main window");
		System.out.println(driver.getTitle());

	}

}
 