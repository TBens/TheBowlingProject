/**
 package du projet bowling
 */
package dcll.aabltben;

import java.util.ArrayList;

public class App {

    public static void main(final String[] args) {
        ArrayList<Frame> listFrame = new ArrayList<Frame>();
        final Frame f = new Frame(10, 0);
        listFrame.add(f);
        listFrame.add(f);
        listFrame.add(f);
        listFrame.add(f);
        listFrame.add(f);
        listFrame.add(f);
        listFrame.add(f);
        listFrame.add(f);
        listFrame.add(f);
        listFrame.add(f);
        listFrame.add(f);
        Joueur j = new Joueur(1, listFrame);
        System.out.println("le joueur " + j.getId()
        + " comptabilise un score de " + j.score());
    }
}
