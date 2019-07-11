package model.juguete;

import model.marciano.Marciano;

public abstract class Aliado {

    public void atacar(Marciano marciano) {
        double ataqueTotal = this.getPuntosAtaque();

        if(marciano.fueEliminado(ataqueTotal)) {
            int monedasObtenidas = marciano.darMonedas(ataqueTotal);
            this.sumarMonedas(monedasObtenidas);
        }
    }

    public abstract double getPuntosAtaque();

    public abstract int getMonedas();

    public abstract void sumarMonedas(int cantidad);
}
