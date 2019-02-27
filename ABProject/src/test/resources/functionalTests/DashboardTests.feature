Feature: Dashboard Tests

  Background: 
    Given I have opened browser
    And opened Udio website
    And I click Login Button
    And user waits for loader to disappear
    And I click Consumer Radio button
    When I click Continue button
    And user waits for loader to disappear
    Then I am taken to Login Page
    And user enters details of "9168029826"
    And clicks Continue
    And user taps skip on Modal

  Scenario: Check scroll
    And user does a left scroll
