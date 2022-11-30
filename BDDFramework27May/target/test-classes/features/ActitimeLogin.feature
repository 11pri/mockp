Feature: Actitime Login test cases

  Scenario: check actitime login functionality
    Given user in on actitime login page
    When user enters following inputs on login page
      | userName | password |
      | admin    | manager  |
    And user clicks on Login button
    Then user should be login page
    And user logout actitime and close the browser
