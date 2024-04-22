import org.junit.Test;
import static org.junit.Assert.*;

public class NextDaysTest {
    
    @Test
    public void testNextDays() {
        assertEquals("Next date: 29/2/1900", NextDays.getNextDays(28, 2, 1900));
        assertEquals("Next date: 1/1/1813", NextDays.getNextDays(31, 12, 1812));
        assertEquals("Next date: 29/2/1904", NextDays.getNextDays(28, 2, 1904));
        assertEquals("Next date: 1/3/2011", NextDays.getNextDays(28, 2, 2011));
        assertEquals("Invalid input", NextDays.getNextDays(30, 2, 2000));
    }
}