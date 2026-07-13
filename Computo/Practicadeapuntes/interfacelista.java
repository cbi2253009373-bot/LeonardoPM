public interface interfacelista<E> extends Iterable<E>{
  public int numElementos();
  public void agregarElemento(E elemento);
  public void agregarInicio(E elemento);
  public void agregarFinal();
  public void agregarPosicion(E elemento, int pos);
  public E eliminarElemento();
  public E elminiaFinal();
  public E eliminarInicio();
  public E eliminarPosicion(int pos);
  public void vaciarLista();
  public E consultarElementos(int pos);
  public boolean esvacio();



}
