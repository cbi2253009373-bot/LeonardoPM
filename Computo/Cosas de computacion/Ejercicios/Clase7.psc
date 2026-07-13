Algoritmo Clase7
	Escribir "Hacer un algoritmo que lea 20 numeros y determine cual es el numero mayor y el menor"
	Escribir "Hacer un programa que determine el precio de un pasaje de avion que conociendo que el valor por km recorrido es47$ y soibre los 1000km de vuelo valor del km es de 25"
	Definir Num, may,i, men Como Real
	
	may<-Num
	men<-Num
	Para i<-0 Hasta 20-1 Con Paso 1 Hacer
		Escribir "Ingresa 20 numeros";
		Leer Num;
		
		si Num>may Entonces
			may<-Num
			
		SiNo
			si Num<men Entonces
				men<-Num
			FinSi
		FinSi
	FinPara
	Escribir "tu numero mayor es", may;
	Escribir "Tu numero menor es", men;
	
}
FinAlgoritmo