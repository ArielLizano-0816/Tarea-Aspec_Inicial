package edu.espol.patrones.singleton.aop;
public final class Configuracion {
    private String idioma = "es";
    private Configuracion() { }
    public String getIdioma() { return idioma; }
    public void setIdioma(String idioma) { this.idioma = java.util.Objects.requireNonNull(idioma); }
}
