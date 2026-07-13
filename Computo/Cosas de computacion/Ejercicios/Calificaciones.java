import java.util.Scanner;
 public class Calificaciones{
 public static void main(String [] args){

  Scanner sc= new Scanner(System.in);
 float et1,et2,et3,ep1,ep2,ep3,p1,p2,p3,p4,p5,p6,PromexT,PromexP,parti;
 double Promprac, promedioTotal,promgenex;

 System.out.println("Hola yo te ayudare a tener tu calificacion");

 System.out.println("Ingresaras tus calificaciones de Examentes teoricos");

 System.out.println("Ingresa la calficacion de Examen teorico 1");
 et1= sc.nextFloat();

 System.out.println("Ingresa la calficacion de Examen teorico 2");
 et2= sc.nextFloat();

 System.out.println("Ingresa la calficacion de Examen teorico 3");
 et3= sc.nextFloat();

 PromexT=(et1+et2+et3)/3;


 System.out.println("Ahora las calificaciones de tus examenes practicos");

 System.out.println("Ingresa la calficacion de Examen Practico 1");
 ep1= sc.nextFloat();

 System.out.println("Ingresa la calficacion de Examen Practico 2");
 ep2= sc.nextFloat();

 System.out.println("Ingresa la calficacion de Examen Practico 3");
 ep3= sc.nextFloat();

 PromexP=(ep1+ep2+ep3)/3;

 promgenex=(PromexT+PromexP)/2;

 if (promgenex<6){
   System.out.println("Por la calficiacion de tus examenes no alcansas a pasar");

  }else{
 
 System.out.println("Ingresa las calificaciones de tus practicas");
 System.out.println("Ingresa la calificacion de tu practica 1");
 p1=sc.nextFloat();

 System.out.println("Ingresa la calificacion de tu practica 2");
 p2=sc.nextFloat();

 System.out.println("Ingresa la calificacion de tu practica 3");
 p3=sc.nextFloat();

 System.out.println("Ingresa la calificacion de tu practica 4");
 p4=sc.nextFloat();

 System.out.println("Ingresa la calificacion de tu practica 5");
 p5=sc.nextFloat();

 System.out.println("Ingresa la calificacion de tu practica 6");
 p6=sc.nextFloat();

Promprac=(p1+p2+p3+p4+p5+p6)/6;

System.out.println("Tu promedio de examen teorico "+PromexT+" Promedio de examen practico "+PromexP+" Promedio total de examenes "+promgenex+" Promedio de practicas "+Promprac);


 System.out.println("¿Has participado en clase?");
 System.out.println("Ingresa 1 si has participado y sino ingresa 2");
 parti=sc.nextFloat();

 if(parti==1){
     promedioTotal=(((promgenex*0.7)+(Promprac*0.3))+1);
      }else{
        promedioTotal=(promgenex*0.7)+(Promprac*0.3);
        }

    if(promedioTotal<6){
    System.out.println("Tu calificacion es N/A");
    }else{
        if((promedioTotal>=6)&&(promedioTotal<7.3333333)){
        System.out.println("Tu calificiacion es S");
            }else{
             if((promedioTotal>=7.333333)&&(promedioTotal<8.666666)){
             System.out.println("Tu calificacion es B");
             }else{
             System.out.println("Tu calificacion es MB");
                   }




                }




          }




    }








  sc.close();
 }







}
