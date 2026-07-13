public class ls {
    

        for (int i = 0; i < contador; i++) {

            int numero = Integer.parseInt(bloques[i]);

            long potencia = (long) Math.pow(numero, e);
            long residuo = potencia % m;

            System.out.println(numero + "^" + e + " mod " + m + " = " + residuo);

            mensajeCifrado += residuo;
        }

        System.out.println("\nMensaje cifrado: " + mensajeCifrado);

        sc.close();
}
