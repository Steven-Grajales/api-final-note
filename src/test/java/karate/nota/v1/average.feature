Feature:

  Background:
    * url baseUrl
    * def notaPath = '/api/v1/notas/'

  Scenario Outline: Create a nota
    Given path notaPath
    And request __row
    When method post
    Then status 201
    And match responseHeaders contains {Location:[#string]}
    Examples:
    | nota | porcentaje |
    | 5    | 0.2        |
    | 2    | 0.3        |
    | 3.5  | 0.4        |
    | 4.5  | 0.1        |

  Scenario: Get average
    Given path notaPath + "average"
    When method get
    Then status 200
    And match response == '3.45'