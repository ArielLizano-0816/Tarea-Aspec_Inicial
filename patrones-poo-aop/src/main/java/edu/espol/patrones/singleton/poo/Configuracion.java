package edu.espol.patrones.singleton.poo;
public final class Configuracion {
    private static final Configuracion INSTANCIA = new Configuracion();
    private String idioma = "es";
    private Configuracion() { }
    public static Configuracion getInstance() { return INSTANCIA; }
    public String getIdioma() { return idioma; }
    public void setIdioma(String idioma) { this.idioma = java.util.Objects.requireNonNull(idioma); }
}
