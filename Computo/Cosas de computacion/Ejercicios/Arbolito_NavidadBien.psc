Proceso Arbolito_Navidad
	Definir N, P, i, j, ancho Como Entero
	Definir centro, anchoTronco Como Real
	Escribir "Ingresa la altura del Pino:";
	Leer N;
	Escribir "Ingresa la altura del tronco:";
	Leer P;
	
	ancho<-(2*N)-1  
	
	
	Para i<-0 Hasta N-1 Con Paso 1 Hacer
		Para j<-0 Hasta (N-i)-1 Con Paso 1 Hacer
			Escribir Sin Saltar " ";
		FinPara
		Para j<-0 Hasta (2*i - 1)-1 Con Paso 1 Hacer
		 Si (j%2=0) Entonces
			Escribir Sin Saltar "*";
		 SiNo
			Escribir Sin Saltar "O";
		 FinSi
		FinPara
    	Escribir " ";
	FinPara
		
		anchoTronco<-trunc(N/2)        
		Si anchoTronco<1 Entonces
			anchoTronco<-1
		FinSi
		
		centro<-(ancho-anchoTronco)/2   
		
		Para i<-0 Hasta P-1 Con Paso 1 Hacer
			Para j<-0 Hasta centro-1 Con Paso 1 Hacer
				Escribir Sin Saltar " ";
			FinPara
			Para j<-0 Hasta anchoTronco-1 Con Paso 1 Hacer
				Escribir Sin Saltar "|";
			FinPara
			Escribir " ";
		FinPara
		
	
FinProceso
