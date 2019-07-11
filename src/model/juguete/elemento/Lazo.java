package model.juguete.elemento;

import model.juguete.Atributos;

public class Lazo extends Elemento {

    public Lazo(int puntosAtaque) {
        super(puntosAtaque);
    }

    @Override
    public double bonificacion(Atributos atributos) {
        return atributos.tieneBrazos() ? getPuntosAtaque() : 0;
    }
}
