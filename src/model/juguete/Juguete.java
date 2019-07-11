package model.juguete;

import model.juguete.elemento.Elemento;
import model.marciano.Marciano;

import java.util.List;

public class Juguete {
    private Atributos atributos;
    private List<Elemento> elementos;
    private int monedas;

    public void atacar(Marciano marciano) {
        double monedasObtenidas = 0;
        double ataqueTotal = this.getPuntosAtaque();
        if(marciano.fueEliminado(ataqueTotal)) {
            monedasObtenidas = marciano.darMonedas(ataqueTotal);
        }
        this.sumarMonedas(monedasObtenidas);
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
}
