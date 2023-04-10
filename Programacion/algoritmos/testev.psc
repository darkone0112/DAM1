Algoritmo testev
	total = 10
	incorrectas = 0
	correctas = 0
	vacia = 0
	contador= 10
	repetir
	imprimir "Cantidad de respuestas correctas, incorrectas o vacias del test"
	imprimir "Correctas"
	leer correctas
	Repetir
	si correctas < 0 o correctas > 10
		imprimir "Dato incorrecto"
		imprimir "Dato Corregido"
	FinSi
Hasta Que correctas >= 0 y correctas <= contador
si correctas = 10 Entonces
	Imprimir "Todas las respuestas son correctas la nota total es de: " correctas
FinSi
contador = contador - correctas
si contador > 0
	imprimir "Incorrectas"
	Repetir
leer incorrectas
si incorrectas < 0 o incorrectas > contador
	imprimir "Dato incorrecto"
	imprimir "Dato Corregido"
FinSi
Hasta Que incorrectas >= 0 y incorrectas <= contador
contador = contador - incorrectas
FinSi
imprimir contador
si contador > 0
	imprimir "En blanco"
	Repetir
leer vacia
si vacia < 0 o vacia > contador
	imprimir "Dato Erroneo"
	imprimir "Dato Corregido"
FinSi
Hasta Que vacias >= 0 y vacias <= contador
contador = contador - vacias
FinSi
si contador > 0
	repetir
	imprimir "Alguno de los valores no es correcto"
	Imprimir "Corrija respuestas correctas:"
	leer correctas
	Imprimir "Corrija respuestas incorrectas:"
	leer incorrectas
	Imprimir "Corrija respuestas vacias:"
	leer vacias
	si correctas + incorrectas + vacias < 10 
		imprimir "Algo ha salido mal"
		
	FinSi
	hasta que correctas + incorrectas + vacias = 10
FinSi
incorrectasv = incorrectas * 0.25
notafinal = correctas - incorrectasv
imprimir "Su nota final es de:  " notafinal
imprimir "----------"
imprimir "Desea realizar otra accion"
leer desicion 
Limpiar Pantalla
hasta que desicion = "no"
FinAlgoritmo
