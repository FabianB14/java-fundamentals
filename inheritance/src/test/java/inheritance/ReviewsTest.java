package inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReviewsTest {

    @Test
    public void addReview() {
        Restaurant McDonalds = new Restaurant("McDonald's",0,"$");
        Reviews newReview = new Reviews("Fabian",4,"It was super awesome here",McDonalds);
        Reviews newReview2 = new Reviews("Fabian2",3,"It was super awesome here",McDonalds);
        McDonalds.addReview(newReview2);
        assertEquals("this is going to be the new stars",
                "Fabian2 Says: It was super awesome here and also rated McDonald's with 3",McDonalds.addReview(newReview2));
    }
}