public interface Transaccionable {
    public void depositar(double monto); //Permite agregar dinero a la cuenta
    public void retirar(double monto);   //Permite retirar dinero de la cuenta siempre y cuando haya fondos suficientes
}
