package dcll.aabltben;

/**
<<<<<<< HEAD
 * Created by alexandre on 10/03/2016.
 */
public class Frame {

    /**
     * nombre de quilles qui sont tombées au premier lancée.
     */
    private int premier;

    /**
     * nombre de quilles qui sont tombées au second lancée.
     */
    private int second;

    /**
     * Nombre de quilles qui sont susceptibles de tomber dans une frame.
     */
    private final int nombreDeQuilles = 10;

    /**
     *
     * @param premierLance nombre de quilles qui sont tombées au premier lancée.
     * @param secondLance nombre de quilles qui sont tombées au second lancée.
     */
    public Frame(final int premierLance, final int secondLance) {
        this.premier = premierLance;
        this.second = secondLance;
    }

    /**
     * @return un boolean qui permet de savoir si le score de
     * la frame est valide.
     */
    public final boolean isValide() {
        return premier + second <= nombreDeQuilles;
    }

    /**
     * @return un int qui correspond au nombre de quilles qui sont
     * tombées au premier lancé.
     */
    public final int getPremier() {
        return premier;
    }

    /**
     * @return un int qui correspond au nombre de quilles qui sont
     * tombées au second lancé.
     */
    public final int getSecond() {
        return second;
    }

    /**
     * @return un boolean qui permet de savoir si la frame est un Strike.
     */
    public final boolean isStrike() {
        return premier == nombreDeQuilles;
    }

    /**
     * @return un boolean qui permet de savoir si la frame est un Spare.
     */
    public final boolean isSpare() {
        return (premier + second == nombreDeQuilles
                && premier != nombreDeQuilles);
    }

    /**
     * @return un int qui correspond au score de la frame.
     */
    public final int score() {
        if (this.isSpare() || this.isStrike()) {
            return nombreDeQuilles;
        } else {
            return premier + second;
        }
    }
}
