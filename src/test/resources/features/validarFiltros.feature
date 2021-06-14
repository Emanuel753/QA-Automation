#language:es
  Característica: Validar el correcto funcionamiento de los filtros
    @filtros
    Esquema del escenario: Validar filtros
      Dado que el usuario ingresa a la categoria celulares
      Cuando selecciona los filtros <Xiaomi> y <Azul>
      Entonces se muestran los resultados correctos <modelo> <color>
      Ejemplos:
      |modelo | color |
      |XIAOMI | AZUL  |