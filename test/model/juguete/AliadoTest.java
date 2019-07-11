package model.juguete;

import model.juguete.elemento.Elemento;
import model.juguete.elemento.Laser;
import model.juguete.elemento.Lazo;
import model.juguete.elemento.Palo;
import model.juguete.gestormonedas.MetodoReparto;
import model.marciano.Comun;
import model.marciano.Marciano;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AliadoTest {

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

    @Test
    public void atacar_AlianzaObtiene10Monedas() {
        Alianza losDeAndy = new Alianza(new MetodoReparto());

        Elemento palo = new Palo(); // +10 de ataque
        Elemento laser = new Laser(10);

        Juguete woody = new JugueteBuilder().agregarBrazos().build();
        woody.equipar(palo);
        Juguete buzzLightYear = new JugueteBuilder().porcentajeMetal(100).agregarBrazos().build();
        buzzLightYear.equipar(laser);

        losDeAndy.aliar(woody);
        losDeAndy.aliar(buzzLightYear);

        Marciano marcianito = new Comun(); // vida = 10
        double monedasAntes = losDeAndy.getMonedas();
        losDeAndy.atacar(marcianito);
        double monedasDespues = losDeAndy.getMonedas();

        assertEquals("La alianza no obtuvo 10 monedas", 10, monedasDespues - monedasAntes, 0.0);
    }

    @Test
    public void getPuntosAtaque_JugueteSinBrazosTieneLazoYnoTieneAtaque() {
        Juguete juguete = new JugueteBuilder().build();
        Elemento lazo = new Lazo(50);
        juguete.equipar(lazo);
        assertEquals("El juguete no tiene ataque nulo", 0, juguete.getPuntosAtaque(), 0.0);
    }

    @Test
    public void getPuntosAtaque_JugueteDeMetalConLaserAumentaAtaque() {
        Juguete juguete = new JugueteBuilder().porcentajeMetal(50).build();
        Elemento laser = new Laser(100);
        juguete.equipar(laser);
        assertEquals("El juguete tiene un ataque no esperado", 50, juguete.getPuntosAtaque(), 0.0);
    }
}