package Set;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class SortTreeTest extends TestCase {
    SortTree sort;

    @Before
    public void setUp() throws Exception {
        sort = new SortTree();
    }

    @Ignore
    @Test
    public void testTree() {
        assertEquals(sort.tree().size(), 4);
    }
}