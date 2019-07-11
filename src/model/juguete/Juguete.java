package model.juguete;

import model.juguete.elemento.Elemento;
import model.marciano.Marciano;

import java.util.ArrayList;
import java.util.List;

public class Juguete {
    private Atributos atributos;
    private List<Elemento> elementos = new ArrayList();
    private int monedas;

    public void atacar(Marciano marciano) {
        double ataqueTotal = this.getPuntosAtaque();

        if(marciano.fueEliminado(ataqueTotal)) {
            double monedasObtenidas = marciano.darMonedas(ataqueTotal);
            this.sumarMonedas(monedasObtenidas);
        }
    }

    public double getPuntosAtaque() {
        return elementos.stream()
                .mapToDouble(e -> e.bonificacion(this.getAtributos()))
                .sum();
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

    public int getMonedas() {
        return this.monedas;
    }

    private void sumarMonedas(double monedas) {
        this.monedas += monedas;
    }

    public void setAtributos(Atributos atributos) {
        this.atributos = atributos;
    }
}
