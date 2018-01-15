import Ride.Dodgem;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DodgemTest {

    Dodgem dodgem;

    @Before
    public void before() {
        dodgem = new Dodgem(5.0, 7, 48);
    }

    @Test
    public void hasPrice() {
        assertEquals(5.0, dodgem.getPrice());
    }

    @Test
    public void hasMinAge() {
        assertEquals(7, dodgem.getMinAge());
    }

    @Test
    public void hasMinHeight() {
        assertEquals(48, dodgem.getMinHeight(), 0.0);
    }

}
