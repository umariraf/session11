$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./src/test/java/features/new_account.feature");
formatter.feature({
  "line": 1,
  "name": "New Account Page",
  "description": "As a .... I want .... so that ...",
  "id": "new-account-page",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Users would be able to add new account",
  "description": "",
  "id": "new-account-page;users-would-be-able-to-add-new-account",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "a user already logged in as \"techfiosdemo@gmail.com\" and \"abc123\"",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user navigate to Bank Cash -\u003e New Account Page",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "New Accounts Page should display",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user submits \"\u003ctitle\u003e\", \"\u003cdescription\u003e\" and \"\u003cinitial balance\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "created account should be posted",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "new-account-page;users-would-be-able-to-add-new-account;",
  "rows": [
    {
      "cells": [
        "title",
        "description",
        "initial balance"
      ],
      "line": 11,
      "id": "new-account-page;users-would-be-able-to-add-new-account;;1"
    },
    {
      "cells": [
        "Stine",
        "Golf",
        "10000"
      ],
      "line": 12,
      "id": "new-account-page;users-would-be-able-to-add-new-account;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 4637702300,
  "status": "passed"
});
formatter.before({
  "duration": 3130825200,
  "status": "passed"
});
formatter.before({
  "duration": 300400,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Users would be able to add new account",
  "description": "",
  "id": "new-account-page;users-would-be-able-to-add-new-account;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "a user already logged in as \"techfiosdemo@gmail.com\" and \"abc123\"",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user navigate to Bank Cash -\u003e New Account Page",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "New Accounts Page should display",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user submits \"Stine\", \"Golf\" and \"10000\"",
  "matchedColumns": [
    0,
    1,
    2
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "created account should be posted",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "techfiosdemo@gmail.com",
      "offset": 29
    },
    {
      "val": "abc123",
      "offset": 58
    }
  ],
  "location": "NewAccountsSteps.a_user_already_logged_in_as_and(String,String)"
});
formatter.result({
  "duration": 5648863900,
  "status": "passed"
});
formatter.match({
  "location": "NewAccountsSteps.user_navigate_to_Bank_Cash_New_Account_Page()"
});
formatter.result({
  "duration": 2829820600,
  "status": "passed"
});
formatter.match({
  "location": "NewAccountsSteps.new_Accounts_Page_should_display()"
});
formatter.result({
  "duration": 490923000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Stine",
      "offset": 14
    },
    {
      "val": "Golf",
      "offset": 23
    },
    {
      "val": "10000",
      "offset": 34
    }
  ],
  "location": "NewAccountsSteps.user_submits_and(String,String,String)"
});
formatter.result({
  "duration": 8573481700,
  "status": "passed"
});
formatter.match({
  "location": "NewAccountsSteps.account_created_successfully_message_should_display()"
});
formatter.result({
  "duration": 4118419500,
  "status": "passed"
});
formatter.after({
  "duration": 967036900,
  "status": "passed"
});
formatter.after({
  "duration": 874094100,
  "status": "passed"
});
});