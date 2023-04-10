Algoritmo sin_titulo
	Repetir
	p = 2
	imprimir "Introduzca la cantidad de numeros primos q quiere mostrar"
	leer i
	si i <= 4
		segun i
			1.: imprimir "2"
			2.:imprimir "2"; imprimir "3"
			3.: imprimir "2"; imprimir "3"; imprimir "5"
			4.: imprimir "2"; imprimir "3"; imprimir "5"; imprimir "7"
		FinSegun
	SiNo
		Imprimir p
		imprimir "3"
		imprimir "5"
		imprimir "7"
		i = i - 4
		Repetir
			i = i -1
			p = p + 1
			si p MOD 2 = 0 o p MOD 3 = 0 o p MOD 5 = 0 o p MOD 7 = 0
				i = i + 1
			sino imprimir p
			FinSi
		Hasta Que i = 0
	FinSi
	imprimir "Desea realizar otra operacion?"
	leer d
Hasta Que d = "no"
FinAlgoritmo
