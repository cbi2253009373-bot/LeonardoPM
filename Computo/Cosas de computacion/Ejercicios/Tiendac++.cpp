#include <stdio.h>

int main() {
    float saldo, precioP, acum=0, cambio;
    int numProductos=0;

    // Solicitar saldo valido o mayor a  que sino no compra nada
    do {
        printf("Dame el saldo de tu vale: ");
        scanf("%f", &saldo);

        if (saldo<=0) {
            printf("Error: el saldo debe ser mayor que 0\n");
        }

    } while (saldo<=0);

    // Registro de productos tanteo de prodcutos
    do {
        printf("\nIngresa el precio del producto (0 o negativo para terminar): ");
        scanf("%f", &precioP);

        if (precioP<=0) {
            printf("Proceso de compra terminado.\n");
            break;
        }

        if (acum+precioP<=saldo) {
            acum=acum+precioP;
            numProductos++;
            printf("Producto agregado correctamente.\n");
        } else {
            printf("El producto NO cabe en el saldo disponible.\n");
        }

        printf("Saldo restante: %.2f\n", saldo-acum);

    }while(acum<saldo);

    // Calcular cambio o chicles
    cambio=saldo-acum;

    // Tiki
    printf("\n***************TICKE*****************\n");
    printf("Saldo inicial:         $%.2f\n", saldo);
    printf("Productos comprados:      %d\n", numProductos);
    printf("Total gastado:         $%.2f\n", acum);
    printf("Cambio:                $%.2f\n", cambio);
    printf("*****************************************\n");

    return 0;
}