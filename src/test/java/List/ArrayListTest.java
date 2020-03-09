package List;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

public class ArrayListTest extends TestCase {
    ArrayList list;

    @Before
    public void setUp() throws Exception {
        list = new ArrayList();
    }

    @Test
    public void testList() {
        assertEquals(list.list().get(2), "Lonwabo");
    }
}