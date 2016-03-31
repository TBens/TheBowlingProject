/**
 package du projet bowling
 */
package dcll.aabltben;

import java.util.ArrayList;

public class App {

    public static void main (String[] args) {
        ArrayList<Frame>listFrame = new ArrayList<Frame>();
        listFrame.add(new Frame(9, 0));
        listFrame.add(new Frame(9, 0));
        listFrame.add(new Frame(9, 0));
        listFrame.add(new Frame(9, 0));
        listFrame.add(new Frame(9, 0));
        listFrame.add(new Frame(9, 0));
        listFrame.add(new Frame(9, 0));
        listFrame.add(new Frame(9, 0));
        listFrame.add(new Frame(9, 0));
        listFrame.add(new Frame(9, 0));
        Joueur j = new Joueur(1, listFrame);
        System.out.println("le joueur " + j.getId() +
        " comptabilise un score de " + j.score());
    }
}
