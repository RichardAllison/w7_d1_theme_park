import Ride.Waltzer;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class WaltzerTest {

    Waltzer waltzer;

    @Before
    public void before() {
        waltzer = new Waltzer(5, 3, 44);
    }

    @Test
    public void hasPrice() {
        assertEquals(5.0, waltzer.getPrice());
    }

    @Test
    public void hasMinAge() {
        assertEquals(3, waltzer.getMinAge());
    }

    @Test
    public void hasMinHeight() {
        assertEquals(44, waltzer.getMinHeight(), 0.0);
    }

}
