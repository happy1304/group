package day23;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

//.import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchGoogle {

	public SearchGoogle() {
	}
	
	public static void main(String[] args) throws InterruptedException{
		
			String url = "https://www.google.com";
			WebDriverManager.edgedriver().setup();
			WebDriver driver = new EdgeDriver();
            driver.get(url);
       //   Thread.sleep(2000);
       //   search for laptop
            driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Apple Laptop" + Keys.ENTER);
      //    Thread.sleep(2000);
            driver.close();
            driver.quit();
         
	}  
}   

