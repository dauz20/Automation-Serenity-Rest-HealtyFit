Feature: Get user by id

  @TestingGetUserByID
  Scenario: Get user by valid id
    When get user by id "dCJ9gvxKH6DUXnjLWXgxjH"
    Then The system send profil data "usertwo"