package StepDefinitions;
 import java.util.List;  
 import org.openqa.selenium.By;  
 import org.openqa.selenium.OutputType;  
 import org.openqa.selenium.TakesScreenshot;  
 import org.openqa.selenium.WebDriver;  
 import org.openqa.selenium.WebDriverException;  
 import org.openqa.selenium.chrome.ChromeDriver;  
 import org.testng.Assert;  
 import cucumber.api.DataTable;  
 import cucumber.api.Scenario;  
 import cucumber.api.java.After;  
 import cucumber.api.java.en.Given;  
 import cucumber.api.java.en.Then;  
 import cucumber.api.java.en.When;  
 public class PalindromeStepDef 
 {  
  WebDriver driver;  
  @Given("^I launch the url \"([^\"]*)\"$")  
  public void i_launch_the_url(String arg1) throws Throwable 
  {  
    // Write code here that turns the phrase above into concrete actions  
	  System.setProperty("webdriver.chrome.driver", "E:\\BrowserNatives\\chrome120\\chromedriver.exe");
      driver = new ChromeDriver();  
      driver.get("https://www.fb.com");  
  }  
  @When("^I provide \"([^\"]*)\" and \"([^\"]*)\"$")  
  public void i_provide_and(String arg1, String arg2) throws Throwable 
  {  
    // Write code here that turns the phrase above into concrete actions  
  driver.findElement(By.name("email")).sendKeys(arg1);  
  driver.findElement(By.name("pass")).sendKeys(arg2);  
  }  
  @When("^I click on login button$")  
  public void i_click_on_login_button() throws Throwable 
  {  
    // Write code here that turns the phrase above into concrete actions  
  driver.findElement(By.xpath("//*[@data-testid='royal_login_button']")).click();  
  }  
  @Then("^I should see the login page$")  
  public void i_should_see_the_Error_message() throws Throwable 
  {  
  try
  {  
    // Write code here that turns the phrase above into concrete actions  
   if(driver.findElement(By.name("email")).isDisplayed())
   {  
   Assert.assertTrue(true);  
   }
   else  
   Assert.assertTrue(false);  
  }
  catch(Exception NoSuchElementException)
  {  
   Assert.assertTrue(false);  
  }
  finally
  {  
   driver.quit();  
  }    
  }  
 }  
