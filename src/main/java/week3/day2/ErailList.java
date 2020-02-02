package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ErailList 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.erail.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement from = driver.findElementByXPath("//input[@id='txtStationFrom']");
		from.click();
		from.clear();
		from.sendKeys("MAS", Keys.TAB);
		WebElement to = driver.findElementByXPath("//input[@id='txtStationTo']");
		to.click();
		to.clear();
		to.sendKeys("CST", Keys.TAB);

		driver.findElementByXPath("//input[@id='chkSelectDateOnly']").click();
		WebElement eleTable = driver.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']");
		List<WebElement> allRows = eleTable.findElements(By.tagName("tr"));
		List<String> name = new ArrayList<String>();
		for (int i = 0; i < allRows.size(); i++)
		{
			List<WebElement> allCols = allRows.get(i).findElements(By.tagName("td"));

			WebElement trainName = allCols.get(1);
			String ss = trainName.getAttribute("td");	
			String trainNam = trainName.getText();
			name.add(trainNam);
			
			//System.out.println(trainNum);

		}
		System.out.println("Train names are");
		Collections.sort(name);
		for(String n:name)
		{
		System.out.println(n);
		}
		driver.findElementByXPath("//a[@title='Click here to sort on Train Name']").click();
		
		WebElement eleTable1 = driver.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']");
		List<WebElement> allRows1 = eleTable1.findElements(By.tagName("tr"));
		List<String> name1 = new ArrayList<String>();
		for (int i = 0; i < allRows1.size(); i++)
		{
			List<WebElement> allCols1 = allRows1.get(i).findElements(By.tagName("td"));

			WebElement trainName1 = allCols1.get(1);
			String ss1 = trainName1.getAttribute("td");	
			String trainNam1 = trainName1.getText();
			name1.add(trainNam1);
			
		}
		System.out.println("Train names");
		for(String nam1 : name1)
		{
		System.out.println(nam1);
		}
		if(name.equals(name1))
		{
			System.out.println("Results matched");
		}
		else
		{
			System.out.println("Results unmatched");
		}
		driver.close();
	}

}
