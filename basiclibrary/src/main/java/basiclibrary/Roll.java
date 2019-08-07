package basiclibrary;

public class Roll {
    //This method will take in an integer and will create an array that will have random numbers and the length of the integer taken in.
    public int [] roll(int num){
        int[] rollArr = new int[num];
        for(int i = 0; i < num; i++){
            rollArr[i] = (int)Math.floor(Math.random() * 6) +1;
        }
        return rollArr;
    }
}
