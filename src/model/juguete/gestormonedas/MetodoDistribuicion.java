package model.juguete.gestormonedas;

import model.juguete.Aliado;

import java.util.List;

public interface MetodoDistribuicion {
    void administrar(List<Aliado> aliados, int monedas);
}
