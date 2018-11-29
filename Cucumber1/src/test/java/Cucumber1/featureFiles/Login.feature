@tag
Feature: Login in to account
  Existing Livedooh user should  be able to login into account using correct credentials

  @tag1
  Scenario: Login in to account with correct details
    Given User navigates to  livedooh website 
    And User clicks on the login button on Homepage 
    And User enters a valid  username
    And  User enters a valid  password
    When User clicks on  the login button
    Then User should be taken to the succesful login page 
     