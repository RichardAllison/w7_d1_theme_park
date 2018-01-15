import Ride.Rollercoaster;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class RollercoasterTest {

    Rollercoaster rollercoaster;

    @Before
    public void before() {
        rollercoaster = new Rollercoaster(10, 8, 52);
    }

    @Test
    public void hasPrice() {
        assertEquals(10.0, rollercoaster.getPrice());
    }

    @Test
    public void hasMinAge() {
        assertEquals(8, rollercoaster.getMinAge());
    }

    @Test
    public void hasMinHeight() {
        assertEquals(52, rollercoaster.getMinHeight(), 0.0);
    }

}
