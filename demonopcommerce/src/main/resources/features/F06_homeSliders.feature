@smoke
  Feature: F06_homeSliders | home sliders
    Scenario: first slider is clickable on home page
      When user clicks on first slider
      Then user should be directed to first slider's content

    Scenario: second slider is clickable on home page
      When user clicks on second slider
      Then user should be directed to second slider's content