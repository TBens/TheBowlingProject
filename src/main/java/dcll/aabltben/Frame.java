package dcll.aabltben;

/**
 * Created by Thomas BENABENT on 10/03/2016.
 */
public class Frame {
    private int premier;
    private int second;

    /**
     * @param premier premier lancé
     * @param second
     */
    public Frame(int premier, int second) {
        this.premier = premier;
        this.second = second;
    }

    /**
     * @return
     */
    public int getPremier() {
        return premier;
    }

    /**
     * @return
     */
    public int getSecond() {
        return second;
    }

    /**
     * @return
     */
    public boolean isStrike() {
        return premier == 10;
    }

    /**
     * @return
     */
    public boolean isSpare() {
        return (premier + second == 10 && premier != 10);
    }

    /**
     * @return
     */
    public int score() {
        if (this.isSpare() || this.isStrike()) {
            return 10;
        } else {
            return premier + second;
        }
    }

}
