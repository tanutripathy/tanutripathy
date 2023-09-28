Feature: Verify the

  Background:
    Given the user navigate to the home page
    And the user follows "JavaScript Alerts" link

  @SmokeTest
  Scenario: 1.Verify the JS Alert works as expected
    When the user click on JS Alert button
    Then the user should see "I am a JS Alert" text on JS Alert page
    And the user should see "you successfully clicked an alert" text on the JS Alert page

  @tanu
  Scenario: 2.Verify the JS Confirm work as expected
    When the user click on JS Confirm button
    Then the user should see "I am a JS Confirm" text on JS Confirm page
    And the user should see "You clicked: Ok" text on the JS Confirm page

  @lucky
  Scenario Outline: 3.Verify the JS Prompt work as expected
    When the user click on JS Prompt button
    Then the user should see "I am a JS prompt" text on JS Prompt page
    Then the user should enter "<name>" on the JS Alert page
    And the user should see "You entered:<name>" text on the JS Prompt page
    Examples:
      | name  |
      | lucky |



    