package edu.espol.patrones;
public class Demo {
    public static void main(String[] args) {
        System.out.println("=== ADAPTER POO ===");
        edu.espol.patrones.adapter.poo.Impresora p = new edu.espol.patrones.adapter.poo.AdaptadorImpresora(
            new edu.espol.patrones.adapter.poo.ImpresoraAntigua());
        p.imprimir("Documento universitario");

        System.out.println("=== ADAPTER AOP ===");
        edu.espol.patrones.adapter.aop.Impresora a = new edu.espol.patrones.adapter.aop.ImpresoraAntigua();
        a.imprimir("Documento universitario");

        System.out.println("=== SINGLETON POO ===");
        var s1 = edu.espol.patrones.singleton.poo.Configuracion.getInstance();
        var s2 = edu.espol.patrones.singleton.poo.Configuracion.getInstance();
        System.out.println("Misma instancia: " + (s1 == s2));

        System.out.println("=== SINGLETON AOP ===");
        var a1 = edu.espol.patrones.singleton.aop.Configuracion.getInstance();
        var a2 = edu.espol.patrones.singleton.aop.Configuracion.getInstance();
        System.out.println("Misma instancia: " + (a1 == a2));
    }
}
