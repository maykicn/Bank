$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/accountSummary.feature");
formatter.feature({
  "name": "Account Summary",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Account summary page should have",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.step({
  "name": "verify that the page has \"\u003caccount types\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "account types"
      ]
    },
    {
      "cells": [
        "Cash Accounts"
      ]
    },
    {
      "cells": [
        "Investment AccountsA"
      ]
    },
    {
      "cells": [
        "Credit Accounts"
      ]
    },
    {
      "cells": [
        "Loan Accounts"
      ]
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
formatter.step({
  "name": "verify that \"Zero - Account Summary\" page is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "com.bank.step_definitions.LoginDefs.verify_that_page_is_displayed(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Account summary page should have",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.step({
  "name": "verify that the page has \"Cash Accounts\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.bank.step_definitions.AccountDefs.verify_that_the_page_has(java.lang.String)"
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
formatter.step({
  "name": "verify that \"Zero - Account Summary\" page is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "com.bank.step_definitions.LoginDefs.verify_that_page_is_displayed(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Account summary page should have",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.step({
  "name": "verify that the page has \"Investment AccountsA\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.bank.step_definitions.AccountDefs.verify_that_the_page_has(java.lang.String)"
});
formatter.result({
  "error_message": "java.lang.AssertionError: page has notInvestment AccountsA expected:\u003cInvestment AccountsA\u003e but was:\u003cnull\u003e\r\n\tat org.junit.Assert.fail(Assert.java:89)\r\n\tat org.junit.Assert.failNotEquals(Assert.java:835)\r\n\tat org.junit.Assert.assertEquals(Assert.java:120)\r\n\tat com.bank.step_definitions.AccountDefs.verify_that_the_page_has(AccountDefs.java:27)\r\n\tat ✽.verify that the page has \"Investment AccountsA\"(file:///D:/PROJECTS/Bank/src/test/resources/features/accountSummary.feature:13)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png", "screenshot");
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
formatter.step({
  "name": "verify that \"Zero - Account Summary\" page is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "com.bank.step_definitions.LoginDefs.verify_that_page_is_displayed(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Account summary page should have",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.step({
  "name": "verify that the page has \"Credit Accounts\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.bank.step_definitions.AccountDefs.verify_that_the_page_has(java.lang.String)"
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
formatter.step({
  "name": "verify that \"Zero - Account Summary\" page is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "com.bank.step_definitions.LoginDefs.verify_that_page_is_displayed(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Account summary page should have",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.step({
  "name": "verify that the page has \"Loan Accounts\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.bank.step_definitions.AccountDefs.verify_that_the_page_has(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});