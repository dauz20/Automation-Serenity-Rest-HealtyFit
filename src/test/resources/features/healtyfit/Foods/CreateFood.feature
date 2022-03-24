Feature: Add Food by admin

  @AddFood
  Scenario: Add Food by admin
    When Admin input data namefood "ikan salmon panggang" and calories 171 and energy 715 and carbohidrate 0,49 and protein 23,97 and  unit "gram" and unit value 1 and food categories "food"
    Then New food succes created