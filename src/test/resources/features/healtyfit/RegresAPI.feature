Feature: Reqres API


  @createUser
  Scenario: Create user
    When I create new User with name is "Fifeka" and job is "Quality Assurance"
    Then New user is created
    And New user name is "Fifeka" and job is "Quality Assurance"