package fxpro.task;

import org.junit.Test;

public class HeightValidatorTest {

    @Test(expected = RuntimeException.class)
    public void testExceedPosition() {
        int[] hillHeights = new int[32001];
        HeightValidator.validate(hillHeights);
    }

    @Test(expected = RuntimeException.class)
    public void testBelowZero() {
        int[] hillHeights = {1, 2, 3, 4, -5, 4, 1, 3, 1};;
        HeightValidator.validate(hillHeights);
    }


    @Test(expected = RuntimeException.class)
    public void testAbove32000() {
        int[] hillHeights = {1, 2, 3, 4, 32001, 4, 1, 3, 1};;
        HeightValidator.validate(hillHeights);
    }

}