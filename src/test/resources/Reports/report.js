$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:/C:/Users/91959/eclipse-workspace/Project730AMBatch/src/test/resources/LoginPage.feature");
formatter.feature({
  "name": "Validation of facebook details",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "validate the login details.",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Reg"
    }
  ]
});
formatter.step({
  "name": "User is on facebook pages",
  "keyword": "Given "
});
formatter.step({
  "name": "user enter \"\u003cuserName\u003e\"username and \"\u003cpassWord\u003e\"password",
  "keyword": "When "
});
formatter.step({
  "name": "user click the login button and message displayed.",
  "keyword": "And "
});
formatter.step({
  "name": "verify success message is displayed",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "userName",
        "passWord"
      ]
    },
    {
      "cells": [
        "test1@gmail.com",
        "234234234"
      ]
    },
    {
      "cells": [
        "test2@gmail.com",
        "789873423"
      ]
    }
  ]
});
formatter.scenario({
  "name": "validate the login details.",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Reg"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on facebook pages",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefintion.user_is_on_facebook_pages()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter \"test1@gmail.com\"username and \"234234234\"password",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefintion.user_enter_username_and_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click the login button and message displayed.",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefintion.user_click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify success message is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefintion.verify_success_message_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "validate the login details.",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Reg"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on facebook pages",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefintion.user_is_on_facebook_pages()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter \"test2@gmail.com\"username and \"789873423\"password",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefintion.user_enter_username_and_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click the login button and message displayed.",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefintion.user_click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify success message is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefintion.verify_success_message_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});