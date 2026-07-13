public class Alumno implements Comparable<Alumno> {
   private int matricula;

public Alumno(int matricula){
  this.matricula = matricula;
 }

public static void main(String [] args ){
  Alumno a1 = new Alumno(100);
  Alumno a2 = new Alumno(200);
 System.out.println(a1.compareTo(a2));

 }





@Override
public int compareTo(Alumno otro){
 return this.matricula - otro.matricula;
 }














}
