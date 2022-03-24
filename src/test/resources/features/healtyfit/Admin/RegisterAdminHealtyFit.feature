Feature: Register Admin app HealtyFit

  @TestingRegisterAdmin
  Scenario: Register admin with valid data
    When Admin input data name "admintwo" and email "admin02@mail.com" and password "admin02" and gender "female"
    Then New account admin created