package basiclibrary;

import java.util.Arrays;

public class ContainsDuplicates {
    //This method will take in an array of integers and will return a boolean if there are duplicates integers or not
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
