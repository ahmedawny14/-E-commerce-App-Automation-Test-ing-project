@smoke
  Feature: user should select a subcategory from a main category

    Scenario: user use hover to select a category and click on a cub category
      When user hover a category and select sub category
      Then user should find the sub category name in page title