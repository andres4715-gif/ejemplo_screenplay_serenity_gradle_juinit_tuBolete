@tag
Feature: hacer una inscripcion en la pagina tuboleta
  yo como usuario frecuente de la pagina de tu boteta quiero inscribirme para hacer diferentes actividades en la ciudad

  @inscripcion_en_la_pagina
  Scenario: inscribir mis datos personales en la pagina
    Given que el usuario esta en la pagina inicial de tuboleta
    When el diligencia todos los datos de la pagina para finalizar el registro
    And diligencia los datos de ubicacion geografica
    Then el puede ver su nombre en la pagina de bienvenida

  @inscripcion_en_la_pagina_con_datatable
  Scenario: inscribir mis datos personales en la pagina
    Given que el usuario esta en la pagina inicial de tuboleta
    When el diligencia todos los datos de la pagina para el registro
      | correo             | contrasenia | conficontrasenia | numeroidentificacion | saludo |
      | loquesea@gmail.com | loquesea01* | loquesea01*      |             45454434 | Sr     |
    Then el puede ver su nombre en la pagina despues de diligenciar los datos

  @solo_es_llenar_el_cuadro_de_busquedas
  Scenario: buscar cualquier palabra
    Given que el usuario esta en la pagina inicial de tuboleta
    When el diligencia el campo de busqueda con la palabra Carlos vives
    Then el puede ver el texto Mostrando resultados: 1-

  @solo_validacion
  Scenario: buscar cualquier palabra
    Given que el usuario esta en la pagina inicial de tuboleta
    When el diligencia la busqueda con la palabra la roca
    Then el puede ver los Eventos para "la roca"

  @solo_con_data_table
  Scenario: buscar cualquier palabra
    Given que el usuario esta en la pagina inicial de tuboleta
    When el diligencia la busqueda con la palabra la roca
    Then el puede ver los
      | mensaje                |
      | Eventos para "la roca" |

  @busquedade_de_vuelos_sencillos
  Scenario: buscar vuelos sencillos para salir de viaje con la familia
    Given que el usuario esta en la pagina inicial de tuboleta
    And busca el modulo de viajes
    When el diligencia todos los datos del vuelo
      | origen | destino |
      | mede   | Cura    |
    Then el puede ver el mensaje Vuelos viaje ida y vuelta

  @busqueda_para_rentar_un_auto
  Scenario: buscar autos para la renta
    Given que el usuario esta en la pagina inicial de tuboleta
    And busca el modulo de autos para la renta
    When el diligencia los datos para rentar el auto
      | oficinaentrega | oficinadevolucion |
      | Medellin       | Bogota            |
    Then el ve el mensaje No pudimos encontrar autos con la información proporcionada
    
    @busqueda_conciertos_en_medellin
  Scenario: buscar proximos conciertos en medellin
    Given que el usuario esta en la pagina inicial de tuboleta
    When el busca los conciertos para la ciudad de medellin 
    Then el pueder ver el mensaje Eventos para "conciertos"
    
    
    @informacion_sobre_cantantes_de_musica_popular
  Scenario: buscar musica variada pero vieja
    Given que el usuario esta en la pagina inicial de tuboleta
    When el diligencia los campos para compartir 
    Then el puede ver el mensaje Eventos para "rock"
    
  @solo_la_barra_de_busqueda
  Scenario: buscar una banda con concierto en colombia y comprar una boleta
    Given que el usuario esta en la pagina inicial de tuboleta
    When el ingresa la busqueda Aterciopelados es lo mejor de colombia antes de salir de la pagina 
    Then el ve los resultados para Aterciopelados es lo mejor de colombia
   
   
    #Este hace falta por terminarlo ya el dato que se toma sale null, se esta validando con Alejandro. 
  @tomar_un_dato_de_la_misma_pagina_y_buscarlo
  Scenario: buscar una banda con concierto en colombia y comprar una boleta
    Given que el usuario esta en la pagina inicial de tuboleta
    When el toma un dato de la pagina y lo busca
    Then el puede ver Eventos para "Eventos para hoy" 
    
      @interactuar_con_dos_paginas_web
  Scenario: buscar una banda con concierto en colombia y comprar una boleta
    #Given que el usuario esta en la pagina inicial de tuboleta	
    #When el selecciona irse de tour a cartagena
    #Then el ve los resultados para salir a los Tours desde Cartagena
    Given que el usuario esta en la pagina inicial de vuelos despegar
    When el busca alojamiento mas vuelos 
    Then el ve los resultados para alojarse en cartagena
    
    
    
