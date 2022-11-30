Feature: It contains TCs related to Actitime Task creation page

  Scenario Outline: create new task "<Flow>" on "<Server>"
    Given user in on actitime login page for task creation
    And user enters username as "<username>" in the username field
    And user enters password as "<password>" in password field
    And clicks on actitime Login button
    When click on Tasks tab
    And click on Add new button
    And select New Tasks
    And select projectr from project dropdown
    And enter task name as "<taskName>" and project name as "<project>"
    And click on Create Tasks button
    Then user should be able to see the created task on page
    And close the actitime application browser

    Examples: 
      | Server  | Flow     | username | password | taskName      | project  |
      | QA      | positive | admin    | manager  | Testing       | Internal |
      | Staging | negative | admin12  | test@12  | Development   | Client   |
      | Staging | positive | Admin    | QA@123   | CreateProject | Client   |
