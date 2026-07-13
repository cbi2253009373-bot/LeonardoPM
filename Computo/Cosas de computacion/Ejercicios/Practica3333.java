import java.util.Scanner;
public class Practica3333{
//Atributos
private static float base = 0;
private static float altura = 0;
private static float radio = 0;
private static float diametro = 0;
private static Scanner sc = new Scanner (System.in);

//Comportamiento de metodos
 public static void main(String [] args){
 int x;
  do{
    x = menu ();
  }while(x!=4);
}
public static int menu(){
int opcion = 0;
System.out.println("Figuras geometricas");
System.out.println("1. Rectangulo");
System.out.println("2._Circulo");
System.out.println("3._Triangulo");
System.out.println("4._Salir");
opcion = sc.nextInt();

 switch(opcion){
 case 1: Rectangulo ();
        break;
 case 2: Circulo ();
        break;
 case 3: Triangulo ();
       break; 
 case 4: System.out.println("Adtos");
      break;
   default: System.out.println("Opcion invalida");
    }
 return opcion;
 }

public static int Rectangulo (){
int opcion2 = 0;
System.out.println("Ingresa base");
base = sc.nextFloat();
System.out.println("Ingresa tu altura");
altura = sc.nextFloat();
System.out.println("Ingresa 1 se deseas area ");
System.out.println("Ingresa 2 si deseas perimetro");
 opcion2 = sc.nextInt();
 switch (opcion2){
    case 1: Area ();
           break;
    case 2: Perimetro ();
           break;
       default: System.out.println("Opcion invalida");
     break;
   }
  return opcion2;
 }
public static int Circulo (){
 int opcion3=0;
 System.out.println("Dame radio");
 radio = sc.nextFloat();
 System.out.println("Ingresa tu diametro");
 diametro = sc.nextFloat();

 System.out.println("Ingresa 1 si deseas area");
 System.out.println("Ingresa 2 deseas perimetro");
 opcion3 = sc.nextInt();
  switch (opcion3){
      case 1: Area2 ();
            break;
      case 2: Perimetro2 ();
             break;
     default:System.out.println("Opcion invalida"); 
         break;
 }
return opcion3;
}

public static int Triangulo (){
int opcion4 = 0;
System.out.println("Ingresa altura");
altura = sc.nextFloat();
System.out.println("Ingresa base");
base = sc.nextFloat();
System.out.println("Ingrea 1 si deseas area");
System.out.println("Ingresa 2 si deseas perimetro");
opcion4 = sc.nextInt();
switch (opcion4){
     case 1: Area3 ();
           break;
     case 2: Perimetro3 ();
          break;
 default:System.out.println("Opcion invalida");
      break;
   }
  return opcion4;
}

//Rectangulo
public static void Area (){
double area = base*altura;
System.out.println("Tu area es:"+area);
}

public static void  Perimetro (){
double peri= base*4;
System.out.println("Tu perimetro es:"+peri);
}
//Circulo
 public static void  Area2 () {
   double areac = (3.1416*(radio*radio)); 
   System.out.println("Tu area es: "+areac);
  }

  public static void Perimetro2 (){
   double peri2 = (diametro*3.1416); System.out.println("Tu perimetro es: "+peri2);
  }
   //Triangulo
   public static void  Area3 (){
   double areat = ((base*altura)*(0.5));
   
    System.out.println("Tu area es: "+areat);
  }
    public static void  Perimetro3 (){
    double peri3 = base*3;
    System.out.println("Tu perimetro es: "+peri3);
    }







































}


