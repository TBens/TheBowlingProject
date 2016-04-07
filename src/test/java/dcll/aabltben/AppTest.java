package dcll.aabltben;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Assert;

import java.util.ArrayList;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    @org.junit.Test
    public void main() throws Exception {
        App.main(new String[] {"arg1", "arg2", "arg3"});
        
    }

    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue(true);
    }


}
