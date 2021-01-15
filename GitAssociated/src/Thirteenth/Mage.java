package Thirteenth;

public class Mage extends Adventurer {
    int mana;

    public Mage(int atk, int def, int dex, int intel,
                int con, int mental, int mana) {

        super(atk, def, dex, intel, con, mental);
        this.mana = mana;
    }
}
