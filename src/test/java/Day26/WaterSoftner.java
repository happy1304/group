package Day26;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WaterSoftner {



	public static void main(String[] args) throws InterruptedException {
			// strong[text()='France']/preceding::input[1]
		//<input type="hidden" id="searchTerm" value="water softener" data-di-id="#searchTerm">
			String url = "https://www.ferguson.com/";
			String searchtext = "water softner";
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(url);
			Thread.sleep(3000);

			WebElement waterSoftner;
			driver.findElement(By.xpath("//input[@name='search']")).sendKeys(searchtext + Keys.ENTER);
			//waterSoftner = driver.findElement(By.xpath("//strong[text()='" + searchText + "']/preceding::input[1]"));
			//waterSoftner.click();
			
			waterSoftner = driver.findElement(By.xpath("//input[@id='totalNumRecs']"));
			waterSoftner.click();
			String count =  waterSoftner.getText();
			System.out.print("TEXT IS "+count);
			
			Thread.sleep(3000);
			//driver.close();
			//driver.quit();

		}

}
