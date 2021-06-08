Feature: Empleos Choucair Testing S.A.

  Scenario: Pagina principal empleos
    Given que el usuario desea ingresar al portal de empleos de choucair
    When ingresa a la url de empleos-testing
    Then el usuario puede visualizar la pagina de empleos


  Scenario: Que es choucair
    Given que el usuario se encuentra en la sección de empleos
    When cuando se selecciona que es choucair
    Then se visualiza la informacion de que es choucair

  Scenario:Prepararse para aplicar
    Given que el usuario se encuentra en la sección de empleos
    When cuando se selecciona prepararse para aplicar
    Then se visualiza la informacion de como prepararse para aplicar

  Scenario: Portal de Empleos
    Given que el usuario se encuentra en la sección de empleos
    When cuando se selecciona ir al portal de empleos
    Then se visualiza la pagina de magneto365