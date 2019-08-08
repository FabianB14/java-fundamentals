package linter;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class PathTest {

    @Test
    public void path() {
        assertNotNull("this should not be null", Path.path());
    }
}