Algoritmo suma5datos
	Repetir
	contador = 0
	total = 0
	Imprimir "Escribe 5 datos a sumar"
	Repetir
		leer val
		total = total + val
		contador = contador + 1
	Hasta Que contador = 5
	imprimir "El resultado de la suma de tus datos es ",total
	Imprimir "Reinciar? si/no"
	Leer decicion
	Hasta Que decicion = "no"
FinAlgoritmo
