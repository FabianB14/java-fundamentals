package inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class RestaurantTest {

    @Test
    public void restaurantToString() {
        Restaurant McDonalds = new Restaurant("McDonald's",0,"$");
        assertEquals("this should equal the string of the restaurant", "McDonald's has 0 starts and is priced at $",
                McDonalds.restaurantToString());
    }

    @Test
    public void updateStars() {
    }
}