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

    public int score(){
        int score = 0;
        for(int i = 0; i<listeFrames.size() ; i++){
            Frame frameCourante = listeFrames.get(i);
            Frame frameSuivante = listeFrames.get(i+1);
             if(frameCourante.isStrike() && i < listeFrames.size()-1){ //Vérifier qu'on n'est pas au dernier lancé
                if(frameSuivante.isStrike() && i < listeFrames.size()){
                    score += 20 + listeFrames.get(i+2).getPremier();
                }else{
                    score += 10 + frameSuivante.score();
                }
            }else if(frameCourante.isSpare()){
                 score += 10 + frameSuivante.getPremier();
            } else{
                score += frameCourante.getPremier() + frameCourante.getSecond();
            }
        }

        return score;
    }

}
