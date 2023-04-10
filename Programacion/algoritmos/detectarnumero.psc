Algoritmo detectarnumero
	acum0 = 0
	acumpos = 0
	acumneg = 0
	Repetir
		Imprimir  "INtroduzca un numero para saber si es negativo o positivo"
	leer num
	si num > 0
		imprimir "El numero es positivo"
		acumpos = acumpos + 1
	SiNo
		si num < 0 Entonces
			Imprimir "El numero es negativo"
			acumneg = acumneg +1
		SiNo
			imprimir "El numero es 0"
			acum0 = acum0 + 1
		FinSi
	FinSi

	Imprimir "Desea repetir con otro numero"
	leer desicion
Hasta Que desicion = "no"
imprimir "En total a introducido " acumpos " numeros positivos, " acumneg " numeros negativos y  " acum0 " veces el numero 0"
FinAlgoritmo
