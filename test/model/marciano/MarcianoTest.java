package model.marciano;

import model.juguete.Juguete;
import model.juguete.JugueteBuilder;
import model.juguete.elemento.Elemento;
import model.juguete.elemento.Lazo;
import model.juguete.elemento.Palo;
import org.junit.Test;

import static org.junit.Assert.*;

public class MarcianoTest {

    @Test
    public void fueEliminado_MarcianoSigueVivo() {
        Juguete juguete = new JugueteBuilder().build(); // por defecto, no tiene brazos
        Elemento lazo = new Lazo(20);
        juguete.equipar(lazo);
        Marciano marcianito = new Comun(); // vida = 10
        assertFalse("IT'S ALIVE!!!", marcianito.fueEliminado(juguete.getPuntosAtaque()));
    }

    @Test
    public void atacar_JugueteObtiene15Monedas() {
        Juguete juguete = new JugueteBuilder().antiguedad(10).agregarBrazos().build();

        Elemento palo1 = new Palo(); // +10 de ataque
        Elemento palo2 = new Palo(); // +10 de ataque
        Elemento palo3 = new Palo(); // +10 de ataque
        juguete.equipar(palo1);
        juguete.equipar(palo2);
        juguete.equipar(palo3);

        Marciano marcianito = new Comun(); // vida = 10
        double monedasAntes = juguete.getMonedas();
        juguete.atacar(marcianito);
        double monedasDespues = juguete.getMonedas();

        assertEquals("El juguete no obtuvo 15 monedas", 15, monedasDespues - monedasAntes, 0.0);
    }
}