$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("feature1.feature");
formatter.feature({
  "line": 2,
  "name": "application login",
  "description": "",
  "id": "application-login",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Work"
    }
  ]
});
formatter.scenario({
  "line": 3,
  "name": "home page default login",
  "description": "",
  "id": "application-login;home-page-default-login",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user is on landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user login into the application with username and password",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Home page is populated",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "cards are displayed",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "all The elements are enabled",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinition1.user_is_on_lading_page()"
});
formatter.result({
  "duration": 41961982968,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition1.user_login_into_the_application_with_username_and_password()"
});
formatter.result({
  "duration": 4999721441,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition1.Home_page_is_populated()"
});
formatter.result({
  "duration": 2693700,
  "error_message": "java.lang.AssertionError: failed step\r\n\tat org.junit.Assert.fail(Assert.java:88)\r\n\tat stepDefinitions.stepDefinition1.Home_page_is_populated(stepDefinition1.java:46)\r\n\tat ✽.Then Home page is populated(feature1.feature:6)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "stepDefinition1.cards_are_displayed()"
});
formatter.result({
  "duration": 112818,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition1.all_rhe_elements_are_enabled()"
});
formatter.result({
  "duration": 4999957334,
  "status": "passed"
});
});