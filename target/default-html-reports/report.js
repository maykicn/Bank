$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/AccountActivityNavigation.feature");
formatter.feature({
  "name": "Navigating to specific accounts in Accounts Activity",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the home page",
  "keyword": "When "
});
formatter.match({
  "location": "com.bank.step_definitions.MainDefs.the_user_is_on_the_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click \"signin\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.bank.step_definitions.LoginDefs.click_button(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter valid credentials",
  "keyword": "And "
});
formatter.match({
  "location": "com.bank.step_definitions.LoginDefs.enter_valid_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click \"sign in\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.bank.step_definitions.LoginDefs.click_button(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Savings account redirect",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.step({
  "name": "the user clicks on \"Savings\" link on the Account Summary page",
  "keyword": "And "
});
formatter.match({
  "location": "com.bank.step_definitions.AccountActivityNavigationDefs.the_user_clicks_on_link_on_the_Account_Summary_page(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the Account Activity page should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "com.bank.step_definitions.AccountActivityNavigationDefs.the_Account_Activity_page_should_be_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Account drop down should have \"Savings\" selected",
  "keyword": "And "
});
formatter.match({
  "location": "com.bank.step_definitions.AccountActivityNavigationDefs.account_drop_down_should_have_selected(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the home page",
  "keyword": "When "
});
formatter.match({
  "location": "com.bank.step_definitions.MainDefs.the_user_is_on_the_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click \"signin\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.bank.step_definitions.LoginDefs.click_button(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter valid credentials",
  "keyword": "And "
});
formatter.match({
  "location": "com.bank.step_definitions.LoginDefs.enter_valid_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click \"sign in\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.bank.step_definitions.LoginDefs.click_button(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Brokerage account redirect",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.step({
  "name": "the user clicks on \"Brokerage\" link on the Account Summary page",
  "keyword": "When "
});
formatter.match({
  "location": "com.bank.step_definitions.AccountActivityNavigationDefs.the_user_clicks_on_link_on_the_Account_Summary_page(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify that \"Zero - Account Activity\" page is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "com.bank.step_definitions.LoginDefs.verify_that_page_is_displayed(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Account drop down should have \"Brokerage\" selected",
  "keyword": "And "
});
formatter.match({
  "location": "com.bank.step_definitions.AccountActivityNavigationDefs.account_drop_down_should_have_selected(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the home page",
  "keyword": "When "
});
formatter.match({
  "location": "com.bank.step_definitions.MainDefs.the_user_is_on_the_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click \"signin\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.bank.step_definitions.LoginDefs.click_button(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter valid credentials",
  "keyword": "And "
});
formatter.match({
  "location": "com.bank.step_definitions.LoginDefs.enter_valid_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click \"sign in\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.bank.step_definitions.LoginDefs.click_button(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Checking account redirect",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.step({
  "name": "the user clicks on \"Checking\" link on the Account Summary page",
  "keyword": "When "
});
formatter.match({
  "location": "com.bank.step_definitions.AccountActivityNavigationDefs.the_user_clicks_on_link_on_the_Account_Summary_page(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify that \"Zero - Account Activity\" page is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "com.bank.step_definitions.LoginDefs.verify_that_page_is_displayed(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Account drop down should have \"Checking\" selected",
  "keyword": "And "
});
formatter.match({
  "location": "com.bank.step_definitions.AccountActivityNavigationDefs.account_drop_down_should_have_selected(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the home page",
  "keyword": "When "
});
formatter.match({
  "location": "com.bank.step_definitions.MainDefs.the_user_is_on_the_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click \"signin\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.bank.step_definitions.LoginDefs.click_button(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter valid credentials",
  "keyword": "And "
});
formatter.match({
  "location": "com.bank.step_definitions.LoginDefs.enter_valid_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click \"sign in\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.bank.step_definitions.LoginDefs.click_button(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Credit Card account redirect",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.step({
  "name": "the user clicks on \"Credit Card\" link on the Account Summary page",
  "keyword": "When "
});
formatter.match({
  "location": "com.bank.step_definitions.AccountActivityNavigationDefs.the_user_clicks_on_link_on_the_Account_Summary_page(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify that \"Zero - Account Activity\" page is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "com.bank.step_definitions.LoginDefs.verify_that_page_is_displayed(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Account drop down should have \"Credit Card\" selected",
  "keyword": "And "
});
formatter.match({
  "location": "com.bank.step_definitions.AccountActivityNavigationDefs.account_drop_down_should_have_selected(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the home page",
  "keyword": "When "
});
formatter.match({
  "location": "com.bank.step_definitions.MainDefs.the_user_is_on_the_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click \"signin\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.bank.step_definitions.LoginDefs.click_button(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter valid credentials",
  "keyword": "And "
});
formatter.match({
  "location": "com.bank.step_definitions.LoginDefs.enter_valid_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click \"sign in\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.bank.step_definitions.LoginDefs.click_button(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Loan account redirect",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.step({
  "name": "the user clicks on \"Loan\" link on the Account Summary page",
  "keyword": "When "
});
formatter.match({
  "location": "com.bank.step_definitions.AccountActivityNavigationDefs.the_user_clicks_on_link_on_the_Account_Summary_page(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify that \"Zero - Account Activity\" page is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "com.bank.step_definitions.LoginDefs.verify_that_page_is_displayed(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Account drop down should have \"Loan\" selected",
  "keyword": "And "
});
formatter.match({
  "location": "com.bank.step_definitions.AccountActivityNavigationDefs.account_drop_down_should_have_selected(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});