@smoke
Feature: : user should be able to search for products


  Scenario Outline: user should be able to search with product name
    When user go to search field
    And user search with "<productName>"
    Then user should find "<productName>" in search result
    Examples:
      |productName|
      |book|
      |laptop|
      |nike|

  Scenario Outline: user should be able to search with sku
    When user go to search field
    And user search with "<sku>"
    Then user should find "<sku>" in Product result Details
    Examples:
      |sku|
      |SCI_FAITH|
      |APPLE_CAM|
      |SF_PRO_11|
