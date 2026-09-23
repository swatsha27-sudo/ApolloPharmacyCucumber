Feature: Apollo Pharmacy Login

  Scenario: Login with mobile number

    Given I open Apollo Pharmacy website
    When I click on Login
    And I enter mobile number
    And I click on Continue
    Then OTP screen should be displayed
