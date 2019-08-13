package inheritance;

public class Reviews {
    String author;
    int stars;
    String body;
    Restaurant restaurant;

    public Reviews(String author, int stars, String body, Restaurant restaurant){
        this.author = author;
        this.stars = stars;
        this.body = body;
        this.restaurant = restaurant;
    }

    public String reviewToString(){
        String reviewString = this.author + " Says: " + this.body + " and also rated " + this.restaurant.name + " with "
                + this.stars;
        return reviewString;

    }

    public String addReview(Restaurant restaurant){
        restaurant.reviews.add(this);
        restaurant.updateStars(this);
        return this.reviewToString();
    }
}

