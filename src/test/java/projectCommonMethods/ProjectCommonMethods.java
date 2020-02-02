package projectCommonMethods;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import utils.ReadExcel;

public class ProjectCommonMethods 
{
	public static ChromeDriver driver;
	
	@BeforeMethod
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();	
	}
	
	
	
}
