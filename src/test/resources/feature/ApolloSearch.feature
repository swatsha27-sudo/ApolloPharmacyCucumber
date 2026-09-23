
Feature: Apollo Pharmacy Product Search and Cart

  Scenario: Search toothpaste and add to cart

    Given I open Apollo Pharmacy for product search

    When I search for toothpaste

    And I add the product to cart

    And I increase the quantity

    And I view the cart

    And I click on Proceed
