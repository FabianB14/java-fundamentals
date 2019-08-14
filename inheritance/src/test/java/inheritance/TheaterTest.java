package inheritance;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TheaterTest {
    Theater AMV;
    Reviews newReview, newReview2;
    String movies;
    @Before
    public void setUp(){
        AMV = new Theater("AMV", 3);
        newReview = new Reviews("Fabian", 4, "This place really takes care of their customers", AMV);
        newReview2 = new Reviews("Ryan", 3, "This place really takes care of their customers", AMV);
        AMV.addMovie("Batman");
        AMV.addMovie("Avengers");
        AMV.addMovie("Batman2");
        AMV.addMovie("Spiderman");
        newReview = new Reviews("Fabian", 2, "This place really takes care of their customers NOT!!!", AMV);
        newReview2 = new Reviews("Bobby", 4, "This place really takes care of their customers", AMV);


    }


    @Test
    public void testToString() {
        assertEquals("this should return the actual string of the Theater", "AMV is a great place to watch a movie, you can watch Batman Avengers Batman2 Spiderman " , AMV.toString());

    }

    @Test
    public void removeMovie() {
        AMV.removeMovie("Avengers");
        assertEquals("this should return the actual string of the Theater", "AMV is a great place to watch a movie, you can watch Batman Batman2 Spiderman " , AMV.toString());

    }

    @Test
    public void addReview() {
        assertEquals("this should return the string of the review", "Fabian Says: This place really takes care of their customers NOT!!! and also rated AMV with 2 stars ",AMV.addReview(newReview));

    }
}