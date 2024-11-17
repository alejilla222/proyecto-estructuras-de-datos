package org.example.dominio;

import java.util.ArrayList;

public class Publico extends Cotizante{
    boolean condecoraciones;
    String intitucionPublica;
    ArrayList<Hijos> listahijos;
    boolean obserDisiplinaria; //observacion diciplinaria

    public Publico() {
        super();
    }

    public Publico(boolean condecoraciones, String intitucionPublica, ArrayList<Hijos> listahijos, boolean obserDisiplinaria) {
        this.condecoraciones = condecoraciones;
        this.intitucionPublica = intitucionPublica;
        this.listahijos = listahijos;
        this.obserDisiplinaria = obserDisiplinaria;
    }

    public boolean isCondecoraciones() {
        return condecoraciones;
    }

    public void setCondecoraciones(boolean condecoraciones) {
        this.condecoraciones = condecoraciones;
    }

    public String getIntitucionPublica() {
        return intitucionPublica;
    }

    public void setIntitucionPublica(String intitucionPublica) {
        this.intitucionPublica = intitucionPublica;
    }

    public boolean isObserDisiplinaria() {
        return obserDisiplinaria;
    }

    public void setObserDisiplinaria(boolean obserDisiplinaria) {
        this.obserDisiplinaria = obserDisiplinaria;
    }
    public ArrayList<Hijos> getListahijos() {
        return listahijos;
    }

    public void setListahijos(ArrayList<Hijos> listahijos) {
        this.listahijos = listahijos;
    }
}