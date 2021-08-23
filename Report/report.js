$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Feature/loginpage.feature");
formatter.feature({
  "name": "Verifying Adactin details",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Verifying Adactin login with valid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Am on the Adactin page",
  "keyword": "Given "
});
formatter.step({
  "name": "Am enter the \"\u003cuserName\u003e\", \"\u003cpassword\u003e\" and enter the login button",
  "keyword": "When "
});
formatter.step({
  "name": "I search the Hotel \"\u003clocation\u003e\",\"\u003chotel\u003e\",\"\u003croomType\u003e\",\"\u003cnoOfRooms\u003e\",\"\u003cadult\u003e\",\"\u003cchild\u003e\" and select the Hotel",
  "keyword": "And "
});
formatter.step({
  "name": "I enter the details \"\u003cfirstName\u003e\",\"\u003clastName\u003e\",\"\u003caddress\u003e\",\"\u003ccardNo\u003e\",\"\u003ccardType\u003e\",\"\u003cmonth\u003e\",\"\u003cyear\u003e\",\"\u003ccvv\u003e\" and order the Hotel",
  "keyword": "And "
});
formatter.step({
  "name": "I should get the order Id",
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
        "password",
        "location",
        "hotel",
        "roomType",
        "noOfRooms",
        "adult",
        "child",
        "firstName",
        "lastName",
        "address",
        "cardNo",
        "cardType",
        "month",
        "year",
        "cvv"
      ]
    },
    {
      "cells": [
        "Tamilselvan1101",
        "Tamil@1101",
        "Melbourne",
        "Hotel Creek",
        "Standard",
        "1 - One",
        "1 - One",
        "1 - One",
        "Tamil",
        "Antony",
        "Chennai",
        "9876567876543345",
        "American Express",
        "January",
        "2021",
        "255"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verifying Adactin login with valid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Am on the Adactin page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginPageStepdef.adactinPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Am enter the \"Tamilselvan1101\", \"Tamil@1101\" and enter the login button",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageStepdef.usernameAndPasswordAndLogin(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I search the Hotel \"Melbourne\",\"Hotel Creek\",\"Standard\",\"1 - One\",\"1 - One\",\"1 - One\" and select the Hotel",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageStepdef.searchHotelAndSelectHotel(String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter the details \"Tamil\",\"Antony\",\"Chennai\",\"9876567876543345\",\"American Express\",\"January\",\"2021\",\"255\" and order the Hotel",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageStepdef.enterDetailsAndOrder(String,String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should get the order Id",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageStepdef.orderId()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});