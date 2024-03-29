package inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class RestaurantTest {

    @Test
    public void restaurantToString() {
        Restaurant McDonalds = new Restaurant("McDonald's",0,"$");
        assertEquals("this should equal the string of the restaurant", "McDonald's has 0 stars and is priced at $",
                McDonalds.toString());
    }

    @Test
    public void updateStars() {
        Restaurant McDonalds = new Restaurant("McDonald's",0,"$");
        Reviews newReview = new Reviews("Fabian",4,"It was super awesome here",McDonalds);
        Reviews newReview2 = new Reviews("Fabian2",3,"It was super awesome here",McDonalds);
        McDonalds.addReview(newReview2);
        assertTrue("this should return true",McDonalds.compareStars(McDonalds));
    }

}