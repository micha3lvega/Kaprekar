# Constante de Kaprekar

[![Build Status](https://travis-ci.org/joemccann/dillinger.svg?branch=master)](https://travis-ci.org/joemccann/dillinger)

El número 6174 es conocido como la Constante de Kaprekar en honor de su descubridor el matemático indio Dattatreya Ramachandra Kaprekar. Este número es el resultado de la aplicación repetida de la Operación de Kaprekar que consiste en los siguientes pasos:

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

[//]: # (These are reference links used in the body of this note and get stripped out when the markdown processor does its job. There is no need to format nicely because it shouldn't be seen. Thanks SO - http://stackoverflow.com/questions/4823468/store-comments-in-markdown-syntax)

   [dill]: <https://github.com/joemccann/dillinger>
   [git-repo-url]: <https://github.com/joemccann/dillinger.git>
   [john gruber]: <http://daringfireball.net>
   [df1]: <http://daringfireball.net/projects/markdown/>
   [markdown-it]: <https://github.com/markdown-it/markdown-it>
   [Ace Editor]: <http://ace.ajax.org>
   [node.js]: <http://nodejs.org>
   [Twitter Bootstrap]: <http://twitter.github.com/bootstrap/>
   [jQuery]: <http://jquery.com>
   [@tjholowaychuk]: <http://twitter.com/tjholowaychuk>
   [express]: <http://expressjs.com>
   [AngularJS]: <http://angularjs.org>
   [Gulp]: <http://gulpjs.com>

   [PlDb]: <https://github.com/joemccann/dillinger/tree/master/plugins/dropbox/README.md>
   [PlGh]: <https://github.com/joemccann/dillinger/tree/master/plugins/github/README.md>
   [PlGd]: <https://github.com/joemccann/dillinger/tree/master/plugins/googledrive/README.md>
   [PlOd]: <https://github.com/joemccann/dillinger/tree/master/plugins/onedrive/README.md>
   [PlMe]: <https://github.com/joemccann/dillinger/tree/master/plugins/medium/README.md>
   [PlGa]: <https://github.com/RahulHP/dillinger/blob/master/plugins/googleanalytics/README.md>
