import Customer.Adult;
import Customer.Child;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ChildTest {

    Child child;
    Adult adult;

    @Before
    public void before() {
        adult = new Adult("Jim", 38, 70, 100);
        child = new Child("Jimmy", 6, 48, 10, adult);
    }

}
