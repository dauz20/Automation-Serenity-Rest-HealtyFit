Feature: Get dinner recommend

  Scenario: User get dinner recommend
    When user request get "dinner" recommend
    Then The System send menu dinner recommend

  Scenario: User get luch recommend
    When user request get "lunch" recommend
    Then The System send menu dinner recommend

  Scenario: User get overtime recommend
    When user request get "overtime" recommend
    Then The System send menu dinner recommend




