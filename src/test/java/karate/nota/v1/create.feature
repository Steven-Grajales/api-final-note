Feature: Creation of notas

  Background:
    * url baseUrl
    * def notaPath = '/api/v1/nota'

  Scenario: Create a nota
    * def notaToCreate =
    """
    {
    "nota": 5
    }
    """
    Given path notaPath
    And request notaToCreate
    When method post
    Then status 201
    And match responseHeaders contains {Location:[#string]}

