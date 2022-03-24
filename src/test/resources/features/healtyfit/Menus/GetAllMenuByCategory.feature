Feature: Get All Menu By Category

  Scenario: Get all menu by category
    When User request get all menu by category "dinner"
    Then The system send all menu category dinner

  Scenario: Get all menu by category
    When User request get all menu by category "lunch"
    Then The system send all menu category dinner

  Scenario: Get all menu by category
    When User request get all menu by category "breakfast"
    Then The system send all menu category dinner