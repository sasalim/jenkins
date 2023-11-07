$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/modif.feature");
formatter.feature({
  "name": "to test modification  functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "modification of user name",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag3"
    }
  ]
});
formatter.step({
  "name": "is navigated to the home page",
  "keyword": "Given "
});
formatter.step({
  "name": "clicks on information button",
  "keyword": "When "
});
formatter.step({
  "name": "clear  \u003cfirstname\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "whrite \u003cfirstname1\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "enter  \u003cpassword\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "clicks save",
  "keyword": "And "
});
formatter.step({
  "name": "information is modified",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "firstname",
        "firstname1",
        "password"
      ]
    },
    {
      "cells": [
        "salim",
        "selim",
        "kelibia2023"
      ]
    }
  ]
});
formatter.scenario({
  "name": "modification of user name",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag3"
    }
  ]
});
formatter.step({
  "name": "is navigated to the home page",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "clicks on information button",
  "keyword": "When "
});
formatter.match({
  "location": "steps.modifSteps.clicks_on_information_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "clear  salim",
  "keyword": "And "
});
formatter.match({
  "location": "steps.modifSteps.clear_salim(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "whrite selim",
  "keyword": "And "
});
formatter.match({
  "location": "steps.modifSteps.whrite_selim(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "enter  kelibia2023",
  "keyword": "And "
});
formatter.match({
  "location": "steps.modifSteps.enter_password(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "clicks save",
  "keyword": "And "
});
formatter.match({
  "location": "steps.modifSteps.clicks_save()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "information is modified",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});