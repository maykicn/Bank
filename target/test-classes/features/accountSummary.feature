Feature:Account Summary


  Background:
    When the user is on the home page
    And click "signin"
    And enter valid credentials
    And click "sign in"
    Then verify that "Zero - Account Summary" page is displayed

  @wip
  Scenario Outline:Account summary page should have
    Then verify that the page has "<account types>"
    Examples:
      | account types        |
      | Cash Accounts        |
      | Investment AccountsA |
      | Credit Accounts      |
      | Loan Accounts        |

  Scenario:Credit Accounts table must have columns Account, Credit Card and Balance.
    Then verify that Credit Account has columns
      | Account     |
      | Credit Card |
      | Balance     |