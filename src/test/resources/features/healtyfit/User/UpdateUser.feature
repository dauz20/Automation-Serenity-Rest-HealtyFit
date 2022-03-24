Feature: Update User name

  @TestingUpdateName
  Scenario: Update User name from testing to testingone
    When User change name from testing to "testingone"
    Then Succes update name

  Scenario: Update User name from Clark to John Clark
    When User change name from testing to "John Clark"
    Then Succes update name


