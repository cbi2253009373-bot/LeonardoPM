public class Arraylist <E> implements interfacelista<E>{
 //Atributos de esta clase 
  private int indice;
  private static final int MAX = 5;
  private Object [] datos;
  //Constuctor
  public Arraylist(int indice){
  this.indice = 0;
  this.datos = new Object [MAX];
  }
 //consutlrar los elementots
 public int numElementos(){
 return this.indice;
 }
 //metodo de si el arreglo esta vacio 
 public boolean esVacia(){
 if (this.indice == 0 ){
   return true;
  }else{
   return false;
   }
 }
//vaciar lista
//necesitamos vaciar la lista por si acaso
 public void aseguramiento(){
 for (int i = 0;i< this.datos.length;i++){
  this.datos[i] = null;
  }
 }
  //metodo bien
  public void Vaciarlsita(){
  if (!this.esVacia()){
   aseguramiento();
   this.indice = 0;
   }
 }
//metodo de agregar al final
public void agregarFinal(E elemento){
 if (this.indice >= this.MAX){
    Object [] aux = null;
    aux = new Object[1.5*(this.datos.length)];
   System.arraycopy(datos,0,aux,0,datos.length);
   aseguramiento();
   datos = aux;
   }
 datos[indice] = elemento;
 indice++;
 }
//metodo de agregar al inicio
  public void agregarInicio(E elemento){
  if (this.indice >= this.MAX){
    Object [] aux = null;
     aux = new Object[1.5*(this.datos.length)];
    System.arraycopy(datos,0,aux,1,indice);
    aseguramiento();
    datos = aux;
    this.datos[0] = elemento;
  }























}
