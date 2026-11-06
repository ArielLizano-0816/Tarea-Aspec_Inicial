package edu.espol.patrones.adapter.poo;
import java.util.Objects;
public class AdaptadorImpresora implements Impresora {
    private final ImpresoraAntigua antigua;
    public AdaptadorImpresora(ImpresoraAntigua antigua) { this.antigua = Objects.requireNonNull(antigua); }
    @Override public void imprimir(String mensaje) { antigua.imprimirTextoAntiguo(mensaje); }
}
