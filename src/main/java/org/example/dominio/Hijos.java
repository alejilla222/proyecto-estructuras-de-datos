package org.example.dominio;

public class Hijos {
    String nombre;
    int edad;
    String trabajo;

    public Hijos(String nombre, int edad, String trabajo) {
        this.nombre = nombre;
        this.edad = edad;
        this.trabajo = trabajo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTrabajo() {
        return trabajo;
    }

    public void setTrabajo(String trabajo) {
        this.trabajo = trabajo;
    }
}

