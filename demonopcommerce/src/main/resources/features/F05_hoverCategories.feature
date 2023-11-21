@smoke
Feature: F05_hoverCategories | user could hover on main category and select sub-category
  Scenario: user could hover on main category and select sub-category
    When user go to home page and hover on main category
    And user select one sub-category and click on it
    Then sub-category text should be equal to sub-category page title