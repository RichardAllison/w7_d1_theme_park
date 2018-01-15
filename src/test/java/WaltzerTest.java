import Ride.Waltzer;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class WaltzerTest {

    Waltzer waltzer;

    @Before
    public void before() {
        waltzer = new Waltzer(5, 5, 44);
    }

}
