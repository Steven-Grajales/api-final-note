Feature: list of notes

  Background:
    * url baseUrl
    * def notaPath = '/api/v1/notas'

  Scenario: List all notes
    Given path notaPath
    When method get
    Then status 200
    And match each response contains {nota: #number, porcentaje: #number }
