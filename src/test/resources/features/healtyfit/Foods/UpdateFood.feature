Feature: Update Food

  @UpdateDataFoodProtein
  Scenario: (+) Update protein food (Salmon Panggang)
    When Admin change protein data salmon paggang to 23
    Then Succes update protein food
