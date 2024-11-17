package org.example.dominio;

public class Nodo<tipodato> {
    tipodato dato;
    Nodo<tipodato> nodoSiguiente;

    public Nodo(tipodato dato) {
        this.dato = dato;
        this.nodoSiguiente = null;
    }

    public tipodato getDato() {
        return dato;
    }

    public void setDato(tipodato dato) {
        this.dato = dato;
    }

    public Nodo<tipodato> getNodoSiguiente() {
        return nodoSiguiente;
    }

    public void setNodoSiguiente(Nodo<tipodato> nodoSiguiente) {
        this.nodoSiguiente = nodoSiguiente;
    }
}