Feature: Apollo Pharmacy Lab Tests

  Scenario: Add Vitamin lab test to cart

    Given I open Apollo Pharmacy for lab tests

    When I click on Lab Tests

    And I close the popup if displayed

    And I select Vitamin

    And I add the Vitamin test

    And I click on Go To Cart

    And I enter my mobile number

    And I click on Lab Test Continue