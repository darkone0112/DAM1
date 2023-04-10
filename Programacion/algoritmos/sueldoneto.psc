Algoritmo sueldoneto
	imprimir "Introduzca su nombre"
	Repetir
	
	leer nombre
	si nombre <> caracter
		Entonces
		Repetir
		
			imprimir "Hola " nombre " introduzca su sueldo bruto para conocer su sueldo neto"
		 	
		Leer bruto
		Hasta Que bruto > 0
		irpf = bruto * 0.12
		SS = bruto * 0.052
		neto = (bruto - irpf) - SS
		imprimir "El sueldo neto de " nombre " es de " neto " ?"
	SiNo
		Imprimir "Debe introducir un nombre"
		
	
	
	FinSi
Hasta Que nombre <> caracter
FinAlgoritmo
