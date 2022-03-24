Feature: Get Goal

  Scenario: Get Goal
    When User request get goal id "DyngKYFEfzALaudFvTwyAT"
    Then The system send data goal

  @GetGoalUser02
  Scenario: Get Goal
    When User request get goal id "HiVWqVyDAcBNDgFgcPs83b"
    Then The system send data goal