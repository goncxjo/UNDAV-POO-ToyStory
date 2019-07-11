package model.juguete;

import model.juguete.gestormonedas.MetodoDistribuicion;

import java.util.ArrayList;
import java.util.List;

public class Alianza extends Aliado {
    private List<Aliado> aliados = new ArrayList();
    private MetodoDistribuicion metodoDistribuicion;

    public Alianza(MetodoDistribuicion metodoDistribuicion) {
        this.metodoDistribuicion = metodoDistribuicion;
    }

    @Override
    public double getPuntosAtaque() {
        return aliados.stream()
                .mapToDouble(Aliado::getPuntosAtaque)
                .sum();
    }

    @Override
    public int getMonedas() {
        return aliados.stream()
                .mapToInt(Aliado::getMonedas)
                .sum();
    }

    @Override
    public void sumarMonedas(int cantidad) {
        this.metodoDistribuicion.administrar(this.aliados, cantidad);
    }

    public void aliar(Aliado juguete) {
        aliados.add(juguete);
    }
}
