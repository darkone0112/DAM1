algoritmo a�obiciestro
	Repetir
	imprimir "Introduce tu a�o"
	leer a�o
	si (a�o > 0)
		entonces
		si (a�o es divisible por 4)
			Entonces
			imprimir "Es biciestro"
		SiNo
			imprimir "No es biciestro"
			
		FinSi
		imprimir "Quieres volver a probar"
		leer decicion
	SiNo
		imprimir "Debe introducir un a�o valido"
	FinSi
	Hasta Que decicion = "no"
FinAlgoritmo 
