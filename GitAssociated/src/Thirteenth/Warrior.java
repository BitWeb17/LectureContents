package Thirteenth;

public class Warrior extends Adventurer {
    float anger;

    public Warrior(int atk, int def, int dex,
                   int intel, int con, int mental, float anger) {

        super(atk, def, dex, intel, con, mental);
        this.anger = anger;
    }
}
