package linter;

import java.util.HashSet;


public class Maps {
    public static void main(String[] args) {
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
    }
    public static String maps(int[][]arrOfArr) {
        HashSet<Integer> temps = new HashSet<>();
        HashSet <String> tempsDone = new HashSet<>();
        int min = 100;
        int max = 0;
        for (int i = 0; i < arrOfArr.length; i++) {
            for (int j = 0; j < arrOfArr[i].length; j++) {
                if (arrOfArr[i][j] > max) {
                    max = arrOfArr[i][j];
                }
                if(arrOfArr[i][j]< min){
                    min = arrOfArr[i][j];
                }
                temps.add(arrOfArr[i][j]);
            }
        }
              tempsDone.add("High:" + max );
              tempsDone.add("Low:" + min );
        for(Integer temp : temps){
            for (int i = min; i < max; i++){
                System.out.println(temp);
                if (temp != i) {
                    tempsDone.add("Never saw temperature:" + i);
                }
            }
        }
        System.out.println(tempsDone);
        return "Temps are here:";
    }
}


