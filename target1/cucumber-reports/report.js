$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Featurefile.feature");
formatter.feature({
  "line": 1,
  "name": "Login",
  "description": "",
  "id": "login",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Login Functionality",
  "description": "",
  "id": "login;login-functionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "user navigates to the website 75health",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "user click on signin",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "user login to application using Username as \"demo@kaaspro.com\" and Password as \"1\"",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "homepage is populated",
  "keyword": "Then "
});
formatter.match({
  "location": "Definition.user_navigates_to_the_website_75healthcom()"
});
formatter.result({
  "duration": 10876776801,
  "status": "passed"
});
formatter.match({
  "location": "Definition.user_click_on_signin()"
});
formatter.result({
  "duration": 5542604100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "demo@kaaspro.com",
      "offset": 45
    },
    {
      "val": "1",
      "offset": 80
    }
  ],
  "location": "Definition.user_login_to_application_using_username_as_something_and_password_as_something(String,String)"
});
formatter.result({
  "duration": 221117600,
  "status": "passed"
});
formatter.match({
  "location": "Definition.homepage_is_populated()"
});
formatter.result({
  "duration": 65836801,
  "status": "passed"
});
formatter.after({
  "duration": 699328200,
  "status": "passed"
});
});