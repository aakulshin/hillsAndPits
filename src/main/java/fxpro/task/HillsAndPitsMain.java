package fxpro.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

public class HillsAndPitsMain {

    private static Logger LOGGER = LoggerFactory.getLogger(HillsAndPitsMain.class);

    public static void main(String[] args) {
        try {

            int[] hillHeights = Arrays.stream(args)
                    .mapToInt(Integer::parseInt)
                    .toArray();

            HeightValidator.validate(hillHeights);

            HillsAndPits hillsAndPits = new HillsAndPits();

            int filledPits = hillsAndPits.findFilledPits(hillHeights);

            LOGGER.info("Total number of filled pits is : " + filledPits);

        } catch (Exception e) {

            LOGGER.error("Error is occurred", e);

        }

    }
}
