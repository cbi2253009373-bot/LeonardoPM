public class prac{

  public static void main(String [] args ){
   //Ponerlo en mayusculas este lo hice por que si 
  String nombre = "Juan";
   System.out.println(nombre.toUpperCase());
  // usando el ==
   int a = 10 ;
   int b = 10 ;
   if (a == b){
    System.out.println("Son iguales");
    }else{
      System.out.println("No son iguales");
     }
   String nombre1 = new String ("Juan");
   String nombre2 = new String ("Juan");
  System.out.println( nombre1 == nombre2 );
  String nombre3 = "Juan";
  String nombre4 = nombre3;
  System.out.println(nombre3 == nombre4);
   //usando el equals
  String nombre11 = "Ana";
  String nombre12 = "Ana";
  if (nombre11.equals(nombre12)){
    System.out.println("Los nombres son iguales");
   }
  //no falla al compilar pero si al ejecutar el java prac
  //  String nombre111 = null;
  //  if (nombre111.equals("Ana")){
  //     System.out.println("Es Ana");
  //   }
  
  //el bueno 
    String nombre111 = null;
  if ("Ana".equals(nombre111)){
     System.out.println("El nombre es Ana");
    }

   //Metodo compareTO()
    String nom1 = "Ana";
    String nom2 = "Luis";
    System.out.println(nom1.compareTo(nom2));
   // otro ejemplo
    String nom11 = "Luis";
    String nom12 = "Luisa";
    System.out.println(nom11.compareTo(nom12));












  }
 }
