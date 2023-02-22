@login
Feature: login feature
  as a customer
  I want to login to the login funcionality to check my login detail

  Scenario: login with valid credential
    Given I am on home page
    When I click on login button
    Then I should see "welcome,please sign in" text on the login page