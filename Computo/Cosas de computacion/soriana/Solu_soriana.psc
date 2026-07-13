Algoritmo Solu_soriana
	Escribir "Hola bienvenidos a este programa en el que te podra ayudar a calcular el precio de tu compra en la  tienda de soriana aplicando algunos terminos que tiene la tienda";
	Definir Producto1,Producto2,Producto3,Totalapagar,catDescontar,valortotal Como Real;
	Escribir "Ingresa el valor del Producto1";
	Leer Producto1;
	Escribir "Ingresa el valor del Producto2";
	Leer Producto2;
	Escribir "Ingresa el valor del Producto3";
	Leer  Producto3;
	valortotal<-(Producto1+Producto2+Producto3);
	catDescontar<-0;
	si valortotal>580 Entonces
		catDescontar<-(0.15)*valortotal;
	FinSi
	Totalapagar<-valortotal-catDescontar;
	Escribir "Tu total a pagar es de " Totalapagar;
	
FinAlgoritmo
