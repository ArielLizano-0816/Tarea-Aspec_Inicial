package edu.espol.patrones.adapter.aop;
public aspect AdaptadorAspect {
    // La clase legacy pasa a cumplir la interfaz requerida sin editar su archivo.
    declare parents: ImpresoraAntigua implements Impresora;
    // Este método se introduce durante el tejido (weaving).
    public void ImpresoraAntigua.imprimir(String mensaje) {
        imprimirTextoAntiguo(mensaje);
    }
}
