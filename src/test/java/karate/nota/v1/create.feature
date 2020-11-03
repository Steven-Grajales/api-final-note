Feature: Creation of notas

  Background:
    * url baseUrl
    * def notaPath = '/api/v1/nota'

  Scenario Outline: Create a nota
    Given path notaPath
    And request notaToCreate
    When method post
    Then status 201
    And match responseHeaders contains {Location:[#string]}
    Examples:
      | nota | porcentaje |
      | 5    | 0.2        |
      | 2    | 0.3        |
      | 3.5  | 0.4        |
      | 4.5  | 0.1        |

