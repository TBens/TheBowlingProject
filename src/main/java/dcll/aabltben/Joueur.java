package dcll.aabltben;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Thomas BENABENT on 10/03/2016.
 */
public class Joueur {

    int id;
    List<Frame> listeFrames = new ArrayList<Frame>();
    public Joueur(int id, ArrayList<Frame> frames){
        this.id = id;
        listeFrames = frames;
    }

    public int getId() {
        return id;
    }

    public int score(){
        int score = 0;

        for(int i = 0; i < listeFrames.size(); i++) {
            score += frameScore(i);
        }
        return score;
    }

    public int frameScore(int i){
        Frame frameCourante = listeFrames.get(i);

        int scoreFrame = frameCourante.score();

        if(frameCourante.isStrike() && i < (listeFrames.size()-1)) {
            Frame nextFrame = listeFrames.get(i+1);

            if(nextFrame.isStrike()) {
                scoreFrame += nextFrame.score();
                int secondNextFrameIndx = i+2;

                if(secondNextFrameIndx < listeFrames.size()) {
                    scoreFrame += listeFrames.get(secondNextFrameIndx).getPremier();
                }
            } else {
                scoreFrame += nextFrame.getPremier() + nextFrame.getSecond();
            }
        } else if(frameCourante.isSpare() && i < listeFrames.size()-1) {
            scoreFrame += listeFrames.get(i+1).getPremier();
        }

        return scoreFrame;


        //return score;
    }

}
