Algoritmo numeroprimo
	Repetir
	leer n
	si n = 1
		imprimir "1 no se considera primo ni no primo"
	SiNo
		si n = 2 o n = 3 o n = 5 o n = 7
			imprimir "primo"
		sino
			si n MOD 2 = 0 o n MOD 3 = 0 o n MOD 5 = 0 o n MOD 7 = 0
				imprimir "No es primo"
			sino imprimir "primo"
			FinSi
		FinSi
	FinSi
	imprimir "Desea hacer otra operacion"
	leer d
Hasta Que d = "no"
FinAlgoritmo
