Algoritmo numeroinverso
	repetir
	Repetir
	imprimir "Introduzca un numero para mostrarlo de manera inversa"
	leer num
	si num > 99
			imprimir "Esta expresion excede el limite permitido"
		FinSi
	Hasta Que num <= 99
	D = num / 10
	U = (D - trunc(D)) * 10
	Imprimir "Tu numero inverso es: " trunc(U),trunc(D)
	Imprimir  "------------------------------"
	Imprimir "Desea repetir la operacion?"
	leer decision
	si decision="si"
		limpiar pantalla
	FinSi
	Hasta Que decision = "no"
FinAlgoritmo
