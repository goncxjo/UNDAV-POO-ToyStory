package model.juguete.gestormonedas;

import model.juguete.Aliado;

import java.util.List;

public class MetodoReparto implements MetodoDistribuicion {
    @Override
    public void administrar(List<Aliado> aliados, int monedas) {
        long cantidadAliados = aliados.stream().count();
        int monedasPorAliado = monedas / (int)cantidadAliados;

        aliados.stream().forEach(a -> a.sumarMonedas(monedasPorAliado));
    }
}
