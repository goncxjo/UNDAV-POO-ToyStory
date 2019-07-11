package model.marciano;

public class Garra implements Marciano {
    @Override
    public boolean fueEliminado(double puntosAtaque) {
        return false;
    }

    @Override
    public int darMonedas(double puntosAtaque) {
        return 0;
    }
}
