Feature: Get all goal

  @GetAllGoal
  Scenario: Get all goal user
    When User request to get all goal
    Then The system send all goal user