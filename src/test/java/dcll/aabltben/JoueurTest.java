package dcll.aabltben;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by alexandre on 31/03/2016.
 */
public class JoueurTest {

    Joueur j;
    ArrayList<Frame> f;
    @Before
    public void setUp() throws Exception {
        f = new ArrayList<Frame>();
        f.add(new Frame(9,0));
        f.add(new Frame(9,0));
        f.add(new Frame(9,0));
        f.add(new Frame(9,0));
        f.add(new Frame(9,0));
        f.add(new Frame(9,0));
        f.add(new Frame(9,0));
        f.add(new Frame(9,0));
        f.add(new Frame(9,0));
        f.add(new Frame(9,0));
        j=new Joueur(1,f);
    }

    @Test
    public void testScore() throws Exception {
        assertFalse("non vide",f.isEmpty());
        assertTrue ("score Max",j.score()<=300);
        assertTrue("nom lancer",f.size()>=10);

    }

    @Test
    public void testGetId() throws Exception {
        assertEquals(j.getId(),1);
    }
}