Feature: Web Automations Demo site
  Como usuario
  deseo registrarme en el sistema
  para usar las funcionalidades del mismo

  @RunnerTags
  Scenario: registro en el sistema
    Given que Carlos quiere acceder a Demo Site
    When el se registra en la página
      | first_name | last_name | adress         | email             | phone       | sexo      | country  | anio_fecha | mes_fecha | dia_fecha | password |
      | sebastian  | castaño   | cra 41 # 3 -54 | castano@gmail.com | 3216549878  | masculino | Colombia | 1995       | July        |18         | Qwert123 |
    Then el verifica que se carga la pantalla con texto
    | texto_validar                                      |
    | - Double Click on Edit Icon to EDIT the Table Row. |

