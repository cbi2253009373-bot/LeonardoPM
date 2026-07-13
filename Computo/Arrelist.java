public class Arrelist <E> implements Lista<E> {
    private int indice;
    private static final int MAX = 5;
    private Object[] datos;

    public Arrelist() {
        this.indice = 0;
        this.datos = new Object[MAX];
    }
    public int numElementos() {
        return this.indice;
    }
    public boolean esVacia() {
        if (this.indice == 0) {
            return true;
        } else {
            return false;
        }
    }
    public void aseguramiento(){
        for (int i = 0; i < this.indice; i++) {
            this.datos[i] = null;
        }
    }

    public void vaciarLista() {
        if (!esVacia()) {
            aseguramiento();
            this.indice = 0;
        }
    }
    public void agregarFinal(E elemento) {
        if (this.indice >= this.MAX){
            Object[] aux = new Object[datos.length + datos.length / 2];
            System.arraycopy(this.datos, 0, aux, 0, datos.length);
            this.datos = aux;
        }
        datos[this.indice] = elemento;
        this.indice++;
    }
    public void agregarInicio(E elemento) {
        if (this.indice < this.MAX) {
            System.arraycopy(this.datos, 0, this.datos, 1, this.indice);
            this.datos[0] = elemento;
            this.indice++;
        } else {
            Object[] aux = new Object[this.datos.length + this.datos.length / 2];
            System.arraycopy(this.datos, 0, aux, 0, datos.length);
            this.datos = aux;
            System.arraycopy(this.datos, 0, this.datos, 1, this.indice);
            datos[0] = elemento;
            this.indice++;
        }
    }
    public void agregarPosicion(E elemento, int pos) {    
     Object[] aux = null;
        if (esVacia()){
         agregarInicio(elemento);
        }else{
         if (indice == datos.length){
           aux = new Object[datos.length + datos.length / 2];
           System.arraycopy(this.datos, 0, aux, 0, pos);
           System.arraycopy(this.datos, pos, aux, pos + 1, this.indice - pos);
           this.datos = aux;
           datos[pos] = elemento;
           this.indice++;
            }else{
           System.arraycopy(this.datos, pos, this.datos, pos + 1, this.indice - pos);
           datos[pos] = elemento;
           this.indice++;
            }
        }


       if (pos>0 && pos < this.indice) {
        if (this.indice == datos.length) {
         aux = new Object[datos.length + datos.length / 2];
         System.arraycopy(this.datos, 0, aux, 0, pos);
         System.arraycopy(this.datos, pos, aux, pos + 1, this.indice - pos);
         this.datos = aux;
         datos[pos] = elemento;
         this.indice++;
         }else{
           throw new IndexOutOfBoundsException("Posición inválida");
            }
        }
    }
    public E eliminarElemento(){
        Object[] aux = null;
     if(esVacia()){
       throw new IllegalStateException("La lista está vacía");
     }else{
         if (indice == datos.length){
          aux = new Object[datos.length];
          System.arraycopy(this.datos,0,aux,0,datos.length);
          datos[indice]=null;
         return 
         }
        }
    }





}
