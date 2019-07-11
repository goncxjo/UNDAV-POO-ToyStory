package model.marciano;

public class Comun implements Marciano {
    @Override
    public boolean fueEliminado(double puntosAtaque) {
        return puntosAtaque >= 10;
    }

    @Override
    public int darMonedas(double puntosAtaque) {
        return Integer.divideUnsigned((int)puntosAtaque, 2);
    }
}
