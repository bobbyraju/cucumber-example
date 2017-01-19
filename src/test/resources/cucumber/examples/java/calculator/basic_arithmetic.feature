@foo
Feature: Basic Arithmetic

  Background: A Calculator
    Given a calculator I just turned on

  Scenario: Addition
  # Try to change one of the values below to provoke a failure
    When I add 4 and 5
    Then the result is 9

  Scenario: Addition using Reverse Polish Notation
    When I enter 2
    And I enter 5
    And I press +
    Then the result is 7

  Scenario: Subtraction using Reverse Polish Notation
    When I enter 5
    And I enter 2
    And I press -
    Then the result is 3