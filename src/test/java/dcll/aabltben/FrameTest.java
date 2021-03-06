package dcll.aabltben;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by alexandre on 31/03/2016.
 */
public class FrameTest {
    Frame f;

    @Before
    public void setUp() throws Exception {
        f=new Frame(9,0);

    }

    @Test
    public void testGetPremier() throws Exception {
        assertEquals(f.getPremier(),9);

    }

    @Test
    public void testGetSecond() throws Exception {
        assertEquals(f.getSecond(),0);

    }

    @Test
    public void testIsStrike() throws Exception {
        f=new Frame(10,0);
        assertEquals(f.getPremier(),10);
        assertEquals(f.getSecond(),0);


    }

    @Test
    public void testIsSpare() throws Exception {
        f=new Frame(5,5);
        assertNotEquals(f.getPremier(),10);
        assertEquals(f.getPremier()+f.getSecond(),10);
    }

    @Test
    public void TestIsValide() throws Exception{
        f=new Frame(11,5);
        assertFalse(f.isValide());
        f=new Frame(5,3);
        assertTrue(f.isValide());
    }
}