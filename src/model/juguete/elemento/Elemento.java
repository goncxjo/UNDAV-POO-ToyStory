package model.juguete.elemento;

import model.juguete.Atributos;

public abstract class Elemento {
    private double puntosAtaque;

    public Elemento(int puntosAtaque) { this.puntosAtaque = puntosAtaque; }


    public double getPuntosAtaque() {
        return puntosAtaque;
    }

    public abstract double bonificacion(Atributos atributos);
}