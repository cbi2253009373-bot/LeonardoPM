import java.util.Scanner;
public class Poblete_Leonardo{
    //Atributos
 Scanner sc= new Scanner (System.in);
 private static int suma;
 private static double sumaP;
 private static int cuadration;
 private static double factory;
 private static int mayor;
 private static int [] arreglo2;
 
 //Metodo principal
 public static void main(String[] args) {
    System.out.println("Suma: "+sumar(15,7));
    System.out.println("Cuadrado: "+cuadrado(6));
    calcularFactorial(5);
    System.out.println("Suma de tres: "+ sumarTres(4,6,10));
    int [] nums = {4,9,1,7,3};
    System.out.println("Mayor: "+ buscarMayor(nums));
    System.out.println("Promedio: "+calcularPromedio(nums));
   int [] res = duplicarArreglo(nums);
    System.out.println("Duplicado: ");
    for (int n: res) {
     System.out.println( n + " " ) ;
    }  
  System.out.println("");
    
   }



 //Metodos
 //metodo de suma
 public static int sumar (int a,int b){
    suma = (a + b);
  return suma;
 }
 //Metodo de cuadrado
 public static int cuadrado(int n){
    cuadration = (n*n);
    return cuadration;
 }
 //Metodo factorial
 public static void calcularFactorial(int n){
    factory = 0 ;
    for (int j = 0; j < n; j++) {
        for (int i = 0; i < n; i++) {
           int aux = (n*(n-1)*(n-2)*(n-3));
         factory = aux;
        }
    }
    


  System.out.println("El factorial es: "+factory);
 }
 //Metodo de sumar tres
 public static int sumarTres(int a,int b,int c){
  return (a + b + c);
 }
 //metodo de arreglos
 public static int buscarMayor(int [] arreglos){
    mayor = arreglos [0];
  
    for (int i = 0; i < arreglos.length; i++) {
        if (mayor < arreglos[i]) {
            mayor = arreglos[i];
        }
    }
  
 return mayor;
 }
 //Metodo promedio
 public static double calcularPromedio(int [] arreglo){
   sumaP = 0;
   int i = 0;
   int cat = 0; 
   for (int k = 0; k < arreglo.length; k++) {
      for (int j = 0; j < arreglo.length; j++) {
         sumaP = arreglo[0]+ arreglo [1]+ arreglo[2]+arreglo[3]+arreglo[4];
         
        } 
        
    }
   for (int z = 0; z < arreglo.length; z++) {
       cat++;
   }
   System.out.println(cat);
   System.out.println(sumaP);
   
  return sumaP/cat;
 }
 //Metodo de duplicado
 public static int [] duplicarArreglo (int [] orignial){
   arreglo2 = orignial;
   for (int j = 0; j < orignial.length; j++) {
       for (int i = 0; i < orignial.length; i++) {
       arreglo2[0]=i*2;
       }

   }
   

 
return arreglo2 ;
 }







}