package basiclibrary;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AveragesTest {

    @Test
    public void averages() {
        int[] testArr = new int[]{10,20,30,25};
        Averages testAvg = new Averages();
        Assert.assertEquals(testAvg.averages(testArr),21);
    }
}