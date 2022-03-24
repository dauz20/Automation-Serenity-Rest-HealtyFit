@TestingLoginAdmin
Feature: Admin Login app HealtyFit

  @TestingLoginAdmin02
  Scenario: Login Admin with valid data
    When Admin input email "admin02@mail.com" and input password "admin02"
    Then Admin succes log in


  @TestingLoginAdminAmigos
  Scenario: Login Admin amigos with valid data
    When Admin input email "amigos@mail.com" and input password "amigos"
    Then Admin succes log in

  @TestingLoginAdmin01
  Scenario: Login Admin 01 with valid data
    When Admin input email "admin01@mail.com" and input password "admin"
    Then Admin succes log in




