@smoke
  Feature: F08_Wishlist | user can add items to wishlist
    Scenario:
      When user clicks on wishlist button on a product
      Then success message is triggered

      Scenario:
        When user clicks on wishlist button on a product
        And user clicks on wish list tab
        Then quantity should be bigger than zero