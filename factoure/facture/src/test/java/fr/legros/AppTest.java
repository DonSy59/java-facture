package fr.legros;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
class AppTest {
    /**
     * Rigorous Test.
     */
    @Test
    void testGetTva() {

        TypeProduit luxe = new TypeProduit(18.9, "mobilier");
        double tvaLuxe = luxe.getTva();

        assertEquals(18.9, tvaLuxe);

    }

    
}