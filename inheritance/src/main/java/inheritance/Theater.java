package inheritance;

import java.util.LinkedList;

public class Theater extends Business implements Yelpie {
    //these are all the properties of the Theater class
    LinkedList<Movies> moviesLinkedList = new LinkedList<>();

    //this is the constructor for the Theater class
    public Theater(String name, int stars) {
        super(name, stars);
        this.name = name;
        System.out.println(name);

    }

    //this is the toString method which will return a string in reasonable format
    public String toString(){
        String movies = "";
        for(int i = 0; i < this.moviesLinkedList.size(); i++) {
            Movies moviesContainer =  this.moviesLinkedList.get(i);
            movies += moviesContainer.name + " ";
        }
        String theString = this.name + " is a great place to watch a movie, you can watch "+ movies;
        return theString;
    }
    //this is the addMovie method and it will a a movie to this theater and add the movie to the linked list
    public void addMovie(String movieName){
        Movies newMovie = new Movies(movieName,this);
        this.moviesLinkedList.add(newMovie);
    }
    //this is the remove a movie method and will search the linked list for a certain movie name and will remove that movie
    public String removeMovie(String movieName){
        for(Movies movie: moviesLinkedList){
            if(movie.name == movieName){
                moviesLinkedList.remove(movie);
                return "Movie has been removed";
            }
        }
        return "Movie was not found";
    }
    public String addReview(Reviews review){
        this.reviews.add(review);
        this.updateStars(review);
        return review.reviewToString();
    }

}
