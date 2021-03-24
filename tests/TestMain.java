import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestMain 
{
    /**
     * Testing the Main.countEvens method
     */
    @Test(timeout=2000)
    public void countEvensTest()
    {
        assertEquals("countEvens(1234) failed.", Main.countEvens(1234), 2 );
        assertEquals("countEvens(13579) failed.", Main.countEvens(13579), 0 );
        assertEquals("countEvens(2468) failed.", Main.countEvens(2468), 4 );
        assertEquals("countEvens(1020304050) failed.", Main.countEvens(1020304050), 7 );
    }
}