package Thirteenth;

public class Wizard extends Mage {
    int amp;

    public Wizard(int atk, int def, int dex, int intel,
                  int con, int mental, int mana, int amp) {

        super(atk, def, dex, intel, con, mental, mana);
        this.amp = amp;
    }
}
