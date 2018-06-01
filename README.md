# Fractales

Aplicación en Java para explorar fractales mediante fórmulas matemáticas iterativas tipo Mandelbrot o set de Julia. 

La aplicación dispone de un componente llamado Fractal que realiza las llamadas a las diferentes fórmulas.

Hay definidos una decena de fractales disponibles, entre Mandelbrot y Julia Set.

Existe código para acceder a una base de datos, donde se almacenan puntos de interés, o zonas de los fractales que llaman la atención. 

Se puede revisar el JavaDoc para más información de la aplicación.


# Añadir nuevas fórmulas

Existe un Interface definido que permite luego asociar las diferentes clases que calculan los puntos del fractal.

La aplicación se puede extender creando nuevas clases implementando el interface IFractal. Adicionalmente hay que modificar la aplicación en el combobox del formulario principal. Hay que añadir el nombre de la nueva clase en los items del combo (o modelo). Y finalmente hay que modificar la función devuelveFractal, para que incorpore la nueva clase.


# Errores detectados

El desplazamiento del fractal con el botón derecho es incorrecto. Hay que revisar la fórmula.


# Posibles ampliaciones

Se podría ampliar el tipo de fractales para que pudiera incorporar otros tipos de iteraciones como fractales tipo árbol u otros algoritmos no basados en renderizar puntos x,y. Entonces habría que modificar el interface IFractal para que pudiera tener por ejemplo un selector de tipo de fractal, y que en función de si es true/false llame a la función de calculaPunto, se llamara a una nueva hipotética función dibujaFractal. Luego quedaría saber cómo gestionar las ampliaciones con los nuevos tipos de fractales.

Actualmente sólo se usa una paleta de colores en blanco y negro. Se podría añadir paletas predefinidas con mayor colorido, o bien poner un editor de paletas. 

No supe cómo añadir Fractales de la forma Z=Z^2+1/C, que son bastante bonitos. Estaría bien añadirlos, además de otras fórmulas que no he añadido por falta de tiempo, (Z=Z^4+C, Z=Z^2+C^2, funciones trigonométricas, etc.).


