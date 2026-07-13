Algoritmo ldlslslsls
	Definir NumA, NumB,suma,i,acum Como Entero
	Escribir "Ingresa el primer numero";
	Leer NumA;
	Escribir "Ingresa el segundo numero";
	Leer NumB;
	acum<-0
	suma<-0
	si NumA>NumB Entonces
		Escribir "Error al ingresar los numeros"
	sino
		Para i<-NumA Hasta NumB Con Paso 1 Hacer
			
			si i%2=1 Entonces
				acum<-acum+1
				suma<-suma+i
			FinSi
			
		FinPara
	FinSi
	
	Escribir "la cantidad de tus numeros pares es", acum
	Escribir "la suma es ", suma;
	
	
FinAlgoritmo
