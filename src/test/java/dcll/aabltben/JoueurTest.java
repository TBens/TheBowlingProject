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
    public void TestConstruct() throws Exception{
        Joueur jou=new Joueur(1,new ArrayList<Frame>());
        assertEquals(jou.getId(),1);
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


    @Test
    public void testScoreZero() throws Exception {
        ArrayList<Frame>listFrame = new ArrayList<Frame>();
        listFrame.add(new Frame(0, 0));
        listFrame.add(new Frame(0, 0));
        listFrame.add(new Frame(0, 0));
        listFrame.add(new Frame(0, 0));
        listFrame.add(new Frame(0, 0));
        listFrame.add(new Frame(0, 0));
        listFrame.add(new Frame(0, 0));
        listFrame.add(new Frame(0, 0));
        listFrame.add(new Frame(0, 0));
        listFrame.add(new Frame(0, 0));
        Joueur j = new Joueur(1, listFrame);
        assertEquals(j.score(),0);
    }

    @Test
    public void testScoreStrike() throws Exception {
        ArrayList<Frame>listFrame = new ArrayList<Frame>();
        listFrame.add(new Frame(10, 0));
        listFrame.add(new Frame(10, 0));
        listFrame.add(new Frame(10, 0));
        listFrame.add(new Frame(10, 0));
        listFrame.add(new Frame(10, 0));
        listFrame.add(new Frame(10, 0));
        listFrame.add(new Frame(10, 0));
        listFrame.add(new Frame(10, 0));
        listFrame.add(new Frame(10, 0));
        listFrame.add(new Frame(10, 0));
        listFrame.add(new Frame(10, 0));
        Joueur j = new Joueur(1, listFrame);
        assertEquals(j.score(),300);
    }

    @Test
    public void testScoreSpare() throws Exception {
        ArrayList<Frame>listFrame = new ArrayList<Frame>();
        listFrame.add(new Frame(5, 5));
        listFrame.add(new Frame(5, 5));
        listFrame.add(new Frame(5, 5));
        listFrame.add(new Frame(5, 5));
        listFrame.add(new Frame(5, 5));
        listFrame.add(new Frame(5, 5));
        listFrame.add(new Frame(5, 5));
        listFrame.add(new Frame(5, 5));
        listFrame.add(new Frame(5, 5));
        listFrame.add(new Frame(5, 5));
        listFrame.add(new Frame(0, 5));
        Joueur j = new Joueur(1, listFrame);
        assertEquals(j.score(),150);
    }

    @Test
    public void testScore1() throws Exception {
        ArrayList<Frame>listFrame = new ArrayList<Frame>();
        listFrame.add(new Frame(10, 0));
        listFrame.add(new Frame(10, 0));
        listFrame.add(new Frame(10, 0));
        listFrame.add(new Frame(10, 0));
        listFrame.add(new Frame(10, 0));
        listFrame.add(new Frame(0, 0));
        listFrame.add(new Frame(0, 0));
        listFrame.add(new Frame(0, 0));
        listFrame.add(new Frame(0, 0));
        listFrame.add(new Frame(0, 0));
        Joueur j = new Joueur(1, listFrame);
        assertEquals(j.score(),120);
    }

    @Test
    public void TestInvalide() throws Exception{
        ArrayList<Frame>listFrame = new ArrayList<Frame>();
        listFrame.add(new Frame(10, 0));
        listFrame.add(new Frame(10, 0));
        listFrame.add(new Frame(10, 0));
        listFrame.add(new Frame(10, 0));
        listFrame.add(new Frame(10, 0));
        listFrame.add(new Frame(0, 0));
        listFrame.add(new Frame(0, 0));
        listFrame.add(new Frame(0, 0));
        listFrame.add(new Frame(0, 0));
        listFrame.add(new Frame(0, 0));
        listFrame.add(new Frame(0, 0));
        Joueur j = new Joueur(1, listFrame);
        assertEquals(j.frameScore(9),0);

    }

    @Test
    public void TestFrameBonus() throws Exception{
        ArrayList<Frame>listFrame = new ArrayList<Frame>();
        listFrame.add(new Frame(10, 0));
        listFrame.add(new Frame(10, 0));
        listFrame.add(new Frame(10, 0));
        listFrame.add(new Frame(10, 0));
        listFrame.add(new Frame(10, 0));
        listFrame.add(new Frame(10, 0));
        listFrame.add(new Frame(10, 0));
        listFrame.add(new Frame(10, 0));
        listFrame.add(new Frame(10, 0));
        listFrame.add(new Frame(7, 3));
        listFrame.add(new Frame(0, 2));
        Joueur j = new Joueur(1, listFrame);
        assertEquals(j.frameScore(9),10);

    }
}