public class Libro{
 //Atributos
 private String titulo;
 private String autor;
 private int numeroPaginas;
 

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

//Mostrar el libro
//Metodo mostrar
public void mostrar(){
  System.out.println("**************Libro****************");
  System.out.println("El titulo es : " + titulo);
  System.out.println("Tu autor  es : " + autor);
  System.out.println("No. paginas  : " + numeroPaginas);
  System.out.println("************************************");
}
//Metodo toString
@Override
  public String toString(){
    return "==========Datos del libro===========\n"+
           "El titulo es: " + titulo + 
            "\n Tu autor es:  "  + autor +
        "\nNo. paginas : "+numeroPaginas;
    }













}
