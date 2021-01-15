package Thirteenth;

public class Wizard extends Mage {
    int amp;

    public Wizard(int atk, int def, int dex, int intel,
                  int con, int mental, int mana, int amp) {

        super(atk, def, dex, intel, con, mental, mana);
        this.amp = amp;
    }

    @Override
    public void skill1() {
        System.out.println("알테마: " + intellect * 15);
        System.out.println("화면상의 모든 적에게 방어 무시 데미지");
    }

    @Override
    public void skill2() {
        System.out.println("썬더 스톰: " + intellect * 10);
        System.out.println("화면상의 적들에게 최대 3회 랜덤하게 벼락을 떨꿈");
    }
}
