Feature: Testing the background keyword
 
Background: Logging In of User
Given Login page is displayed
When credentials are entered
Then user is logged in
 
Scenario: Search tickets for a destination
Given Search for destination A
When Destination A is selected and date is selected
Then Tickets available are displayed
 
Scenario: Book tickets for a destination
Given Available tickets for a destination are displayed
When The number of tickets is selected and payment done
Then the tickets are booked