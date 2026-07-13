#include <stdio.h>

int main() { //abre main

    float num1, num2, resultado;
    int operacion;

    do { //abre do
        printf("¿Qué operación deseas realizar?\n");
        printf("1) Suma\n2) Resta\n3) Multiplicación\n4) División\n5) Terminar calculadora\n");
        
        scanf("%d", &operacion);
        switch (operacion) { //abre switch

          case 1:
            printf("Dame dos números: ");
            scanf("%f %f", &num1, &num2);
            resultado = num1 + num2; 
	    
            printf("\nEl resultado es: %f\n", resultado);
	    break; //cierre case1

          case 2:
            printf("Dame dos números: ");
            scanf("%f %f", &num1, &num2);
            resultado = num1 - num2;
	    
            printf("\nEl resultado es: %f\n", resultado);
            break; //cierre case2

          case 3:
            printf("Dame dos números: ");
            scanf("%f %f", &num1, &num2);
            resultado = num1 * num2;

            printf("\nEl resultado es: %f\n", resultado);
            break; //cierre de case3

          case 4:
           
                printf("Dame el número 1: ");
                scanf("%f", &num1);
              do{ //abre 2do
                printf("Dame el número 2: ");
                scanf("%f", &num2);

                if (num2 == 0) {//abre if
                    printf("\nError: el divisor no puede ser 0. Intenta de nuevo.\n");
                }//cierra if

            } while (num2 == 0); //cierra 2do  

            resultado = num1 / num2;
            printf("\nEl resultado es: %f\n", resultado);
     	    break; //cierro case4
	  case 5: printf("Gracias por usar mi programa\n");
		  break;
	  default: 
	    printf("Operacion invalida \n");
	    break; //cierro default
	 }//cierro switch
     
    }while((operacion<=0)|| (operacion > 5)|| (operacion !=5)); 


    return 0;
}
