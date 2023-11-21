@smoke
  Feature: F04_search | user could search using product name or sku
    Scenario Outline: user could search using product name
      When user search using name "<product_name>"
      Then url should contain search?q=
      And  search should show relevant results
      Examples:
      |product_name|
      |book        |
      |laptop      |
      |nike        |

      Scenario Outline:
        When user search for product using sku "<product_sku>"
        And user clicks on the product in search result
        Then sku should match searched sku
        Examples:
        |product_sku|
        |SCI_FAITH  |
        |APPLE_CAM  |
        |SF_PRO_11  |
