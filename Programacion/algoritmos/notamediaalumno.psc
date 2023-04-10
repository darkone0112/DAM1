Algoritmo notamediaalumno
	Repetir
		Imprimir "Hola Alumno, introduzca su nombre por favor"
		leer nombrealumno
		imprimir "Hola ", nombrealumno " introduzca las notas para conocer su nota media"
		Imprimir "Nota primera evaluacion:"
		definir evaluacion1 Como Entero
		leer evaluacion1
		Imprimir "Nota segunda evaluacion:"
		definir evaluacion2 Como Entero
		leer evaluacion2
		Imprimir "Nota tercera evaluacion:"
		definir evaluacion3 Como Entero
		leer evaluacion3
		definir total Como Entero
		total = evaluacion1 + evaluacion2 + evaluacion3
		nota = total / 3
		imprimir "su nota media es de  " , nota
		Imprimir "Desea realizar otra accion si/no"
		leer decicion
	Hasta Que decicion = "no"
FinAlgoritmo
