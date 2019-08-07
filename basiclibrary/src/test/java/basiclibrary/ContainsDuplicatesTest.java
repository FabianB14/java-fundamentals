package basiclibrary;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ContainsDuplicatesTest {

    @Test
    public void containsDuplicates() {
        int[] testArr = new int[]{4,2,3,5,1};
        int[] testArr2 = new int[]{4,2,3,5,1,3};
        ContainsDuplicates testContainsDuplicates = new ContainsDuplicates();
        Assert.assertEquals(testContainsDuplicates.containsDuplicates(testArr), false);
        Assert.assertEquals(testContainsDuplicates.containsDuplicates(testArr2), true);
    }
}