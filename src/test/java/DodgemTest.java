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

}
