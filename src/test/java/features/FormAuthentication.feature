Feature:Verify form authentication

  Background:

    Given the user navigate to the home page
    And the user follows "Form Authentication" link


  Scenario: Verify form authentication with valid credential

    When the user enter "tomsmith" in user name field
    And the user enter "SuperSecretPassword!" in password field
    And the user click on login button
    Then the user should see "Secure Area" text on the page
    And the user should see "Welcome to the Secure Area. When you are done click logout below." text on the page

  Scenario: Verify the form authentication with invalid credential

    When the user enter "tanu" in user name field
    And the user enter "password" in password field
    And the user click on login button
    Then the user should see " Your username is invalid!" text on the page

  Scenario: Verify the form authentication with valid credential and single step to login

    When the user enter "tomsmith" in user name field and enter the "SuperSecretPassword!" in password field and  click on the login button
    Then the user should see "Secure Area" text on the page

  Scenario Outline: :4.Verify form authentication with data driven
    When the user enter "<username>" in user name field and enter the "<password>" in password field and  click on the login button
    Then the user should see "<expectedText>" text on the page

    Examples:
      | username | password             | expectedText |
      | tomsmith | SuperSecretPassword! | Secure Area  |
      | tomsmitn | SuperSecretPassword? | Your username is invalid!|