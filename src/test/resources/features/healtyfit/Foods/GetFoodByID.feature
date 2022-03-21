Feature: Get Food By Id

  @TestGetFoodById
  Scenario: (+) Get Food(Manggis) By valid Id
    When I searching food by Id "V35rUH3Jj9cwv4RNeZrCgA"
    Then The system send food name is "Manggis"

  @TestGetFoodById2
  Scenario: (-) Get Food(Jeruk) By Id Manggis
    When I searching food by Id "V35rUH3Jj9cwv4RNeZrCgA"
    Then The system send food name is "Jeruk"