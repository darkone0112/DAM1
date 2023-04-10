Algoritmo Factura
	Repetir
	iva = 0.19
	imprimir "introduzca los datos para la confeccion de la factura"
	Repetir
	imprimir "Nombre de articulo:"
		Leer articulo
	Hasta Que articulo <> caracter
	Repetir
	imprimir "precio unitario"
	leer preciou
	Hasta Que preciou <> entero
	Repetir
	imprimir "Número de unidades solicitadas"
	leer unidades
	Hasta Que unidades <> entero
	Repetir
	imprimir "Desea generar su factura"
	leer decicion
	Hasta Que decicion <> caracter
	si (decicion = "si")
			Imprimir  "Factura compra de ", articulo
			Imprimir "Precio de venta ", preciou
			imprimir "IVA " , iva
			imprimir "Precio Bruto " , preciou * unidades
			ivac= (preciou * unidades)*iva
			preciob = preciou * unidades
			imprimir "Precio final " , preciob - ivac
			imprimir "Desea realizar otra operacion"
			leer decicion2
		SiNo
			imprimir "saliendo del programa..."
		FinSi
	Hasta Que decicion2 = "no"
FinAlgoritmo
