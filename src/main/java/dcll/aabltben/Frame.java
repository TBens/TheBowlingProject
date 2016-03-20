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

    public int getPremier(){
        return premier;
    }

    public int getSecond(){
        return second;
    }
    public boolean isStrike(){
        return premier==10;
    }

    public boolean isSpare(){
        return (premier+second == 10 && premier != 10);
    }

    public int score(){
        if(this.isSpare() || this.isStrike()){
            return 10;
        }else{
            return premier+second;
        }
    }

}
