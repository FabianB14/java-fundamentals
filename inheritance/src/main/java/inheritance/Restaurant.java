package inheritance;

public class Restaurant extends Business implements Yelpie {


    public Restaurant(String name, int stars, String princeRange){
        super(name,stars,princeRange);
    }

    public String toString(){
        String restaurantString = this.name + " has " + this.stars + " stars and is priced at " + priceRange;
        return  restaurantString;
    }

    public boolean compareStars(Restaurant restaurant){
        if(this.stars == restaurant.stars){
            return true;
        }
        return false;
    }

    public String addReview(Reviews review){
        this.reviews.add(review);
        this.updateStars(review);
        return review.reviewToString();
    }

}
