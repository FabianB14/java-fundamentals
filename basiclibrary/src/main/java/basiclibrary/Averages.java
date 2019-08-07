package basiclibrary;

public class Averages {
    public static int averages(int[] arr){
        int sum = 0;
        int avg;
        for(int i = 0; i < arr.length; i++ ){
            sum += arr[i];
        }
        avg = sum / arr.length;
        return (int)Math.floor(avg);
    }
}
