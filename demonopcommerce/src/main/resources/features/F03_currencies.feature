@smoke
Feature: F03_currencies | users could use currencies functionality
  Scenario: user could show products only in wanted currencies
    Given user go to home page
    When user select Euro currency from currencies dropdown menu
    Then all results should have Euro currency symbol

