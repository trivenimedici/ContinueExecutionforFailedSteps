@Work
Feature: application login
  Scenario:home page default login
    Given user is on landing page
    When  user login into the application with username and password
    Then Home page is populated
    And  cards are displayed
    And all The elements are enabled
