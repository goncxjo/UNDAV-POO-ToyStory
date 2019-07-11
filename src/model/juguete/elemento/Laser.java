package model.juguete.elemento;

import model.juguete.Atributos;

public class Laser extends Elemento {

    public Laser(int puntosAtaque) {
        super(puntosAtaque);
    }

    @Override
    public double bonificacion(Atributos atributos) {
        return getPuntosAtaque() * atributos.getPorcentajeMetal() / 100;
    }
}
