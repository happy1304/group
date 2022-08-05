package Day26;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Selenium {
	public static void main(String[] args) throws InterruptedException {
		String url = "https:www.google.com";
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		Thread.sleep(3000);
		WebElement lnkAbout;
		lnkAbout = driver.findElement(By.xpath("//a[text()='About']"));
		lnkAbout.click();
		Thread.sleep(3000);
		driver.quit();
	}
}