package linter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Tally {
    public static void main(String[] args) {
        List<String> votes = new ArrayList<>();
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Shrub");
        votes.add("Hedge");
        votes.add("Shrub");
        votes.add("Bush");
        votes.add("Hedge");
        votes.add("Bush");
        tally(votes);
    }
    public static String tally(List list){
        int count = 0;
        int count2 = 0;
        String nameSaved = "";
        HashSet <String> votedFor = new HashSet<>();
        for(int i = 0; i < list.size(); i ++){
            votedFor.add((String) list.get(i));
        }
        for(String voted : votedFor){
            System.out.println(voted);
            for(int i = 0; i < list.size(); i ++ ){
                if(voted == list.get(i)){
                    count++;
                }
            }
            if(count > count2){
                count2 = count;
                nameSaved = voted;
            }
            count = 0;
        }
        System.out.println(nameSaved + " received the most votes");
        return nameSaved + " received the most votes";
    }
}
