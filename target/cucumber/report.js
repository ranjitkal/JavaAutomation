$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("CreateCompany.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#StoryType\u003dWEB"
    },
    {
      "line": 2,
      "value": "#Owner\u003dejagruti"
    },
    {
      "line": 3,
      "value": "#CreationDate\u003d24-12-2017 Sunday"
    }
  ],
  "line": 5,
  "name": "Create Company Feature",
  "description": "",
  "id": "create-company-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 4,
      "name": "@CreateCompany"
    }
  ]
});
formatter.background({
  "line": 7,
  "name": "add new company successfully.",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 8,
  "name": "user opens the \"IE\" browser",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user enters the url \"http://localhost:90/finsys\"",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "IE",
      "offset": 16
    }
  ],
  "location": "Login.OpenBrowser(String)"
});
formatter.result({
  "duration": 183393501,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://localhost:90/finsys",
      "offset": 21
    }
  ],
  "location": "Login.applicationUrl(String)"
});
formatter.result({
  "duration": 185182,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Login Functionality for valid username and password",
  "description": "",
  "id": "create-company-feature;login-functionality-for-valid-username-and-password",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@SmokeTest"
    },
    {
      "line": 11,
      "name": "@EndToEnd"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "user is on the application login page",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "user enters \"dummyfm\" as username",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "user enters \"passw0rd\" as password",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "user clicks on login button",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "user is on the application home page",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "user gets the message starting with \"Welcome\" on the top",
  "keyword": "And "
});
formatter.match({
  "location": "Login.logipage()"
});
formatter.result({
  "duration": 126021,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "dummyfm",
      "offset": 13
    }
  ],
  "location": "Login.enterUsername(String)"
});
formatter.result({
  "duration": 167758,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "passw0rd",
      "offset": 13
    }
  ],
  "location": "Login.enterPassword(String)"
});
formatter.result({
  "duration": 158843,
  "status": "passed"
});
formatter.match({
  "location": "Login.clickLoginButton()"
});
formatter.result({
  "duration": 102113,
  "status": "passed"
});
formatter.match({
  "location": "Login.homepage()"
});
formatter.result({
  "duration": 88336,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Welcome",
      "offset": 37
    }
  ],
  "location": "Login.getMessage(String)"
});
formatter.result({
  "duration": 181941,
  "status": "passed"
});
formatter.background({
  "line": 7,
  "name": "add new company successfully.",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 8,
  "name": "user opens the \"IE\" browser",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user enters the url \"http://localhost:90/finsys\"",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "IE",
      "offset": 16
    }
  ],
  "location": "Login.OpenBrowser(String)"
});
formatter.result({
  "duration": 220436,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://localhost:90/finsys",
      "offset": 21
    }
  ],
  "location": "Login.applicationUrl(String)"
});
formatter.result({
  "duration": 173836,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "Login Functionality for valid All valid credentials.",
  "description": "",
  "id": "create-company-feature;login-functionality-for-valid-all-valid-credentials.",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 20,
      "name": "@SmokeTest"
    },
    {
      "line": 20,
      "name": "@EndToEnd"
    }
  ]
});
formatter.step({
  "line": 22,
  "name": "user is on the application login page",
  "keyword": "Given "
});
formatter.step({
  "line": 23,
  "name": "user enters \"dummyfm\" as username",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "user enters \"Password\" as password",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "user clicks on login button",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "user is on the application home page",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "user gets the message starting with \"Welcome\" on the top",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "user click manage company",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "user is on application manage company page",
  "keyword": "Then "
});
formatter.step({
  "line": 31,
  "name": "User Click on New Icon which is at the Top of displayed List.",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "user is on the Application create company page.",
  "keyword": "Then "
});
formatter.step({
  "line": 33,
  "name": "user is on the application Create Company page.",
  "keyword": "Given "
});
formatter.step({
  "line": 34,
  "name": "user enters \"Ejagruti.pvt.ltd\" as companyname.",
  "keyword": "When "
});
formatter.step({
  "line": 35,
  "name": "user select dropdownlist  \"IT\" as companytype.",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "user select dropdownlist  \"sERVICE\" as company SUB type.",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "user enters \"office number 10,icon building ,baner,pune\" as address",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "user enters \"02054585\" as phone",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "user enters \"ejagruti@gmail.com\" as Email",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "user enters \"AAAPL1234C\" as pan details",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "user enters \"874587458745\" as Tin Details",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "user enters \"8989858585\" as Mobile number",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "user select dropdownlist  \"India\" as Country.",
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "user select dropdownlist  \"Maharashtra\" as state.",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "user select dropdownlist  \"Pune\" as city.",
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "user enters \"20\" as total emplyoee.",
  "keyword": "And "
});
formatter.step({
  "line": 47,
  "name": "user clicks on Save button.",
  "keyword": "And "
});
formatter.step({
  "line": 48,
  "name": "user see newly created company on the Top Of displayed Company List.",
  "keyword": "Then "
});
formatter.step({
  "line": 49,
  "name": "user gets the message New Company is created successfully.",
  "keyword": "And "
});
formatter.match({
  "location": "Login.logipage()"
});
formatter.result({
  "duration": 121159,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "dummyfm",
      "offset": 13
    }
  ],
  "location": "Login.enterUsername(String)"
});
formatter.result({
  "duration": 194097,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Password",
      "offset": 13
    }
  ],
  "location": "Login.enterPassword(String)"
});
formatter.result({
  "duration": 220031,
  "status": "passed"
});
formatter.match({
  "location": "Login.clickLoginButton()"
});
formatter.result({
  "duration": 81447,
  "status": "passed"
});
formatter.match({
  "location": "Login.homepage()"
});
formatter.result({
  "duration": 79421,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Welcome",
      "offset": 37
    }
  ],
  "location": "Login.getMessage(String)"
});
formatter.result({
  "duration": 178293,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "CreateCompany.clickNew()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CreateCompany.creteCompany()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "arguments": [
    {
      "val": "Ejagruti.pvt.ltd",
      "offset": 13
    }
  ],
  "location": "CreateCompany.enterCompanyName(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "arguments": [
    {
      "val": "sERVICE",
      "offset": 27
    }
  ],
  "location": "CreateCompany.selectCompanySubType(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "arguments": [
    {
      "val": "AAAPL1234C",
      "offset": 13
    }
  ],
  "location": "CreateCompany.Enterpandetails(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "874587458745",
      "offset": 13
    }
  ],
  "location": "CreateCompany.EnterTinDetails(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "8989858585",
      "offset": 13
    }
  ],
  "location": "CreateCompany.enterMobile(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "India",
      "offset": 27
    }
  ],
  "location": "CreateCompany.selectCompany(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Maharashtra",
      "offset": 27
    }
  ],
  "location": "CreateCompany.selectState(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Pune",
      "offset": 27
    }
  ],
  "location": "CreateCompany.selectCity(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "20",
      "offset": 13
    }
  ],
  "location": "CreateCompany.enterTotalEmployee(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CreateCompany.clickSave()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CreateCompany.checkCompany()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CreateCompany.getMessage()"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("Login.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#StoryType\u003dWEB"
    },
    {
      "line": 2,
      "value": "#Owner\u003dejagruti"
    },
    {
      "line": 3,
      "value": "#CreationDate\u003d24-12-2017 Sunday"
    }
  ],
  "line": 5,
  "name": "Login Feature",
  "description": "",
  "id": "login-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 4,
      "name": "@Login"
    }
  ]
});
formatter.background({
  "line": 7,
  "name": "user is successfully logged in",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 8,
  "name": "user opens the \"IE\" browser",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user enters the url \"http://localhost:90/finsys\"",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "IE",
      "offset": 16
    }
  ],
  "location": "Login.OpenBrowser(String)"
});
formatter.result({
  "duration": 200175,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://localhost:90/finsys",
      "offset": 21
    }
  ],
  "location": "Login.applicationUrl(String)"
});
formatter.result({
  "duration": 151955,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Login Functionality for valid username and password",
  "description": "",
  "id": "login-feature;login-functionality-for-valid-username-and-password",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@SmokeTest"
    },
    {
      "line": 11,
      "name": "@EndToEnd"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "user is on the application login page",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "user enters \"dummyfm\" as username",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "user enters \"passw0rd\" as password",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "user clicks on login button",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "user is on the application home page",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "user gets the message starting with \"Welcome\" on the top",
  "keyword": "And "
});
formatter.match({
  "location": "Login.logipage()"
});
formatter.result({
  "duration": 144661,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "dummyfm",
      "offset": 13
    }
  ],
  "location": "Login.enterUsername(String)"
});
formatter.result({
  "duration": 167353,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "passw0rd",
      "offset": 13
    }
  ],
  "location": "Login.enterPassword(String)"
});
formatter.result({
  "duration": 148713,
  "status": "passed"
});
formatter.match({
  "location": "Login.clickLoginButton()"
});
formatter.result({
  "duration": 88337,
  "status": "passed"
});
formatter.match({
  "location": "Login.homepage()"
});
formatter.result({
  "duration": 67265,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Welcome",
      "offset": 37
    }
  ],
  "location": "Login.getMessage(String)"
});
formatter.result({
  "duration": 123589,
  "status": "passed"
});
});