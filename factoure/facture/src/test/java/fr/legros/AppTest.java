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

        TypeProduit luxe = new TypeProduit(18.9, "charcuterie");
        double tvaLuxe = luxe.getTva();

        assertEquals(18.9, tvaLuxe);

    }
    /**
     * Rigorous Test.
     */
    @Test
    void  testAjoutProduit(){
        assertEquals();
    }

    
}