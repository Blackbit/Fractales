# Fractales

Aplicaci�n en Java para explorar fractales mediante f�rmulas matem�ticas iterativas tipo Mandelbrot o set de Julia. 

La aplicaci�n dispone de un componente llamado Fractal que realiza las llamadas a las diferentes f�rmulas.

Hay definidos una decena de fractales disponibles, entre Mandelbrot y Julia Set.

Existe c�digo para acceder a una base de datos, donde se almacenan puntos de inter�s, o zonas de los fractales que llaman la atenci�n. 

Se puede revisar el JavaDoc para m�s informaci�n de la aplicaci�n


# A�adir nuevas f�rmulas

Existe un Interface definido que permite luego asociar las diferentes clases que calculan los puntos del fractal.

La aplicaci�n se puede extender creando nuevas clases implementando el interface IFractal. Adicionalmente hay que modificar la aplicaci�n en el combobox del formulario principal. Hay que a�adir el nombre de la nueva clase en los �tems del combo. Y finalmente hay que modificar la funci�n devuelveFractal, para que incorpore la nueva clase.


# Errores detectados

El desplazamiento del fractal con el bot�n derecho es incorrecto. Hay que revisar la f�rmula.


# Posibles ampliaciones

Se podr�a ampliar el tipo de fractales para que pudiera incorporar otros tipos de iteraciones como fractales tipo �rbol u otros algoritmos no basados en renderizar puntos x,y. Entonces habr�a que modificar el interface IFractal para que pudiera tener por ejemplo un selector de tipo de fractal, y que en funci�n de si es true/false llame a la funci�n de calculaPunto, se llamara a una nueva hipot�tica funci�n dibujaFractal. Luego quedar�a saber c�mo gestionar las ampliaciones con los nuevos tipos de fractales.

Actualmente s�lo se usa una paleta de colores en blanco y negro. Se podr�a a�adir paletas predefinidas con mayor colorido, o bien poner un editor de paletas. 




