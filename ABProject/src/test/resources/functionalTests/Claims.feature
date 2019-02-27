Feature: Claims and Reimbursements
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
    Then user lands on home page  
    @Functional  
    Scenario: User is able to save claim in Drafts
    Given user clicks on Claims&Reimbursement
    And user clicks on New Claim
    And user enters Claim name "Test"
    And user clicks Cash and Other cards
    And user enters expense name "Test Expense"
    And user selects date "2018-09-01"
    And user enters Amount "10"
    And user selects Expense Type "Fuel"
    And user selects Mode as "Cash"
    And user attaches receipt
    When user clicks Save Expense
    And user waits for loader to disappear
    Then user sees "Expense saved successfully"
      
      