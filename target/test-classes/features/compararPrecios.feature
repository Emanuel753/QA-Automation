#language: es
  Característica: Validar el correcto funcionamiento de la pagina de MercadoLibre
    Escenario: Validar que se muestre correctamente el precio
      Dado el usuario ingresa a la home
      Cuando ingresa a la seccion de televisores
      Y ingresa al ultimo articulo de la lista
      Entonces se muestra el siguiente precio 40999
