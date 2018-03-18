package fxpro.task;

public class HillsAndPits {

    public int findFilledPits(int[] hillHeights) {

        int filledPits = 0;

        int leftMaxHill = 0;
        int rightMaxHill = 0;

        int leftHill = 0;
        int rightHill = hillHeights.length - 1;

        while (leftHill < rightHill) {

            if (hillHeights[leftHill] > leftMaxHill) {

                leftMaxHill = hillHeights[leftHill];

            }

            if (hillHeights[rightHill] > rightMaxHill) {

                rightMaxHill = hillHeights[rightHill];

            }

            if (leftMaxHill >= rightMaxHill) {

                filledPits += rightMaxHill - hillHeights[rightHill];
                rightHill--;

            } else {

                filledPits += leftMaxHill - hillHeights[leftHill];
                leftHill++;

            }

        }

        return filledPits;
    }

}
