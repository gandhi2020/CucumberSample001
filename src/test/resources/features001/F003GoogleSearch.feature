@test02
  Feature: Search Google for Selenium and Cucumber

    Scenario Outline: Google search for Selenium and Cucumber official website
      Given user is on google website
      When user entered "<search-string>" item
      And user clicks the google search button
      Then user is see the search results page
      And user clicks the first result
      Then user is shown the website

      Examples:
      | ssearch-string |
      | selenium official website |
      | cucumber official website |