Algoritmo minutosahoras
	Repetir
	imprimir "Introduzca una cantidad de minutos"
	leer minutos
	horas = trunc((minutos / 60))
	calculador = 60 * horas
	minutosf = minutos - calculador
	si minutosf <= 0
		imprimir minutos " minutos es en total " horas " horas "
		sino imprimir minutos " minutos es en total " horas " horas y " minutosf " minutos"
	FinSi
	
	imprimir "--------------------"
	imprimir "Desea realizar otra operacion?"
	leer decision
	si decision = "si"
		limpiar pantalla
	FinSi
	si decision = "no"
		Limpiar Pantalla
	FinSi
	Hasta Que decision = "no"
FinAlgoritmo
