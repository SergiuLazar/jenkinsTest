import junit.framework.TestCase;
import org.junit.Test;
import static  org.junit.Assert.*;

/**
 * Created by slazaran on 7/15/2016.
 */

public class UnitTest {

    @Test
    public void testMethodPass() {
        assertTrue(HelloWorld.CreateMessage(0).equals("Goodbye world"));
    }

    @Test
    public void testMethodFail() {
        
        assertTrue(HelloWorld.CreateMessage(1).equals("Hello World!"));
    }
}
