Algoritmo raizcuadrada
	Repetir
	imprimir "Introduce un numero para hayar su raiz cuadrada"
	Repetir
	leer num
	si( num > 0)
		radicalizar = raiz(num)
		imprimir radicalizar
		Imprimir "Desea realizar otra operacion?"
		leer decicion
	SiNo
		Imprimir "El numero debe ser no negativo"
	FinSi
Hasta Que num > 0
Hasta Que decicion = "no"
FinAlgoritmo
