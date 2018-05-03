$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri('automationassignment\contactus.feature');
formatter.feature({
  "line": 1,
  "name": "annotation",
  "description": "",
  "id": "annotation",
  "keyword": "Feature"
});
formatter.background({
  "comments": [
    {
      "line": 2,
      "value": "#Fill in the Contact us form and Submit it."
    },
    {
      "line": 3,
      "value": "#Submit the form without entering email and verify if the error message shown is \"Invalid email address.\""
    }
  ],
  "line": 5,
  "name": "",
  "description": " User navigates to automationpractice.com",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 7,
  "name": "I am on automationpractice.com page",
  "keyword": "Given "
});
formatter.match({
  "location": "ContactUsTest.goToAutomationPractice()"
});
formatter.result({
  "duration": 14141687777,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "",
  "description": "",
  "id": "annotation;",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "I choose Subject Heading as \"Customer Service\"",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I enter Email Address as \"test@test.com\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I enter Message as \"test message\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Message send success alert",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Customer Service",
      "offset": 29
    }
  ],
  "location": "ContactUsTest.enterSubjectHeading(String)"
});
formatter.result({
  "duration": 1713036054,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "test@test.com",
      "offset": 26
    }
  ],
  "location": "ContactUsTest.enterEmail(String)"
});
formatter.result({
  "duration": 50850887,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "test message",
      "offset": 20
    }
  ],
  "location": "ContactUsTest.enterMessage(String)"
});
formatter.result({
  "duration": 1642154776,
  "status": "passed"
});
formatter.match({
  "location": "ContactUsTest.messageSuccess()"
});
formatter.result({
  "duration": 688347887,
  "status": "passed"
});
formatter.background({
  "comments": [
    {
      "line": 2,
      "value": "#Fill in the Contact us form and Submit it."
    },
    {
      "line": 3,
      "value": "#Submit the form without entering email and verify if the error message shown is \"Invalid email address.\""
    }
  ],
  "line": 5,
  "name": "",
  "description": " User navigates to automationpractice.com",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 7,
  "name": "I am on automationpractice.com page",
  "keyword": "Given "
});
formatter.match({
  "location": "ContactUsTest.goToAutomationPractice()"
});
formatter.result({
  "duration": 18492980346,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "",
  "description": "",
  "id": "annotation;",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 16,
  "name": "I choose Subject Heading as \"Customer Service\"",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "I enter Email Address as \"test\"",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I enter Message as \"test message\"",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "error alert should be available",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Customer Service",
      "offset": 29
    }
  ],
  "location": "ContactUsTest.enterSubjectHeading(String)"
});
formatter.result({
  "duration": 1853027383,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "test",
      "offset": 26
    }
  ],
  "location": "ContactUsTest.enterEmail(String)"
});
formatter.result({
  "duration": 55480804,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "test message",
      "offset": 20
    }
  ],
  "location": "ContactUsTest.enterMessage(String)"
});
formatter.result({
  "duration": 1984917213,
  "status": "passed"
});
formatter.match({
  "location": "ContactUsTest.checkRelogin()"
});
formatter.result({
  "duration": 1225904563,
  "status": "passed"
});
formatter.uri('automationassignment\subsriber.feature');
formatter.feature({
  "line": 1,
  "name": "annotation",
  "description": "",
  "id": "annotation",
  "keyword": "Feature"
});
formatter.background({
  "comments": [
    {
      "line": 2,
      "value": "#Fill in the Contact us form and Submit it."
    },
    {
      "line": 3,
      "value": "#Submit the form without entering email and verify if the error message shown is \"Invalid email address.\""
    }
  ],
  "line": 5,
  "name": "",
  "description": " User navigates to automationpractice.com",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 7,
  "name": "I am on automationpractice.com page",
  "keyword": "Given "
});
formatter.match({
  "location": "ContactUsTest.goToAutomationPractice()"
});
formatter.result({
  "duration": 15050755581,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "",
  "description": "",
  "id": "annotation;",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "I enter email address in subscriber field \"test@test\"",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I enter Email Address as \"test@test.com\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I enter Message as \"test message\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Message send success alert",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "arguments": [
    {
      "val": "test@test.com",
      "offset": 26
    }
  ],
  "location": "ContactUsTest.enterEmail(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "test message",
      "offset": 20
    }
  ],
  "location": "ContactUsTest.enterMessage(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ContactUsTest.messageSuccess()"
});
formatter.result({
  "status": "skipped"
});
formatter.background({
  "comments": [
    {
      "line": 2,
      "value": "#Fill in the Contact us form and Submit it."
    },
    {
      "line": 3,
      "value": "#Submit the form without entering email and verify if the error message shown is \"Invalid email address.\""
    }
  ],
  "line": 5,
  "name": "",
  "description": " User navigates to automationpractice.com",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 7,
  "name": "I am on automationpractice.com page",
  "keyword": "Given "
});
formatter.match({
  "location": "ContactUsTest.goToAutomationPractice()"
});
formatter.result({
  "duration": 16171525888,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "",
  "description": "",
  "id": "annotation;",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 16,
  "name": "I choose Subject Heading as \"Customer Service\"",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "I enter Email Address as \"test\"",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I enter Message as \"test message\"",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "error alert should be available",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Customer Service",
      "offset": 29
    }
  ],
  "location": "ContactUsTest.enterSubjectHeading(String)"
});
formatter.result({
  "duration": 1539569344,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "test",
      "offset": 26
    }
  ],
  "location": "ContactUsTest.enterEmail(String)"
});
formatter.result({
  "duration": 38008524,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "test message",
      "offset": 20
    }
  ],
  "location": "ContactUsTest.enterMessage(String)"
});
formatter.result({
  "duration": 1801868096,
  "status": "passed"
});
formatter.match({
  "location": "ContactUsTest.checkRelogin()"
});
formatter.result({
  "duration": 1004596682,
  "status": "passed"
});
});