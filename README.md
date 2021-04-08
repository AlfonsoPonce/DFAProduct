# DFAProduct
Este programa calcula el producto de dos automatas finitos deterministas, cargados previamente
en memoria en forma de matriz. 

El programa por defecto ejecuta mi caso particular, si se quiere realizar otro producto, se debe cambiar
el código fuente, en concreto las matrices "automata1" y "automata2".

La otra zona editable de código es aquella debajo del comentario "OUTPUT". La parte editable es:
 
 -La estructura if...else if...else if...else.
  -La parte entrecomillada del cuerpo del bucle más interno de iterador "j".
  
Al ser un DFA, normalmente solemos encontrar un nodo sumidero donde se dirigen todos los inputs que no son aceptados
en el lenguaje, ese valor está representado por la variable "Error" y es también editable.
