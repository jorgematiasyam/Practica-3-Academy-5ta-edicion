
Feature: As a client i need to log in practice.automation

  Scenario Outline: El usuario se logea con credenciales validas
    Given El usuario se encuentra en el sitio Automation Practice
    When el usuario hace click en el boton My Account del menu
    And Ingresa su username <username>
    And Ingresa su password <password>
    And El usuario hace click en el boton Login
    Then El usuario verifica que el ingreso fue realizado correctamente

    Examples:
      | username                 | password     |
      | jorgematiasyam@gmail.com | Muri1009$    |

  @JMY
  Scenario Outline: El usuario se logea y navega en el sitio practice.automation
    Given El usuario se encuentra en el sitio Automation Practice
    When el usuario hace click en el boton My Account del menu
    And Ingresa su username <username>
    And Ingresa su password <password>
    And El usuario hace click en el boton Login
    When El usuario hace click en el boton Shop
    And El usuario hace click en el boton Home
    Then El usuario verifica que existan solamente tres Arrivals

    Examples:
      | username                 | password     |
      | jorgematiasyam@gmail.com | Muri1009$    |


  Scenario Outline: El usuario se logea y navega en el sitio practice.automation
    Given El usuario se encuentra en el sitio Automation Practice
    When el usuario hace click en el boton My Account del menu
    And Ingresa su username <username>
    And Ingresa su password <password>
    And El usuario hace click en el boton Login
    When El usuario hace click en el boton Shop
    And El usuario hace click en el boton Home
    Then El usuario verifica que existan solamente tres Arrivals
    Then El usuario hace click en la imagen izquierda
    Then El usuario verifica que el ingreso a la pagina del producto fue realizado correctamente

    Examples:
      | username                 | password     |
      | jorgematiasyam@gmail.com | Muri1009$    |

  @JMY
  Scenario Outline: El usuario se logea y navega en el sitio practice.automation
    Given El usuario se encuentra en el sitio Automation Practice
    When el usuario hace click en el boton My Account del menu
    And Ingresa su username <username>
    And Ingresa su password <password>
    And El usuario hace click en el boton Login
    When El usuario hace click en el boton Shop
    And El usuario hace click en el boton Home
    Then El usuario verifica que existan solamente tres Arrivals
    Then El usuario hace click en la imagen izquierda
    Then El usuario verifica que el ingreso a la pagina del producto fue realizado correctamente
    Then El usuario hace click en el boton description
    Then El usuario verifica que se muestra la descripcion del producto

    Examples:
      | username                 | password     |
      | jorgematiasyam@gmail.com | Muri1009$    |