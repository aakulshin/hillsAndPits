package fxpro.task;

public class HeightValidator {

    private static final int MAX_HILL_SIZE = 3200;

    public static void validate(int[] hillHeights) {
        //Max number of positions is 32000.
        if (hillHeights.length > MAX_HILL_SIZE) {
            throw new RuntimeException("Max number of position can't exceed 32000");
        }

        //Height is between 0 and 32000.
        for (int hillHeight : hillHeights) {
            if (hillHeight < 0 || hillHeight > 32000) {
                throw new RuntimeException("Hill height should be between  0 and 32000,current value is " + hillHeight);
            }
        }

    }

}
