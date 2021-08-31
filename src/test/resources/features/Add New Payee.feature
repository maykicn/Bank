Feature: Add new payee under pay bills

  Background:
    When the user is on the home page
    And click "signin"
    And enter valid credentials
    And click "sign in"
    And click "Pay Bills"

  @wip
  Scenario: Add a new payee
    Given Add New Payee tab
    And creates new payee using following information
      | Payee Name    | The Law Offices of Hyde, Price & Scharks |
      | Payee Address | 100 Same st, Anytown, USA, 10001         |
      | Account       | Checking                                 |
      | Payee details | XYZ account                              |
    Then message The new payee "The new payee The Law Offices of Hyde, Price & Scharks was successfully created." should be displayed


