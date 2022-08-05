package day27;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

class RadioButtonTest {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/radio-button");
		// Thread.sleep(3000);
		// search for Name
		WebElement x = driver.findElement(By.xpath("//input[@name='like']"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", x);
		Thread.sleep(2000);

		System.out.println(x.isSelected());

		WebElement y = driver.findElement(By.xpath("//input[@id='impressiveRadio']"));

	    js.executeScript("arguments[0].click();", y);
		System.out.println(y.isSelected());
		Thread.sleep(5000);
		driver.close();
		driver.quit();
	}
}