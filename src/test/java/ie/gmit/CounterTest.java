package ie.gmit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CounterTest {

    Counter myCounter;

//    @BeforeEach
//    void init()
//    {
//        myCounter = new Counter();
//    }

    @Test
    void testConstructor()
    {
        myCounter = new Counter();
        assertEquals(0, myCounter.getCount());
    }
    @Test
    void testIncrement()
    {
        myCounter = new Counter();
        assertEquals(1, myCounter.increment());
    }
    @Test
    void testDecrement()
    {
        myCounter = new Counter();
        assertEquals(-1, myCounter.decrement());
    }
}
