algoritmo añobiciestro
	Repetir
	imprimir "Introduce tu año"
	leer año
	si (año > 0)
		entonces
		si (año es divisible por 4)
			Entonces
			imprimir "Es biciestro"
		SiNo
			imprimir "No es biciestro"
			
		FinSi
		imprimir "Quieres volver a probar"
		leer decicion
	SiNo
		imprimir "Debe introducir un año valido"
	FinSi
	Hasta Que decicion = "no"
FinAlgoritmo 
