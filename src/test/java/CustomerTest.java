import Customer.Customer;
import Customer.Adult;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CustomerTest {

    Customer adult;

    @Before
    public void before() {
        adult = new Adult();
    }

}
