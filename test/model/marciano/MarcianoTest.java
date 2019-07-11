package model.marciano;

import model.juguete.Juguete;
import model.juguete.JugueteBuilder;
import model.juguete.elemento.Elemento;
import model.juguete.elemento.Laser;
import model.juguete.elemento.Lazo;
import model.juguete.elemento.Palo;
import org.junit.Test;

import static org.junit.Assert.*;

public class MarcianoTest {

    @Test
    public void fueEliminado_MarcianoEsEliminado() {
        Juguete juguete = new JugueteBuilder().agregarBrazos().build(); // por defecto, no tiene brazos
        Elemento lazo = new Lazo(15);
        juguete.equipar(lazo);
        Marciano marcianito = new Comun(); // vida = 10
        assertTrue("El marciano sigue vivo", marcianito.fueEliminado(juguete.getPuntosAtaque()));
    }

    @Test
    public void fueEliminado_GarraNoPuedeSerEliminado() {
        Juguete juguete = new JugueteBuilder().porcentajeMetal(100).build(); // por defecto, no tiene brazos
        Elemento laser = new Laser(999);
        juguete.equipar(laser);
        Marciano marcianito = new Garra();
        assertFalse("IT'S ALIVE!!!", marcianito.fueEliminado(juguete.getPuntosAtaque()));
    }
}