Algoritmo piesaunidad
	imprimir "Introduzca una magnitud en pies a convertir"
	Repetir
	Repetir
	leer pies

	si pies > 0
	SiNo
		imprimir "introduzca un valor adecuado"

	FinSi

Hasta Que pies > 0
pulgadas = pies * 12
metros = pies / 3.2808
millas = pies / 5280
yardas = pies * 0.333333
imprimir pies " pies equivalen a " pulgadas " pulgadas"
imprimir pies " pies equivalen a " metros " metros"
imprimir pies " pies equivalen a " millas " millas"
imprimir pies " pies equivalen a " yardas " yardas"

Imprimir "Desea realizar otra operacion?"
leer desicion
si desicion = "no"
	imprimir "Cerrando el programa..."
SiNo
	Limpiar Pantalla
FinSi
Hasta Que desicion = "no"
	
FinAlgoritmo
