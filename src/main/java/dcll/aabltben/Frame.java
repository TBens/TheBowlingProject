package dcll.aabltben;

/**
<<<<<<< HEAD
 * Created by alexandre on 10/03/2016.
 */
public class Frame {

    private int premier;
    private int second;
    private final int nombreDeQuilles = 10;

    public Frame(final int premierLance, final int secondLance) {
        this.premier = premierLance;
        this.second = secondLance;
    }
    public final boolean isValide() {
        return premier + second <= nombreDeQuilles;
    }

    public final int getPremier() {
        return premier;
    }

    public final int getSecond() {
        return second;
    }
    public final boolean isStrike() {
        return premier == nombreDeQuilles;
    }

    public final boolean isSpare() {
        return (premier + second == nombreDeQuilles
                && premier != nombreDeQuilles);
    }

    public final int score() {
        if (this.isSpare() || this.isStrike()) {
            return nombreDeQuilles;
        } else {
            return premier + second;
        }
    }

}
