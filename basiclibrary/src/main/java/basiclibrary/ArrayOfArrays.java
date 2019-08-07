package basiclibrary;

import java.util.Arrays;

public class ArrayOfArrays {
//This method will take in a 2D array and will return the array with the lowest average
    public static int[] lowestOfArrays(int[][] arrOfArr) {
        Averages avgArr = new Averages();
        int lowest = 0;
        int[] averageArray = new int[arrOfArr.length];
        int check = Averages.averages(arrOfArr[0]);
        for (int i = 0; i < arrOfArr.length; i++) {
            averageArray[i] = avgArr.averages(arrOfArr[i]);
                if (averageArray[i] <= check) {
                    check = averageArray[i];
                     lowest = i;
            }
        }
        System.out.println(Arrays.toString(arrOfArr[lowest]));
        return arrOfArr[lowest];
    }
}
