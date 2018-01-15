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

    @Test
    public void hasName() {
        assertEquals("Jim", adult.getName());
    }

    @Test
    public void hasAge() {
        assertEquals(38, adult.getAge());
    }

    @Test
    public void hasHeight() {
        assertEquals(70.0, adult.getHeight(), 0.0);
    }

    @Test
    public void hasWallet() {
        assertEquals(100, adult.getWallet(), 0.0);
    }


}
