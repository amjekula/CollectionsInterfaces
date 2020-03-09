package Collections;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

public class CollectionTest extends TestCase {
    Collection col;

    @Before
    public void setUp() throws Exception {
        col = new Collection();
    }

    @Test
    public void testStack() {
        assertEquals(col.stack().elementAt(1) , "Luzz");
    }
}