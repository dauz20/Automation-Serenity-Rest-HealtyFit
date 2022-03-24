Feature: Get all menu created by


  Scenario: Get all menu by admin
    When I request get all menu created by "admin"
    Then The system send all menu created by admin
