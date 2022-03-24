Feature: Login User HealtyFit

  @TestingLogin
  Scenario: (+) Login with valid data
    When User input email "clarktest@mail.com" and input password "Clark"
    Then User succes log in

  @LoginInvalidEmail
  Scenario: (-) Login with invalid email
    When User input invalid email "abcdefg" and input password "Clark"
    Then User fail log in

  @LoginInvalidPassword
  Scenario: (-) Login with invalid password
    When User input valid email "clarktest@mail" and invalid "123456"
    Then User fail log in



