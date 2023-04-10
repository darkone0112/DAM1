Algoritmo valorabsoluto
	Repetir
	imprimir "Introduzca dos valores para hayar su diferencia"
	Repetir
	leer a
		si a <= 0 Entonces
			imprimir "Introduzca caracteres validos"
		FinSi
	Hasta Que a > 0 
	Repetir 
		leer b
		si b <= 0 Entonces
			imprimir "Introduzca caracteres validos"
		FinSi
		Hasta Que b > 0
	abso = (a - b)
	si abso < 0
		abso = abso *(-1)
	FinSi
	imprimir "El valor absoluto es:  " abso
	imprimir "______________________________________"
	Imprimir "1/ Reiniciar Programa"
	Imprimir "2/ Cerrar Programa"
	Repetir
		si eleccion <> numerico
			imprimir "Opcion Desconocida"
		FinSi
		leer eleccion
		si eleccion = 1
		 Limpiar Pantalla
	 FinSi
	 si eleccion > 2
		 Repetir
			 leer eleccion
			 Imprimir "Opcion Desconocida"
		 Hasta Que eleccion <= 2
	 FinSi
 Hasta Que eleccion >= 0
 Hasta Que eleccion <> 1
FinAlgoritmo
