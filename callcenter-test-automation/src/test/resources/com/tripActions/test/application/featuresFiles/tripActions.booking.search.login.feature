Feature: Booking Website Automation

  @search @login
  Scenario: Booking Website Application with Search function
  Given User is in Booking website and clicks accomadation Section
  When User do the Search function
  Then User see the search details and verify the details with search


  @search @login
  Scenario: Booking Website Application with LogIn function
    Given User is in Booking website application and clicks LogIn Button
    When User enters an existing users email and password
    Then user verify the error message
    
