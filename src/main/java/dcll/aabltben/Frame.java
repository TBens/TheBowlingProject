package dcll.aabltben;

/**
<<<<<<< HEAD
 * Created by alexandre on 10/03/2016.
 */
public class Frame {

    private int premier;
    private int second;

    public Frame(final int premierLance, final int secondLance) {
        this.premier = premierLance;
        this.second = secondLance;
    }

    public int getPremier() {
        return premier;
    }

    public int getSecond() {
        return second;
    }
    public boolean isStrike() {
        return premier == 10;
    }

    public boolean isSpare() {
        return (premier + second == 10 && premier != 10);
    }

    public int score(){
        if(this.isSpare() || this.isStrike()){
            return 10;
        }else{
            return premier+second;
        }
    }

}
