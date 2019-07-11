package model.juguete.elemento;

import model.juguete.Atributos;

public class Palo extends Elemento {

    public Palo(int puntosAtaque) {
        super(10);
    }

    @Override
    public double bonificacion(Atributos atributos) {
        return getPuntosAtaque();
    }
}
