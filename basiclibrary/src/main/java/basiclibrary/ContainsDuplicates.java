package basiclibrary;

import java.util.Arrays;

public class ContainsDuplicates {
    public static boolean containsDuplicates(int[] arr){
        Arrays.sort(arr);
        for(int i = 0; i < arr.length-1;i++){
            if(arr[i] == arr[i+1]){
                return true;
            }
        }
        return false;
    }
}
