package inheritance;

public class Reviews {
    String author;
    int stars;
    String body;
    Business business;

    public Reviews(String author, int stars, String body, Business business){
        this.author = author;
        this.stars = stars;
        this.body = body;
        this.business = business;
    }

    public String reviewToString(){
        String reviewString = this.author + " Says: " + this.body + " and also rated " + this.business.name + " with "
                + this.stars;
        return reviewString;

    }


}

