import Customer.Adult;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class AdultTest {

    Adult adult;

    @Before
    public void before() {
        adult = new Adult("Jim", 38, 70, 100);
    }


}
