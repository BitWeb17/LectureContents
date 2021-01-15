package Thirteenth;

public class WarLoad extends Warrior {
    int intention;

    public WarLoad(int atk, int def, int dex, int intel,
                   int con, int mental, float anger, int intention) {
        super(atk, def, dex, intel, con, mental, anger);

        this.intention = intention;
    }
}
