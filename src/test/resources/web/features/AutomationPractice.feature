Feature: As a client i need to log in practice.automation

  @JMY
  Scenario: El usuario se logea con credenciales validas
    Given El usuario se encuentra en el sitio Automation Practice
    When el usuario hace click en el boton My Account del menu
    And Ingresa su username "jorgematiasyam@gmail.com"
    And Ingresa su password "Muri1009$"
    And El usuario hace click en el boton Login
    Then El usuario verifica que el ingreso fue realizado correctamente