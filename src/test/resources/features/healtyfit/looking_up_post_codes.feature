Feature: Looking up post codes

  @lookingUpLocation
  Scenario Outline: Looking up US locations by post code
    When I look up a post code <Post Code> for country code <Country Code>
    Then the resulting location should be <Place Name> in <Country>
    Examples:
      | Post Code | Country Code | Country       | Place Name    |
      | 10000     | US           | United States | New York City |
      | 90210     | US           | United States | Beverly Hills |
      | 13001     | FR           | France        | Marseille 01  |

  Scenario: Registrasi
    When klik tombol register
    And masukkan biodata
    And klik save

  @Reqres
  Scenario: Get List User
    When I request list of user in page 2
    Then The system send 12 user in the list
    And the first user is "Michael"

  @Regres2
  Scenario: Get single user
    When I click on user number 2
    Then The system send user with name "Janet"

