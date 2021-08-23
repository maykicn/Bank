Feature: Pay Bills

  Background:
    When the user is on the home page
    And click "signin"
    And enter valid credentials
    And click "sign in"
    And click "Pay Bills"


  Scenario:Pay Bills page should have the title Zero – Account activity.
    Then verify that "Zero - Pay Bills" page is displayed


  Scenario: With successful Pay operation, The payment was successfully submitted. should be displayed.
    And Enter amount to be sent "100"
    And Enter date "14.10.2021"
    And click "pay"
    Then verify that "The payment was successfully submitted." mesagge is displayed


  Scenario Outline: ine: With invalid data, The payment was successfully submitted. should be displayed.
    And try without amount to be sent "<amount>"
    And try without date "<date>"
    And click "pay"
    Then verify that error "<message>" mesagge is displayed with "<input>"
    Examples:
      | amount | date       | message                     | input  |
      |        | 14.10.2021 | Please fill out this field. | amount |
      | 100    |            | Please fill out this field. | date   |


  Scenario Outline: With successful Pay operation, The payment was successfully submitted. should be displayed.
    And Enter alphabetical or special characters as "<amount>"
    And Enter alphabetical characters as "<date>"
    Then verify that alphabetical or special characters should not accept for "<input>"

    Examples:
      | amount  | date       | input  |
      | amount  | 14.10.2021 | amount |
      | sp€ci@! | date       | date   |

