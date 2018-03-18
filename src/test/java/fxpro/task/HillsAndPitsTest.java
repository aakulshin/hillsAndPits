package fxpro.task;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HillsAndPitsTest {

    @Test
    public void testSuccessFromRightHills() {
        int[] hillHeights = {5, 2, 3, 4, 5, 4, 1, 3, 1};
        HillsAndPits hillsAndPits = new HillsAndPits();
        int filledPits = hillsAndPits.findFilledPits(hillHeights);
        assertEquals(8,filledPits);
    }

    @Test
    public void testSuccessFromLeftHills() {
        int[] hillHeights = {1, 2, 3, 4, 5, 4, 1, 3, 1};
        HillsAndPits hillsAndPits = new HillsAndPits();
        int filledPits = hillsAndPits.findFilledPits(hillHeights);
        assertEquals(2,filledPits);
    }

}