$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Feature/login.feature");
formatter.feature({
  "line": 1,
  "name": "Login Validation",
  "description": "",
  "id": "login-validation",
  "keyword": "Feature"
});
formatter.before({
  "duration": 41479165544,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Successful Login with Valid Credentials",
  "description": "",
  "id": "login-validation;successful-login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User has to launch the Application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enter the value username and password",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User click on the login button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User should logged into the application",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginTest.user_has_to_launch_the_Application()"
});
formatter.result({
  "duration": 3653783376,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.user_enter_the_value_username_and_password()"
});
formatter.result({
  "duration": 912831834,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.user_click_on_the_login_button()"
});
formatter.result({
  "duration": 16056480205,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.user_should_logged_into_the_application()"
});
formatter.result({
  "duration": 14472048,
  "status": "passed"
});
formatter.after({
  "duration": 135216,
  "status": "passed"
});
});