Feature: Food

  @TestingGetAllFoods
  Scenario: Get all foods
    When I request to get all foods
    Then The system send message "Success get all foods"
    And The first food name is " Beef meatball"





