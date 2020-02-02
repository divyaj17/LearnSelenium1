package base;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import utils.ReadExcel;

public class ProjectSpecificMethods 
{
	public ChromeDriver driver;
	public String excelFileName;
	
	@Parameters({"url","userName","passWord"})
	@BeforeMethod
	public void lauchBrowserLogin(String url,String username,String password)
	{
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	driver=new ChromeDriver();
	driver.get(url);
	driver.manage().window().maximize();
	driver.findElementById("username").sendKeys(username);
	driver.findElementById("password").sendKeys(password);
	driver.findElementByClassName("decorativeSubmit").click();
	driver.findElementByLinkText("CRM/SFA").click();
	}
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();	
	}
	
	@DataProvider
	public String[][] sendData() throws IOException
	{
		ReadExcel excel=new ReadExcel();
		
		String[][] data = excel.readExcel(excelFileName);
		return data;
		
	}
	
}
