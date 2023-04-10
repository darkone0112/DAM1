Algoritmo intercambiarvalor
	Repetir
	imprimir "Valor de a"
	Leer a
	imprimir "Valor de b"
	Leer b
	contenedor = b
	b = a
	a = contenedor
	imprimir "El valor de b ahora es " b
	imprimir "El valor de a ahora es " a
	imprimir "----------"
	imprimir "Desea realizar otra operacion"
	leer desicion
	limpiar pantalla
	Hasta Que desicion = "no"
FinAlgoritmo
