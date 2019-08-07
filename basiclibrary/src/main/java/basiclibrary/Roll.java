package basiclibrary;

public class Roll {
    public int [] roll(int num){
        int[] rollArr = new int[num];
        for(int i = 0; i < num; i++){
            rollArr[i] = (int)Math.floor(Math.random() * 6) +1;
        }
        return rollArr;
    }
}
