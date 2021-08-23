
Feature: Login


  Background:
    When the user is on the home page
    And click "signin"


  Scenario:User should login with valid credentials with sign in button
    And enter valid credentials
    And click "sign in"
    Then verify that "Zero - Account Summary" page is displayed


  Scenario:User should login with valid credentials with Enter keyword
    And enter valid credentials
    And enter with keyword
    Then verify that "Zero - Account Summary" page is displayed


  Scenario Outline: User should not be able to login with invalid credentials
    And enter "<username>" username and "<password>" password
    And click "sign in" with invalid credentials
    Then Verify that "Login and/or password are wrong." error message is displayed

    Examples:
      | username | password |
      | USE      | password |
      | username | pas      |
      | use      | pas      |
      |          | password |
      | username |          |
      |          |          |


