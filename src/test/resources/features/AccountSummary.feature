Feature:Account Summary


  Background:
    When the user is on the home page
    And click "signin"
    And enter valid credentials
    And click "sign in"


  Scenario: Account summary page should have the title Zero – Account summary
    Then verify that "Zero - Account Summary" page is displayed


  Scenario Outline:Account summary page should have
    Then verify that the page has "<account types>"
    Examples:
      | account types       |
      | Cash Accounts       |
      | Investment Accounts |
      | Credit Accounts     |
      | Loan Accounts       |


  Scenario Outline:Credit Accounts table must have columns Account, Credit Card and Balance.
    Then verify that Credit Account has columns "<credit account columns>"
    Examples:
      | credit account columns |
      | Account               |
      | Credit Card           |
      | Balance               |

