import java.util.Scanner;
public class Practica333{
 //Atributos
 
 private static float base = 0;
 private static float altura = 0;
 private static float radio = 0;
 private static float diametro = 0;
 private static Scanner sc = new Scanner (System.in);
 
//Comportamiento de metodos
public static void main(String [] args){

int x = 0;
 do{
   
 x = menu ();
 }while(x!=4);
}

public static int menu (){
 int opcion = 0;
 System.out.println("Figuras geometricas");
 System.out.println("1._Rectangulo");
 System.out.println("2._Circulo");
 System.out.println("3._Triangulo");
 System.out.println("4._Salir");
 opcion = sc.nextInt();
 
 switch (opcion){
  case 1: Rectangulo ();
         break;
  case 2: Circulo ();
         break;
  case 3: Triangulo ();
         break;
  case 4: System.out.println("Adios");
         break;
 default: System.out.println("Opcion invalida");
         break;
  }
 return opcion;
}
//Rectangulo
public static int Rectangulo (){
 int opcion2 = 0;
 System.out.println("Area = 1 ");
 System.out.println("Perimetro = 2");
 opcion2 =sc.nextInt ();
System.out.println("Ingresa la base ");
 base = sc.nextFloat();
 System.out.println("Ingresa la altura");
 altura = sc.nextFloat();
 switch (opcion2){
        case 1: Area ();
                break;
        case 2: Perimetro ();
                break;
        default:System.out.println("Opcion invalida");
       }
    
 
return opcion2;
}
//Ciruculo
public static int Circulo (){
 int opcion3 = 0;
 System.out.println("Area = 1 ");
 System.out.println("Perimetro = 2");
 opcion3 =sc.nextInt ();
 System.out.println("Ingresa el radio");
 radio= sc.nextFloat();
 System.out.println("Ingresa el diamtro");
 diametro=sc.nextFloat();
 switch (opcion3){
        case 1: Area2();
                break;
        case 2: Perimetro2();
                break;
        default:System.out.println("Opcion invalida");
       }
    

return opcion3;
}
//Trinangulo
public static int Triangulo (){
 int opcion4 = 0;
 System.out.println("Area = 1 ");
 System.out.println("Perimetro = 2");
 opcion4 =sc.nextInt ();
System.out.println("Ingresa la base ");
 base= sc.nextFloat();
 System.out.println("Ingresa la altura");
 altura = sc.nextFloat();
 switch (opcion4){
        case 1: Area3();
                break;
        case 2: Perimetro3();
                break;
        default:System.out.println("Opcion invalida");
       }
    
 
return opcion4;
}

//Rectangulo 
public static void Area (){
double area = base*altura;
System.out.println("Tu area es :"+area);
}

public static void Perimetro (){
double peri = base*4;
System.out.println("Tu perimetro es :"+peri);
}

//Ciruculo
public static void Area2 (){
double areac = (3.1416*(radio*radio));
System.out.println("Tu area es :"+areac);
}

public static void Perimetro2 (){
double peri2 = (3.1416*diametro);
System.out.println("Tu perimetro es :"+peri2);
}

//Triangulo
public static void Area3 (){
double areat= (base*altura)/2;
System.out.println("Tu area es : "+areat);
}

public static void Perimetro3(){
double perit = base*3;
System.out.println("Tu perimetro es :"+perit);
}
















































}
