package basiclibrary;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

public class RollTest2 {
    @Test
    public void testRoll(){

        Roll testRoll = new Roll();
        Assert.assertEquals(testRoll.roll(5).length, 5);
    }
}
