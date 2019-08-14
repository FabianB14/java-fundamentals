package inheritance;

import java.util.LinkedList;

public class Business {
    String name;
    int stars;
    String priceRange;
    LinkedList<Reviews> reviews = new LinkedList<>();

    public Business(String name, int stars, String princeRange){
        this.name = name;
        this.stars = stars;
        this.priceRange = princeRange;
    }

    public Business(String name, int stars) {
    }

    public void updateStars(Reviews review){
        int sum = 0;
        for(int i = 0; i < this.reviews.size();i++){
            System.out.println(this.reviews.get(i).stars);
            sum += this.reviews.get(i).stars;
        }
        this.stars = sum/this.reviews.size();
    }
}


