$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/FindTransactions.feature");
formatter.feature({
  "name": "Find Transactions in Account Activity",
  "description": "",
  "keyword": "Feature"
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
  "keyword": "Given "
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
formatter.step({
  "name": "click \"Account Activity\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.bank.step_definitions.LoginDefs.click_button(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Type",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.step({
  "name": "the user accesses the Find Transactions tab",
  "keyword": "And "
});
formatter.match({
  "location": "com.bank.step_definitions.FindTransactionsDefs.the_user_accesses_the_Find_Transactions_tab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click \"find\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.bank.step_definitions.LoginDefs.click_button(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "results table should show at least one result under \"Deposit\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.bank.step_definitions.FindTransactionsDefs.results_table_should_show_at_least_one_result_under(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "results table should show at least one result under \"Withdrawal\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.bank.step_definitions.FindTransactionsDefs.results_table_should_show_at_least_one_result_under(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects type \"Deposit\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.bank.step_definitions.FindTransactionsDefs.user_selects_type(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "results table should show at least one result under \"Deposit\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.bank.step_definitions.FindTransactionsDefs.results_table_should_show_at_least_one_result_under(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "results table should show no result under \"Withdrawal\"",
  "keyword": "But "
});
formatter.match({
  "location": "com.bank.step_definitions.FindTransactionsDefs.results_table_should_show_no_result_under(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects type \"Withdrawal\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.bank.step_definitions.FindTransactionsDefs.user_selects_type(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "results table should show at least one result under \"Withdrawal\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.bank.step_definitions.FindTransactionsDefs.results_table_should_show_at_least_one_result_under(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "results table should show no result under \"Deposit\"",
  "keyword": "But "
});
formatter.match({
  "location": "com.bank.step_definitions.FindTransactionsDefs.results_table_should_show_no_result_under(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});