Algoritmo AxxA_imp
	Escribir "Hola bienvenidos a este programa espero y les sea de su ayuda";
	Escribir "Nos ayuda a calcular el impuesto en AxxA que recauda el 15%, cuando los ingresos superan los $2800";
	Definir Ingresos, impuesto Como Real;
	Escribir "Puedes proporcinarme el ingreso";
	Leer Ingresos;
	impuesto<-0;
	Si Ingresos> 2800 Entonces
		impuesto<-(Ingresos*0.15);
	FinSi
	Escribir "El impuesto a pagar es :$",impuesto;
FinAlgoritmo
