package StepDefinitions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
 
public class BackgroundTest 
{
        @Given("Login page is displayed")
        public void login_page_is_displayed() 
        {
            System.out.println("Login page displayed");
        }
 
 
        @When("credentials are entered")
        public void credentials_are_entered() 
        {
                System.out.println("Credentials entered");
        }
        @Then("user is logged in")
        public void user_is_logged_in() 
        {
                System.out.println("User logged in");
        }
        @Given("Search for destination A")
        public void search_for_destination_a() 
        {
            System.out.println("Destination searched");
        }
        @When("Destination A is selected and date is selected")
        public void destination_a_is_selected_and_date_is_selected() 
        {
            System.out.println("Destination & date selected");
        }
        @Then("Tickets available are displayed")
        public void tickets_available_are_displayed() 
        {
           System.out.println("Available tickets displayed");
        }
 
        @Given("Available tickets for a destination are displayed")
        public void available_tickets_for_a_destination_are_displayed() 
        {
                    System.out.println("Available tickets for a destination are displayed");
        }
        @When("The number of tickets is selected and payment done")
        public void the_number_of_tickets_is_selected_and_payment_done() 
        {
           System.out.println("Tickets selected and payment made");
 
        }
        @Then("the tickets are booked")
        public void the_tickets_are_booked() 
        {
           System.out.println("Tickets booked");
        }
 
}