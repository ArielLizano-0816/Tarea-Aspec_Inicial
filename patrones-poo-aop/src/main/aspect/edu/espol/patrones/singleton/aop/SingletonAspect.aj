package edu.espol.patrones.singleton.aop;
// privileged: permite al aspecto invocar el constructor privado.
public privileged aspect SingletonAspect {
    // Un solo objeto por classloader, inicializado de manera segura por la JVM.
    private static final Configuracion UNICA = new Configuracion();
    // Añade getInstance() a Configuracion sin modificar su código fuente.
    public static Configuracion Configuracion.getInstance() {
        return SingletonAspect.UNICA;
    }
}
