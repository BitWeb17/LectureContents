package Thirteenth;

public class Theif extends Adventurer implements SkillTree {
    float successRate;

    public Theif(int atk, int def, int dex, int intel,
                 int con, int mental, float successRate) {

        super(atk, def, dex, intel, con, mental);
        this.successRate = successRate;
    }

    @Override
    public void skill1() {
        System.out.println("출혈 단검: " + atk * 5);
        System.out.println("4초간 dex만큼 출혈 데미지, 이동속도 저하 30%");
    }

    @Override
    public void skill2() {
        System.out.println("백스텝: " + dex * 8);
        System.out.println("후방 타격시 추가 고정 데미지 250");
    }
}
