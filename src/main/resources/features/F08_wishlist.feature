@smoke

  Feature: Validating wishlist feature

    Scenario: user should be able to add  products to wishlist
      When user click on wishlist button of product
      Then success message should be displayed

      Scenario:  product should be displayed in wishlist page
        When user click on wishlist button of product
        And user click on wishlist link
        Then user will find the quantity of products not equal zero