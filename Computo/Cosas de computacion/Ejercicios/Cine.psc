Algoritmo Cine
	Definir dia, edad Como Entero
	Definir precioBase, descuento, precioFinal Como Real
	Escribir "***********************************************";
	Escribir "*****   Dia       |  Numero asignado     ******";
	Escribir "*****   Lunes     |  1                   ******";
	Escribir "*****   Martes    |  2                   ******";
	Escribir "*****   Miercoles |  3                   ******";
	Escribir "*****   Jueves    |  4                   ******";
	Escribir "*****   Viernes   |  5                   ******";
	Escribir "*****   Sabado    |  6                   ******";
	Escribir "*****   Domingo   |  7                   ******";
	Escribir "*********************************************** ";
	
	Escribir "Ingrese un numero del 1 al 7 segun el dia : "
	Leer dia;
	
	Segun dia Hacer
		1: 
			precioBase<-50
		2:
			precioBase<-50
		3:
			precioBase<-50
		4:
			precioBase<-50
		5:
			precioBase<-60
		6:
			precioBase<-70
		7:
			precioBase<-70
		De Otro Modo:
			Escribir "Error: numero de dia incorrecto verifiquelo por favor."
Fin Segun

Escribir "Ingrese la edad del cliente: ";
Leer edad;

Si edad<12 Entonces
  	descuento<-precioBase*0.50
SiNo
	Si edad>=60 Entonces
		descuento<-precioBase*0.30
	SiNo
		descuento<-0
	FinSi
FinSi

precioFinal<-precioBase-descuento

Escribir "******************************************";
Escribir "Precio sin descuento: $", precioBase;
Escribir "Descuento aplicado: $", descuento;
Escribir "Precio total a pagar: $", precioFinal;
Escribir "******************************************";
FinAlgoritmo
