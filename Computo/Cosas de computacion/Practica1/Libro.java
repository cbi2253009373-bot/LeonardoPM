public class Libro{
 //Atributos
  String titulo;
  String autor;
  int numeroPaginas;
 

 //Constructor
 public Libro (String titulo, String autor , int numeroPaginas){
  this.titulo = titulo;
  this.autor = autor;
  this.numeroPaginas = numeroPaginas; 
  }

  //Metodos seter y get de titulo
 public void setTitulo(String titulo){
 this.titulo = titulo;
  } 
   public String getTitulo(){
    return this.titulo;
   }
  
  public void setAutor(String autor){
   this.autor = autor;
  }

  public String getAutor(){
   return this.autor;
  }
  
  public void setNumeroPaginas(int numeroPaginas){
   this.numeroPaginas = numeroPaginas; 
 }
  
 public int getNumeroPaginas(){
  return this.numeroPaginas;
 }

//Mostrar
 public void mostrar(){
   System.out.println("El titulo es: "+titulo);
   System.out.println("Tu autor es:  "+autor);
   System.out.println("Tus paginas son: "+numeroPaginas);
 }

//Metodo toString
@Override
 public String toString (){
 return "titulo: " + titulo + 
      "\n Autor: " + autor + 
      "\n No. Pag. : "+ numeroPaginas;
  }











}
