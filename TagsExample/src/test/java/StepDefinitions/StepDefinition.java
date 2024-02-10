package StepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


public class StepDefinition 
{
	@Before
	public void setup()
	{
		System.out.println("Before is executed FIRST regardless of it's placement");
	}

	@After
	public void cleanUp()
	{
		System.out.println("After is executed at LAST regardless of it's placement\n");
	}
	
	@Given("^Required phone number will be displayed$")
	public void required_phone_number_will_be_displayed() throws Throwable 
	{
		 System.out.println("SMOKE EXECUTED");
	}

	@Given("^Desired deal will be displayed$")
	public void desired_deal_will_be_displayed() throws Throwable 
	{
		 System.out.println("REGRESSION EXECUTED");
	}

	@Then("^Add it to cart$")
	public void add_it_to_cart() throws Throwable 
	{
		 System.out.println("REGRESSION EXECUTED");
	}

	@Given("^Desired email will be displayed$")
	public void desired_email_will_be_displayed() throws Throwable {
	   System.out.println("REGRESSION AND SMOKE EXECUTED");
	
	}		
}
