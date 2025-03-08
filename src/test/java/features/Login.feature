Feature: Automation Testing POC

  Scenario Outline: Register User
    Given User launches the browser
    When User navigates to url "http://automationexercise.com"
    Then Verify that home page is visible successfully
    When User clicks on Signup Login button
    Then Verify Login to your account is visible
    When User enters name "<name>" and email "<email>"
    And User clicks on Signup button
    Then Verify that ENTER ACCOUNT INFORMATION is visible
    Then Fill details Title "<title>" Password "<password>" Day "<Day>" month "<Month>" year"<Year>"
    And User select Sign up for our newsletter checkbox
    And User select Receive special offers from our partners checkbox
    Then user fill personal details First name "<FirstName>" Last name "<LastName>" Company "<Company>" Address "<Country>" Country "<Country>" State "<State>" City "<City>" Zipcode "<Zipcode>" Mobile Number "<MobileNumber>"
    Then Click on Create Account button
    Then Verify that ACCOUNT CREATED is visible
    Then Click on Continue button
    Then Verify that Logged in as "<username>" is visible
    Then Click on Delete Account button
    Then Verify that ACCOUNT DELETED is visible and click Continue button

    Examples: 
      | name    | email                 | title | password  | Day | Month    | Year | FirstName | LastName | Company   | Address          | Country | State      | City    | Zipcode | MobileNumber | username |
      | rebel   | rebelsam007@gmail.com | Mr    | admin1234 |  12 | December | 1990 | Sam       | Raj      | accenture | Titelpark        | India   | Tamil Nadu | Chennai |  600113 |   9984628044 | sam      |
      | Karthik | karthik0101@gmail.com | Mr    | admin1234 |  05 | August   | 1989 | Karthik   | Suburaj  | Zoho      | Chennai One Park | India   | Tamil Nadu | Chennai |  600023 |   9845458044 | Karthik  |
