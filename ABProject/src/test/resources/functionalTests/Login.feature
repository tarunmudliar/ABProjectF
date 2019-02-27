Feature: Login on Udio

  Background: 
    Given I have opened browser
    And opened Udio website
    And I click Login Button
    And user waits for loader to disappear
    And I click Consumer Radio button
    When I click Continue button
    And user waits for loader to disappear

  Scenario: Consumer User can navigate to Login Page
    Then I am taken to Login Page

  Scenario Outline: Consumer user can login to Udio Website
    Then I am taken to Login Page
    And user enters details of "<Mobile Number>"
    And clicks Continue
    And user waits for loader to disappear
    And user taps skip on Modal
    Then user lands on home page

    Examples: 
      | Mobile Number |
      |    9168029826 |

