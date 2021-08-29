Feature: Find Transactions in Account Activity

  Background:
    Given the user is on the home page
    And click "signin"
    And enter valid credentials
    And click "sign in"
    And click "Account Activity"


  Scenario: Search date range
    And the user accesses the Find Transactions tab
    When the user enters date range from "2012-09-01" to "2012-09-06"
    And click "find"
    Then results table should only show transactions dates between "2012-09-01" to "2012-09-06"
    Then the results should be sorted by most recent date


  Scenario:
    And the user accesses the Find Transactions tab
    When the user enters date range from "2012-09-02" to "2012-09-06"
    And click "find"
    Then results table should only show transactions dates between "2012-09-02" to "2012-09-06"
    And the results table should only not contain transactions dated "2012-09-01"


  Scenario Outline: Search description
    And the user accesses the Find Transactions tab
    When the user enters description "<description>"
    And click "find"
    Then results table should only show descriptions containing "<description>"
    Examples:
      | description |
      | ONLINE      |
      | OFFICE      |


  Scenario:Search description
    And the user accesses the Find Transactions tab
    When the user enters description "OFFICE"
    And click "find"
    Then results table should not show descriptions containing "ONLINE"


  Scenario: Search description case insensitive
    And the user accesses the Find Transactions tab
    When the user enters description "ONLINE"
    And click "find"
    Then results table should only show descriptions containing "ONLINE"
    When the user enters description "online"
    And click "find"
    Then results table should only show descriptions containing "ONLINE"

  @wip
  Scenario: Type
    And the user accesses the Find Transactions tab
    When click "find"
    Then results table should show at least one result under "Deposit"
    Then results table should show at least one result under "Withdrawal"
    When user selects type "Deposit"
    Then results table should show at least one result under "Deposit"
    But results table should show no result under "Withdrawal"
    When user selects type "Withdrawal"
    Then results table should show at least one result under "Withdrawal"
    But results table should show no result under "Deposit"
