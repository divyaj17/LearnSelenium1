package week2.day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Erail {

	public static void main(String[] args) throws InterruptedException {
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

		//WebElement eleTable = driver.findElementByXPath("//table[@class='DataTable DataTableHeader TrainList TrainListHeader']");
		  WebElement eleTable = driver.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']");
		List<WebElement> allRows = eleTable.findElements(By.tagName("tr"));

		for (int i = 0; i < allRows.size(); i++) {
			List<WebElement> allCols = allRows.get(i).findElements(By.tagName("td"));

			WebElement trainNumber = allCols.get(0);
			//String ss = trainNumber.getAttribute("td");
			String trainNum = trainNumber.getText();
			System.out.println(trainNum);

		}

	}

}
