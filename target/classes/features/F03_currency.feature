@smoke
Feature: validate currency function

  Scenario: user select euro from currency
    When  user select euro option
    Then  the price of products will be with euro