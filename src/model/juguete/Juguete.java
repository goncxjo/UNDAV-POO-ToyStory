package model.juguete;

import model.juguete.elemento.Elemento;
import model.marciano.Marciano;

import java.util.ArrayList;
import java.util.List;

public class Juguete extends Aliado {
    private Atributos atributos;
    private List<Elemento> elementos = new ArrayList();
    private int monedas;

    @Override
    public double getPuntosAtaque() {
        return elementos.stream()
                .mapToDouble(e -> e.bonificacion(this.getAtributos()))
                .sum();
    }

    @Override
    public int getMonedas() {
        return this.monedas;
    }

    public void equipar(Elemento elemento) {
        elementos.add(elemento);
    }

    public Atributos getAtributos() {
        return atributos;
    }

    public List<Elemento> getElementos() {
        return elementos;
    }

    public void sumarMonedas(int cantidad) {
        this.monedas += cantidad;
    }

    public void setAtributos(Atributos atributos) {
        this.atributos = atributos;
    }
}
