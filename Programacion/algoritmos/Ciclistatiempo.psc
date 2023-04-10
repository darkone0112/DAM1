Algoritmo Ciclistatiempo
	repetir
	imprimir "Escriba una hora de salida siguiendo el siguiente formato"
	
	imprimir "HH/horas MM/minutos SS/segundos"
	Imprimir "Hora:"
	Repetir
	leer h
	si h >=24
		imprimir "Valor Erroneo"
		error = "si"
		imprimir "----------"
		Imprimir "Hora:"
		sino error = "no"
	FinSi
	si h < 0 
		imprimir "Valor Erroneo"
		error = "si"
		imprimir "----------"
		Imprimir "Hora:"
		
	FinSi
Hasta Que error = "no"
Imprimir "Minutos:"
Repetir
leer m
si m > 59
	imprimir "Valor Erroneo"
	error = "si"
	imprimir "----------"
	Imprimir "Minutos:"
	sino error = "no"
FinSi
si m < 0
	imprimir "Valor Erroneo"
	error = "si"
	imprimir "----------"
	Imprimir "Minutos:"
FinSi
Hasta Que error = "no"
Imprimir "Segundos:"
Repetir
leer s
	si s > 59
		imprimir "Valor Erroneo"
		error = "si"
		imprimir "----------"
		Imprimir "Segundos:"
		sino error = "no"
	FinSi
	si s < 0
		imprimir "Valor Erroneo"
		error = "si"
		imprimir "----------"
		Imprimir "Segundos:"
	FinSi
Hasta Que error = "no"
Limpiar Pantalla
imprimir "La hora de salida del ciclista es las " h ":" m ":" s ""
imprimir "-----------"
imprimir "Introduzca el tiempo de viaje en segundos"
Repetir
leer t
si t <= 0
	imprimir "Tiempo total de recorrido incorrecto"
	t0 = "si"
	imprimir "Tiempo de recorrido:"
FinSi
Hasta Que t0 <> "si"
hs = (h*60)*60  //horas a segundo//
ms = m*60	//minutos a segundos//
ts = hs + ms + s + t	//tiempo total en segundos//
tth = (ts / 60)/60	//tiempo total en horas//
ttht = trunc(tth)	//horas a mostrar en pantalla//
msh = tth -ttht //minutos en horas con las horas a mostrar descontadas//
mtf = (msh * 60 )//tiempo total en minutos//
tmtf = trunc(mtf) //minutos a mostrar en pantalla//
ssm = mtf - tmtf //segundos en minutos con los mintutos a mostrar descontados//
tstf = ssm * 60 //segundos a mostrar en pantalla//
si ttht > 23
	ttht = ttht - 23
FinSi
imprimir "La hora de llegada con un recorrido de " t " segundos es a las " ttht ":" tmtf ":" tstf 
imprimir "---------"
imprimir "Desea realizar otra operacion?"
leer decision
limpiar pantalla
Hasta Que decision = "no" 
FinAlgoritmo
