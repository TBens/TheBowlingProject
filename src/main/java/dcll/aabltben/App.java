package dcll.aabltben;

import java.util.ArrayList;

/**
 *
 */
public class App {
    public static void main(String[] args) {
        ArrayList<Frame> listeFrames = new ArrayList<Frame>();
        Frame[] frames = {
                new Frame(10, 0), new Frame(10, 0),
                new Frame(0, 0), new Frame(0, 0),
                new Frame(0, 0), new Frame(0, 0),
                new Frame(0, 0), new Frame(0, 0),
                new Frame(0, 0), new Frame(0, 0)
        };
        for (int i = 0; i < 10; i++) {
            listeFrames.add(frames[i]);
        }
        Joueur j1 = new Joueur(1, listeFrames);
        System.out.print("Score : " + j1.score());
    }

}
