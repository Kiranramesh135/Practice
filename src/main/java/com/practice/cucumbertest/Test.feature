Feature: Test feature

  Background: Background

  Scenario: Test Scenario
    Given I am on Login page


  Scenario Outline: Test scenario two
    Given I am on Login page
    When I enter '<empName>' and '<uName>'


    Examples:
    |empName|uName|
    |kiran  |kiramesh|
    |sindu  |sinduja |
