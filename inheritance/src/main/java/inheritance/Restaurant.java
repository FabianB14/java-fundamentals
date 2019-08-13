package inheritance;

import java.util.List;

public class Restaurant {
    String name;
    int stars;
    String priceRange;
    List <Reviews> reviews;

    public Restaurant(String name, int stars, String princeRange){
        this.name = name;
        this.stars = stars;
        this.priceRange = princeRange;
    }
    public String restaurantToString(){
        String restaurantString = this.name + " has " + this.stars + " stars and is priced at " + priceRange;
        return  restaurantString;
    }
    public void updateStars(Reviews review){
        int sum = 0;
        for(int i = 0; i < this.reviews.size();i++){
            sum += this.reviews.get(i).stars;
        }
        this.stars = sum/this.reviews.size();
    }

}
