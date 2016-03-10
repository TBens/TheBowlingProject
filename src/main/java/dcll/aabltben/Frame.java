package dcll.aabltben;

/**
 * Created by Thomas BENABENT on 10/03/2016.
 */
public class Frame {
    private int premier;
    private int second;

    public Frame(int premier, int second){
        this.premier = premier;
        this.second = second;
    }

    int getPremier(){
        return premier;
    }

    int getSecond(){
        return second;
    }
    boolean isStrike(){
        return premier==10;
    }

    boolean isSpare(){
        return (premier+second == 10 && premier != 10);
    }



}
