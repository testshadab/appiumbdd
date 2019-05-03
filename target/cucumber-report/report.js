$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("F:/ECOM_DemoTest/MobileApp/src/test/resources/SignUp.Feature");
formatter.feature({
  "line": 2,
  "name": "signup  Functionality Feature",
  "description": "",
  "id": "signup--functionality-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@signupvalidationtesting1"
    }
  ]
});
formatter.scenarioOutline({
  "line": 29,
  "name": "valid data for signup test.",
  "description": "",
  "id": "signup--functionality-feature;valid-data-for-signup-test.",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 28,
      "name": "@signupvalidationtesting"
    }
  ]
});
formatter.step({
  "line": 30,
  "name": "Tap on Next CTA",
  "keyword": "Given "
});
formatter.step({
  "line": 31,
  "name": "Tap on Register option CTA.",
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "Close the alert message.",
  "keyword": "Given "
});
formatter.step({
  "line": 33,
  "name": "Enter first Name \"\u003cFirst Name\u003e\" in first name text field.",
  "keyword": "Then "
});
formatter.step({
  "line": 34,
  "name": "Enter last Name \"\u003cLast Name\u003e\" in Last name text field.",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 35,
      "value": "#\tThen   Select the Date Of Birth."
    }
  ],
  "line": 36,
  "name": "Enter email address \"\u003cEmail\u003e\".",
  "keyword": "Then "
});
formatter.step({
  "line": 37,
  "name": "Enter password \"\u003cPassword\u003e\".",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "Tap on Register button.",
  "keyword": "Then "
});
formatter.examples({
  "line": 39,
  "name": "",
  "description": "",
  "id": "signup--functionality-feature;valid-data-for-signup-test.;",
  "rows": [
    {
      "cells": [
        "First Name",
        "Last Name",
        "Email",
        "Password"
      ],
      "line": 40,
      "id": "signup--functionality-feature;valid-data-for-signup-test.;;1"
    },
    {
      "cells": [
        "Test",
        "Test",
        "test",
        "Test@123"
      ],
      "line": 41,
      "id": "signup--functionality-feature;valid-data-for-signup-test.;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 41,
  "name": "valid data for signup test.",
  "description": "",
  "id": "signup--functionality-feature;valid-data-for-signup-test.;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 28,
      "name": "@signupvalidationtesting"
    },
    {
      "line": 1,
      "name": "@signupvalidationtesting1"
    }
  ]
});
formatter.step({
  "line": 30,
  "name": "Tap on Next CTA",
  "keyword": "Given "
});
formatter.step({
  "line": 31,
  "name": "Tap on Register option CTA.",
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "Close the alert message.",
  "keyword": "Given "
});
formatter.step({
  "line": 33,
  "name": "Enter first Name \"Test\" in first name text field.",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 34,
  "name": "Enter last Name \"Test\" in Last name text field.",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 35,
      "value": "#\tThen   Select the Date Of Birth."
    }
  ],
  "line": 36,
  "name": "Enter email address \"test\".",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 37,
  "name": "Enter password \"Test@123\".",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "Tap on Register button.",
  "keyword": "Then "
});
formatter.match({
  "location": "Signupapp_StepDefinition.launchapp()"
});
formatter.result({
  "duration": 4495522900,
  "status": "passed"
});
formatter.match({
  "location": "Signupapp_StepDefinition.tap_on_Register_CTA()"
});
formatter.result({
  "duration": 2123562699,
  "status": "passed"
});
formatter.match({
  "location": "Signupapp_StepDefinition.close_in()"
});
formatter.result({
  "duration": 20199210899,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Test",
      "offset": 18
    }
  ],
  "location": "Signupapp_StepDefinition.enter_first_Name_in_first_name_text_field(String)"
});
formatter.result({
  "duration": 13881717100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Test",
      "offset": 17
    }
  ],
  "location": "Signupapp_StepDefinition.enter_last_Name_in_Last_name_text_field(String)"
});
formatter.result({
  "duration": 15811749800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "test",
      "offset": 21
    }
  ],
  "location": "Signupapp_StepDefinition.random_email(String)"
});
formatter.result({
  "duration": 16531169399,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Test@123",
      "offset": 16
    }
  ],
  "location": "Signupapp_StepDefinition.enter_password(String)"
});
formatter.result({
  "duration": 17171635400,
  "error_message": "org.openqa.selenium.NoSuchElementException: UiSelector[INSTANCE\u003d0, RESOURCE_ID\u003dcom.nethues.mobius:id/edit_text_pswd]\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027AMW-G1\u0027, ip: \u0027169.254.33.173\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_131\u0027\nDriver info: io.appium.java_client.android.AndroidDriver\nCapabilities {app: C:\\Users\\AL Moin Webtech\\Do..., appActivity: md5663180cb395b87679fcdb6cb..., appPackage: com.nethues.mobius, browserName: , databaseEnabled: false, desired: {app: C:\\Users\\AL Moin Webtech\\Do..., appActivity: md5663180cb395b87679fcdb6cb..., appPackage: com.nethues.mobius, browserName: , deviceName: Android, noReset: true, platformName: android, platformVersion: 7.1.1, skipUnlock: true}, deviceManufacturer: motorola, deviceModel: Moto E (4), deviceName: ZW2223XXGX, deviceScreenSize: 720x1280, deviceUDID: ZW2223XXGX, javascriptEnabled: true, locationContextEnabled: false, networkConnectionEnabled: true, noReset: true, platform: LINUX, platformName: Android, platformVersion: 7.1.1, skipUnlock: true, takesScreenshot: true, warnings: {}, webStorageEnabled: false}\nSession ID: d4df6712-3630-43c9-8c16-215755c672ba\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat io.appium.java_client.remote.AppiumCommandExecutor.execute(AppiumCommandExecutor.java:239)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat io.appium.java_client.DefaultGenericMobileDriver.execute(DefaultGenericMobileDriver.java:42)\r\n\tat io.appium.java_client.AppiumDriver.execute(AppiumDriver.java:1)\r\n\tat io.appium.java_client.android.AndroidDriver.execute(AndroidDriver.java:1)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:285)\r\n\tat io.appium.java_client.DefaultGenericMobileElement.execute(DefaultGenericMobileElement.java:45)\r\n\tat io.appium.java_client.MobileElement.execute(MobileElement.java:1)\r\n\tat io.appium.java_client.android.AndroidElement.execute(AndroidElement.java:1)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.sendKeys(RemoteWebElement.java:106)\r\n\tat testRunner.apptest.Signupapp_StepDefinition.enter_password(Signupapp_StepDefinition.java:130)\r\n\tat ✽.And Enter password \"Test@123\".(F:/ECOM_DemoTest/MobileApp/src/test/resources/SignUp.Feature:37)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Signupapp_StepDefinition.Tap_register_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 43,
  "name": "",
  "description": "",
  "id": "signup--functionality-feature;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 42,
      "name": "@signupvalidationtesting"
    }
  ]
});
formatter.step({
  "line": 44,
  "name": "Tap on user profile.",
  "keyword": "Then "
});
formatter.match({
  "location": "Signupapp_StepDefinition.Tap_profile_button()"
});
});