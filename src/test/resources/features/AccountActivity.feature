Feature: Account Activity Page

  Background:
    When the user is on the home page
    And click "signin"
    And enter valid credentials
    And click "sign in"
    And click "Account Activity"


  Scenario:Account Activity page should have the title Zero – Account activity.
    Then verify that "Zero - Account Activity" page is displayed


  Scenario:Account drop down default option should be Savings.
    Then verify that default option is "Savings"


  Scenario Outline: Account drop down should have the following options: Savings, Checking, Loan, Credit Card, Brokerage.
    Then verify that account dropdown has "<options>"

    Examples:
      | options     |
      | Savings     |
      | Checking    |
      | Loan        |
      | Credit Card |
      | Brokerage   |

  @wip
  Scenario Outline: Transactions table should have column names Date, Description, Deposit,Withdrawal.
    Then verify that Show Transactions table has "<column>"

    Examples:
      | column      |
      | Date        |
      | Description |
      | Deposit     |
      | Withdrawal  |