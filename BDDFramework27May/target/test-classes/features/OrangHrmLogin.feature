Feature: OrangeHrm login functionality

  Scenario: Test the login functionality of OrangeHrm with valid credentials
    Given user open the browser and application
    When user enters the username and password
    And user click on the login button
    Then user should login successfully
    And user logout and close the browser