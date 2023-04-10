Algoritmo tablamultiplicar
	definir i como entero
	imprimir "Escriba la tabla que desea repasar"
	leer tabla
	i = 0
	para i <- 1 hasta 10 Con Paso 1 Hacer
		imprimir tabla " * " i
		leer resultado
		si tabla * i = resultado
			imprimir "Correcto"
		sino
			imprimir "incorrecto"
		FinSi
		
	FinPara
FinAlgoritmo

