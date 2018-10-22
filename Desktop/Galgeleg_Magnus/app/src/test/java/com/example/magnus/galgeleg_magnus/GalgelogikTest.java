package com.example.magnus.galgeleg_magnus;

import org.junit.Test;

import static org.junit.Assert.*;

public class GalgelogikTest {
    @Test
    public void afprøvMedSkovsnegl() {
        Galgelogik spil = new Galgelogik();
        spil.muligeOrd.clear();
        spil.muligeOrd.add("skovsnegl");
        spil.nulstil();

        spil.gætBogstav("e");
        spil.gætBogstav("s");
        assertEquals(0, spil.getAntalForkerteBogstaver());
        assertEquals("s***s*e**", spil.getSynligtOrd());

        spil.gætBogstav("q");
        assertEquals(1, spil.getAntalForkerteBogstaver());

        assertFalse(spil.erSpilletSlut());
        assertFalse(spil.erSpilletTabt());
    }

    @Test
    public void prøvHentOrdFraDr() throws Exception {
        Galgelogik spil = new Galgelogik();
        spil.hentOrdFraDr();
        assertTrue("Mere end 100 ord fra DR", spil.muligeOrd.size()>100);
    }
}