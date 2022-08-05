package bdd;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.internal.BaseClassFinder;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDef {
	WebDriver driver = null;


	@Given("^User is on Google  Home Page$")
	public void openGoogle() throws Throwable { 
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
	}

	@When("^User search for New Hindi Movies$")
	public void search() throws Throwable {
		WebElement txtSearch;
		txtSearch = driver.findElement(By.xpath("//input[@name='q']"));
		txtSearch.sendKeys("New Hindi Movies " + Keys.ENTER);
	}

	@Then("^Hindi Movies results should display successfully$")
	public void verify() throws Throwable {
		Assert.assertTrue(driver.getTitle().contains("Hindi Movies"));
		driver.close();
		driver.quit();
	}
}
