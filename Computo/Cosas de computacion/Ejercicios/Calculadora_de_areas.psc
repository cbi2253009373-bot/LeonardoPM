Algoritmo Calculador_de_areas
	Escribir "Este programa ayuda a calcular el area de un terreno en forma de helado con sus respectivos variables que sabemos";
	Definir hipo,radio, alt,semicir,triangulototal,areafinal Como Real;
	Escribir "ingresa el valor del radio del semicirculo";
	Leer radio;
	Escribir "ingresa el valor del largo del triangulo";
	Leer hipo;
	Escribir "Espere un momento que las operaciones se estan realizando para dar el resultado";
	semicir<-((PI*radio^2))/2;
	alt<-(RC(hipo^2-radio^2));
	triangulototal<-(((2*radio)*alt)/2);
	areafinal<-(((2*radio)*alt)/2);
	Escribir " el resultado de su operacion es:", areafinal "u^2";
	
FinAlgoritmo
