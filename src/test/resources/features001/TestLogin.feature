@Test01
Feature: Login Functionality

  Scenario: Successful login
    Given I am on the login page
    When I enter my username and password
    And I click on the login button
    Then I should be logged in successfully