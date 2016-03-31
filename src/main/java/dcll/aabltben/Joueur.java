package dcll.aabltben;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Thomas BENABENT on 10/03/2016.
 */
public class Joueur {

    private int id;
    private  List<Frame> listeFrames = new ArrayList<Frame>();

    public Joueur(final int idJoueur, final ArrayList<Frame> frames) {
        this.id = idJoueur;
        listeFrames = frames;
    }


    public int getId() {
        return id;
    }

    public int score() {
        int score = 0;
        for (int i = 0; i < listeFrames.size() - 1; i++) {
            Frame frameCourante = listeFrames.get(i);
            Frame frameSuivante = listeFrames.get(i + 1);
            if (frameCourante.isStrike()) {
                score += 10 + frameSuivante.getPremier() + frameSuivante.getSecond();
            } else  if (frameCourante.isSpare()) {
                score += 10 + frameSuivante.getPremier();
            } else {
                score += frameCourante.getPremier() + frameCourante.getSecond();
            }
        }
        //on recup la dernière frame
        score += listeFrames.get(listeFrames.size() - 1).getPremier()
                + listeFrames.get(listeFrames.size() - 1).getSecond();
        return score;
    }

}
