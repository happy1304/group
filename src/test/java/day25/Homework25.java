package day25;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
class Homwork {
public static void main(String[] args)throws InterruptedException{
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://demoqa.com/text-box");
    //  Thread.sleep(3000);
    //  search for Name
        driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("Aish"+ Keys.TAB);
		//driver.findElement(By.id("userEmail")).sendKeys("aishagni@yahoo.com");
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("aishagni@yahoo.com"+ Keys.TAB);
        //driver.findElement(By.id("currentAddress")).sendKeys("16 Heather court");
        driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys("16 Heather court"+ Keys.TAB);
		//String userEmail = null;
		//driver.findElement(By.id("permanentAddress")).sendKeys("Jersey City,NJ");
		driver.findElement(By.xpath("//textarea[@id='permanentAddress']")).sendKeys("Jersey City,NJ"+ Keys.TAB);
        //driver.findElement(By.id("Submit")).click();
		driver.findElement(By.xpath("//button[@id='submit']")).click();
        //driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
        Thread.sleep(3000);
        driver.close();
        driver.quit();
	    }
        }