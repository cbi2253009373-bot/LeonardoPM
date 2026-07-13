import java.util.Scanner;
 public class Practica1 {
//metodo principala
  public static void main (String [] args) {
   Scanner sc = new Scanner (System.in);
   int [] numer =  new int [5];
   int opcion;
   System.out.println("Ingresa los 5 numeros que quieres que tenga tu arreglo");
   for (int i = 0; i < 5; i++){
      System.out.println("Ingresa el numero :"+(i+1));
      numer [i] = sc.nextInt();
    }
   do{
   System.out.println("Que deseas hacer ");
   System.out.println("1.Calcular suma ");
   System.out.println("2.Calcular el promedio ");
   System.out.println("3.Encontrar el mayor ");
   System.out.println("4.Crea un numero arreglo con los numeros al triple ");
   System.out.println("5.Mostrar todos los resultados ");
   System.out.println("6.Salir" );
   opcion = sc.nextInt();

   switch (opcion){
     case 1:System.out.println("Tu suma de los numeros es: "+Suma(numer));
      break;
     case 2:System.out.println("Tu promedio es: "+promedio(numer));
      break;
     case 3:System.out.println("Tu numero mayor es: "+Mayor(numer));
      break;
     case 4:NumeroTriple(numer);
      break;
     case 5:System.out.println("Tu suma es: "+Suma(numer)+" Tu promedio es: "+promedio(numer)+" Tu numero mayor es: "+Mayor(numer));NumeroTriple(numer);
      break;
     case 6:System.out.println(" Gracias por visitarnos ");
      break;
      default: System.out.println(" Error: Opcion invalida ");
    }
   }   while(opcion !=6);


   sc.close();
  }
 //termina metodo principal
 // inician los Metodos secudarios
  //Metodo de suma
  public static int Suma(int [] numero ){
   int [] numeros = numero;
   int acum = 0;
   for (int i = 0; i < numeros.length; i++){
      acum = (numeros [i] + acum);
    }
   return acum;
  }
  //Termina metodo de suma


  //Inicia metodo de calular el proemdio 
  public static float promedio(int [] numeroP){
   int []  nump = numeroP;
    int acum = 0;
    int aux = 0;
   float promedios;
    for (int i = 0; i <  nump.length ; i++){
      acum = (nump [i] + acum);
     aux = (i+1);
    }

   promedios = (acum/aux);
   return promedios;
  }
  //termina metodo de calcular el promedio 

  //inicia metodo para calcular el mayor
  public static int Mayor (int [] umMayo ){
    int [] numMAYO = umMayo;
    int aux = umMayo[0];
   for (int i = 0; i < numMAYO.length ; i++){
      if (aux < numMAYO[i]){
        aux = numMAYO [i];
      }

    }
   return aux;
  }
  //Termina metodo de calcualr el mayor


  //INCIA METOdo del multiplicar al triple
  public static void NumeroTriple(int [] numTRI){
   int [] NUMTRI = new int [5];
   for (int i = 0; i < NUMTRI.length; i++){
      NUMTRI [i] =  (numTRI [i] * 3);
     System.out.println("Tu numero de la matriz es: \n");
     System.out.println(NUMTRI[i]);
     System.out.println("\n");
    }
  }
  //TERMINA METODO DE MULTIPLICAR AL TRIPLE
}
