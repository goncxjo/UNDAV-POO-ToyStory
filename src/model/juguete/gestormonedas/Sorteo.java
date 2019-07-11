package model.juguete.gestormonedas;

import model.juguete.Aliado;

import java.util.List;

class MetodoSorteo implements MetodoDistribuicion {
    @Override
    public void administrar(List<Aliado> aliados, int monedas) {
        int cantidadAliados = (int)aliados.stream().count();
        int aliadoIndex = (int)Math.random() * cantidadAliados;

        aliados.get(aliadoIndex).sumarMonedas(monedas);
    }
}
