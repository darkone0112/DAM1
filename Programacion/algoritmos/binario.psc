Algoritmo binario
	definir dec Como Entero
	leer dec
	bin<-0
	i<-0
	Repetir
		r<-dec mod 2
		bin<-bin+10^i*r
		i<-i+1
		dec<-trunc(dec/2)
	Hasta Que dec <1
	res<-bin+10^i*dec
	mostrar res
FinAlgoritmo
