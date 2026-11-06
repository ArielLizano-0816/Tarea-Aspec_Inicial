package edu.espol.patrones;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class PatronesTest {
    @Test void adapterPooCumpleContrato() {
        edu.espol.patrones.adapter.poo.Impresora x = new edu.espol.patrones.adapter.poo.AdaptadorImpresora(
                new edu.espol.patrones.adapter.poo.ImpresoraAntigua());
        assertDoesNotThrow(() -> x.imprimir("prueba"));
    }
    @Test void adapterAopCumpleContrato() {
        edu.espol.patrones.adapter.aop.Impresora x = new edu.espol.patrones.adapter.aop.ImpresoraAntigua();
        assertDoesNotThrow(() -> x.imprimir("prueba"));
    }
    @Test void singletonPooEsUnico() {
        assertSame(edu.espol.patrones.singleton.poo.Configuracion.getInstance(),
                   edu.espol.patrones.singleton.poo.Configuracion.getInstance());
    }
    @Test void singletonAopEsUnico() {
        assertSame(edu.espol.patrones.singleton.aop.Configuracion.getInstance(),
                   edu.espol.patrones.singleton.aop.Configuracion.getInstance());
    }
    @Test void singletonAopComparteEstado() {
        var uno = edu.espol.patrones.singleton.aop.Configuracion.getInstance();
        uno.setIdioma("en");
        assertEquals("en", edu.espol.patrones.singleton.aop.Configuracion.getInstance().getIdioma());
    }
}
