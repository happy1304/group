package Day28;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShot {



		public static void main(String[] args) throws IOException {
			String url = "https://www.citi.com";
			Date d= new Date();
			SimpleDateFormat sf = new SimpleDateFormat("dd-MM-yyyy");
		
			String dest = "C:\\Working\\PrivateBanking\\src\\test\\java\\Day28\\Screenshot\\image1.png"+ sf.format(d); //yyyyMMddhhmmss
			
			System.out.print(dest);
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get(url);
			driver.manage().window().maximize();
			// Set implicit wait for 10 seconds
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			TakesScreenshot scrShot = (TakesScreenshot) driver;
			File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
			File DestFile = new File(dest);
			FileUtils.copyFile(SrcFile, DestFile);
			driver.close();
			 driver.quit();
		}
	}