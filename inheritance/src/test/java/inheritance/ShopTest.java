package inheritance;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ShopTest {
    Shop bikeShop;
    Reviews newReview, newReview2;
    @Before
    public void setUp(){
        bikeShop = new Shop("Ninja", 3, "$$$","sales exotic Ninja motorcycles");
        newReview = new Reviews("Fabian", 4, "This place really takes care of their customers", bikeShop);
        newReview2 = new Reviews("Ryan", 3, "This place really takes care of their customers", bikeShop);
    }

    @Test
    public void toSring() {
    assertEquals("this should return the actual string of the Shop", "Ninja shop sales exotic Ninja motorcycles with a price range of $$$", bikeShop.toSring());
    }

    @Test
    public void addReview() {
        assertEquals("this should return the string of the review", "Fabian Says: This place really takes care of their customers and also rated Ninja with 4 stars ",bikeShop.addReview(newReview));
    }
}