Feature: It contains TCs related to Swaglab Login page

  Scenario: check swaglab login functinality with different user
    Given user in on swaglab login page
    When user enters following inputs
      | standard_user   | secret_sauce |
      | locked_out_user | secret_sauce |
    And clicks on Login button
    Then user should be login
    And close the browser
