Feature: Searching food

  @TestSearchingFood
  Scenario: Seaching food Apel
    When I look up food "Apel" by category "foods" in searching field
    Then The System give data Apel




