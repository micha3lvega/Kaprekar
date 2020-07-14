# Kaprekar

[![Build Status](https://travis-ci.org/joemccann/dillinger.svg?branch=master)](https://travis-ci.org/joemccann/dillinger)

Esta aplicacion muestra en forma de una cuadricula de colores los pasos que se deben seguir para hallar la `constante de kaprekar`

## Constante de Kaprekar

El número **6174** es conocido como la Constante de Kaprekar en honor de su descubridor el matemático indio Dattatreya Ramachandra Kaprekar. Este número es el resultado de la aplicación repetida de la Operación de Kaprekar que consiste en los siguientes pasos:

  - Escoger cualquier número de cuatro dígitos (con limitadas excepciones, véase más abajo).
  - Ordenar los cuatro dígitos en orden descendente, para obtener el minuendo de una resta.
  - Ordenar los mismos cuatro dígitos en orden ascendente, para obtener el sustraendo de la misma resta.
  - Calcular el resto, restando el sustraendo del minuendo.
  - Si el resto no es igual a 6174, repetir los cuatro pasos anteriores, añadiendo ceros a la derecha al minuendo y a la izquierda al sustraendo, siempre que sea necesario para completar los cuatro dígitos.
  
### Si esta operacion se debe repetir esta nunca se repetira más de siete veces

>Por ejemplo, supongamos que partimos del número de cuatro dígitos 5342:
>- 5432 – 2345 = 3087
>- 8730 – 0378 = 8352
>- 8532 – 2358 = 6174

Para mas informacion puede revisar el siguiente [articulo](https://es.wikipedia.org/wiki/Constante_de_Kaprekar)

License
----

MIT

**Free Software, Hell Yeah!**
