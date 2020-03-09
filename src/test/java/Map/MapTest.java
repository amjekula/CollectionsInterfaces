package Map;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

public class MapTest extends TestCase {
    Map map;

    @Before
    public void setUp() throws Exception {
        map = new Map();
    }

    @Test
    public void testHash() {
        assertTrue(map.hash().size() == 3);
    }
}