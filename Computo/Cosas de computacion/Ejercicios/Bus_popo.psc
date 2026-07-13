Algoritmo Bus_popo
	Escribir "Bienvenidos a este programa en el que te podra ayudar a saber el precio de los boletos del bus de popocatepelt";
	Definir costbol, edad, preciopagar, costdescuentoA, costdescuentoN	Como Real;
	costbol<-120
	Escribir "Ingresa tu edad años en cumplidos";
	Leer edad;
	
	si edad>65 Entonces
		Escribir "pagara", preciopagar;
		costdescuentoA<-(costbol*0.5);
	FinSi
	
	si edad<7 Entonces
		Escribir "pagara", preciopagar
		costdescuentoN<-(costbol*0.35);
	FinSi
	
	Escribir "Tu boleto del bus te saldra en :$", preciopagar;
	
FinAlgoritmo
