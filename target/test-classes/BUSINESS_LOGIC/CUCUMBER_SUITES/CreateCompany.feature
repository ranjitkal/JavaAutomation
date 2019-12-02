#StoryType=WEB
#Owner=ejagruti
#CreationDate=24-12-2017 Sunday
@CreateCompany
Feature: Create Company Feature

  Background:add new company successfully.
  When user opens the "IE" browser
  And user enters the url "http://localhost:90/finsys"

  @SmokeTest @EndToEnd
  Scenario: Login Functionality for valid username and password
    Given user is on the application login page
    When user enters "dummyfm" as username
    And user enters "passw0rd" as password
    And user clicks on login button
    Then user is on the application home page
    And user gets the message starting with "Welcome" on the top

 @SmokeTest @EndToEnd
  Scenario: Login Functionality for valid All valid credentials.
  Given user is on the application login page
  When user enters "dummyfm" as username
  And user enters "Password" as password
  And user clicks on login button
  Then user is on the application home page
  And user gets the message starting with "Welcome" on the top
  
  And user click manage company
  Then user is on application manage company page
  And User Click on New Icon which is at the Top of displayed List.
  Then user is on the Application create company page.
  Given user is on the application Create Company page.
  When user enters "Ejagruti.pvt.ltd" as companyname.
  And user select dropdownlist  "IT" as companytype.
  And user select dropdownlist  "sERVICE" as company SUB type.
  And user enters "office number 10,icon building ,baner,pune" as address
  And user enters "02054585" as phone
  And user enters "ejagruti@gmail.com" as Email
  And user enters "AAAPL1234C" as pan details
  And user enters "874587458745" as Tin Details
  And user enters "8989858585" as Mobile number
  And user select dropdownlist  "India" as Country.
  And user select dropdownlist  "Maharashtra" as state.
  And user select dropdownlist  "Pune" as city.
  And user enters "20" as total emplyoee.
  And user clicks on Save button.
  Then user see newly created company on the Top Of displayed Company List.
  And user gets the message New Company is created successfully.

  
