package dcll.aabltben;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Thomas BENABENT on 10/03/2016.
 */
public class Joueur {

    /**
     * Identifiant du joueur.
     */
    private int id;

    /**
     * Liste de Frames du joueur.
     */
    private List<Frame> listeFrames = new ArrayList<Frame>();

    /**
     * Constructeur d'un joueur.
     * @param num identifiant du joueur.
     * @param frames liste de frames.
     */
    public Joueur(final int num, final ArrayList<Frame> frames) {
        this.id = num;
        listeFrames = frames;
    }

    /**
     * @return l'identifiant du joueur.
     */
    public final int getId() {
        return id;
    }

    /**
     * Retourne le score du joueur.
     * @return un int qui correspond au score du joueur.
     */
    public final int score() {
        int score = 0;
        for (int i = 0; i < listeFrames.size(); i++) {
            if (listeFrames.get(i).isValide()) {
                score += frameScore(i);
            } else {
                System.out.println("frame " + i + " non valide");
                return -1;
            }
        }
        return score;
    }

    /**
     *
     * @param i correspond au numéro de la frame.
     * @return le score pour une frame donnée en paramètre.
     */
    public final int frameScore(final int i) {
        Frame frameCourante = listeFrames.get(i);
        int scoreFrame = frameCourante.score();
        if (frameCourante.isStrike() && i < (listeFrames.size() - 1)) {
            Frame nextFrame = listeFrames.get(i + 1);

            if (nextFrame.isStrike()) {
                scoreFrame += nextFrame.score();
                int secondNextFrameIndx = i + 2;

                if (secondNextFrameIndx < listeFrames.size()) {
                    scoreFrame += listeFrames.get(secondNextFrameIndx)
                            .getPremier();
                }
            } else {
                scoreFrame += nextFrame.getPremier() + nextFrame.getSecond();
            }
        } else if (frameCourante.isSpare() && i < listeFrames.size() - 1) {
            scoreFrame += listeFrames.get(i + 1).getPremier();
        } else if (listeFrames.size() == 11 && i == 9
                && !frameCourante.isSpare() && !frameCourante.isStrike()) {
            System.out.println("erreur derniere frame bonus non autorisee\n");

        }
        return scoreFrame;
    }

}
