@test01
Feature: Login to Heroku website

  Scenario Outline: Login to Herokuapp website
    Given user is on the login page
    When user entered "<username>" and "<password>"
    And user clicked login button
    Then user should be logged in successfully

    Examples:
    | username  | password |
    | tomsmith  | SuperSecretPassword! |

