
// Colores ANSI
#define AC_BLACK   "\033[30m"
#define AC_RED     "\033[31m"
#define AC_GREEN   "\033[32m"
#define AC_YELLOW  "\033[33m"
#define AC_BLUE    "\033[34m"
#define AC_MAGENTA "\033[35m"
#define AC_CYAN    "\033[36m"
#define AC_WHITE   "\033[37m"
#define AC_NORMAL  "\033[m"

// Colores extra
#define AC_CAFE    "\033[38;5;94m"
#define AC_ROSA    "\033[38;5;205m"

int main() {

    int N, P, anchoTronco;
    int i, j, k;
    int color = 0;
    float divisible;

    // -----------------------------
    // Entrada
    // -----------------------------
    printf("Ingresa la altura del pino: ");
    scanf("%d", &N);

    printf("Ingresa la altura del tronco: ");
    scanf("%d", &P);

    printf("Ingresa el ancho del tronco: ");
    scanf("%d", &anchoTronco);

    int ancho = (2 * N) - 1;

    // -----------------------------
    // ESTRELLA CON RAYOS
    // -----------------------------

    // Rayito superior
    for (i = 0; i < N + 1; i++)
        printf(" ");
    printf(AC_YELLOW "|" AC_NORMAL "\n");

    // Línea: - * -
    for (i = 0; i < N; i++)
        printf(" ");
    printf(AC_YELLOW "-*-" AC_NORMAL "\n");

    // -----------------------------
    // COPA DEL PINO
    // -----------------------------
    for (i = 0; i < N; i++) {

        // Espacios
        for (j = 0; j < (N - i); j++) {
            printf(" ");
        }

        // Contenido del nivel
        for (k = 0; k < 2 * i + 1; k++) {

            divisible = k % 2;

            // Estrella amarilla en pares
            if (divisible == 0) {
                printf(AC_YELLOW "*" AC_NORMAL);
            } else {
                // Esferas intercaladas ROJO -> AZUL -> ROJO -> AZUL...
                if (color % 2 == 0)
                    printf(AC_RED "O" AC_NORMAL);
                else
                    printf(AC_BLUE "O" AC_NORMAL);

                color++;
            }
        }

        printf("\n");
    }

    // -----------------------------
    // TRONCO CAFÉ
    // -----------------------------

    int centro = (ancho-anchoTronco)/2;

    for (i=0; i<P; i++) {

        for (j=0; j<centro; j++)
            printf(" ");

        for (k = 0; k < anchoTronco; k++)
            printf(AC_CAFE "|" AC_NORMAL);

        printf("\n");
    }

    // -----------------------------
    // REGALOS ROSAS
    // -----------------------------
    for (j = 0; j<centro-2; j++)
        printf(" ");

    // regalo izquierdo
    printf(AC_ROSA "@" AC_NORMAL);

    // centro del tronco
    for (j = 0; j<anchoTronco; j++)
        printf(AC_CAFE "|" AC_NORMAL);

    // regalo derecho
    printf(AC_ROSA "@" AC_NORMAL);

    printf("\n");

    return 0;
}
