package inheritance;

public class Shop extends Business implements Yelpie {
    //this is the properties of the Shop class
    String description;
    //this is the constructor of the shop class
    public Shop(String name, int stars, String princeRange, String description) {
        super(name, stars, princeRange);
        this.description = description;
    }
    //This is the toString method for Shop it will return a string that would e understood
    public String toSring(){
        String shopString = this.name + " shop " + this.description + " with a price range of " + this.priceRange;
        return shopString;
    }
    public String addReview(Reviews review){
        this.reviews.add(review);
        this.updateStars(review);
        return review.reviewToString();
    }
}
