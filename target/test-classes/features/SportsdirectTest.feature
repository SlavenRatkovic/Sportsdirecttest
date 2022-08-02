@run
Feature: Sportsdirect

  Scenario: Nike Sale
    Given I navigate to Sportsdirect Homepage
    When I choose Nike Sale
    Then relevant products are shown