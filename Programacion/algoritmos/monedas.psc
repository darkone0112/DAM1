Algoritmo monedas
	Repetir
	Repetir
	Imprimir "Introduzca cantidad de monedas 1?"
	leer euro
Hasta Que euro >= 0
Repetir
	Imprimir "Introduzca cantidad de monedas 2??"
	leer euro2
Hasta Que euro2 >= 0
Repetir
	Imprimir "Introduzca cantidad de monedas 50 centimos?"
	leer centimo50
Hasta Que centimos50 >= 0
Repetir
	Imprimir "Introduzca cantidad de monedas 20 centimos?"
	leer centimo20
Hasta Que centimos20 >= 0
Repetir
	Imprimir "Introduzca cantidad de monedas 10 centimos?"
	leer centimo10
Hasta Que centimos10 >= 0
	Limpiar Pantalla
	eurotse = euro + (euro2 * 2)
	eurotsc = trunc((centimo50 * 0.5) + (centimo20 * 0.20) + (centimo10 * 0.10))
	eurot = eurotse + eurotsc
	centimost = ((centimo50 * 0.5) + (centimo20 * 0.20) + (centimo10 * 0.10) - eurotsc) * 100
	imprimir "En total tienes " eurot "." centimost " ?"
	imprimir "--------"
	Imprimir "Desea realizar otra operacion"
	leer desicion
	Limpiar Pantalla
	Hasta Que desicion = "no"
FinAlgoritmo
