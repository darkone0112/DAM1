Algoritmo sin_titulo
	Repetir
		imprimir "Introduce los valores de cada lado de un triangulo"
		Repetir
	leer a
	leer b
	leer c
	si a <= 0 o b <= 0 o c <= 0
		Limpiar Pantalla
		Imprimir "------------"
		Imprimir "Datos erroneos o vacios"
		Imprimir "------------"
		imprimir "Repita los datos:"
	FinSi
	
Hasta Que a > 0 y b > 0 y c > 0
Limpiar Pantalla
	si a > b y a > c
		h = a
		c1 = b
		c2 = c
	SiNo
		si b > a y b > c
			h = b
			c1 = a
			c2 = c
		SiNo
			si c > a y c > b
				h = c
				c1 = a
				c2 = b
			FinSi
		FinSi
	FinSi	
	imprimir h
	si c1^2 + c2^2 = h^2
		pitagoras = verdadero
		Limpiar Pantalla
		imprimir "Este triangulo es rectangulo"
		si c1 * raiz(2) = h
			Imprimir "Ademas de rectangulo este triangulo es isoceles"
		sino 
			imprimir "Ademas de rectangulo este triangulo es escaleno"
			
		FinSi
	sino
		si a = b y a = c
			imprimir "El triangulo es equilatero"
		SiNo
			si a <> b y b <> c y a <> c
				imprimir "El triangulo es escaleno"
			sino 
				imprimir "El triangulo es isoceles"
			FinSi
		FinSi
	FinSi
	imprimir "------"
	imprimir "Desea realizar otra operacion?"
	leer desicion
	Limpiar Pantalla
	Hasta Que desicion = "no"
FinAlgoritmo
