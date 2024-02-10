import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Steps_Sample 
{
	WebDriver driver;

	@Given("^There is opened Google$")
	public void there_is_opened_Google() throws Throwable 
	{
		System.setProperty("webdriver.chrome.driver", "e:\\BrowserNatives\\chrome120\\chromedriver.exe");
		driver = new ChromeDriver();
		//System.setProperty("webdriver.gecko.driver", "D:\\BrowserNatives\\geckodriver.exe");
		//driver = new FirefoxDriver();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://google.com");
	}

	@Then("^I search ChercherTech in searchbar$")
	public void i_search_ChercherTech_in_searchbar() throws Throwable 
	{
	    driver.findElement(By.name("q")).sendKeys("CherCherTech");
	}
}