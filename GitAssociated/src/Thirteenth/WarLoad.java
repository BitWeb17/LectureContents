package Thirteenth;

public class WarLoad extends Warrior implements SkillTree {
    int intention;

    public WarLoad(int atk, int def, int dex, int intel,
                   int con, int mental, float anger, int intention) {
        super(atk, def, dex, intel, con, mental, anger);

        this.intention = intention;
    }

    @Override
    public void skill1() {
        System.out.println("일도양단: " + (atk * 20 + dex * 5));
        System.out.println("일정 확률로 상대를 즉사시킵니다.");
        System.out.println("PK 모드 및 보스전에서 즉사 발동시 추가 고정 데미지 500");
    }

    @Override
    public void skill2() {
        System.out.println("맹렬한 돌진: " + def * 8);
        System.out.println("고속으로 이동하며 지나간 자리에 있는 " +
                "모든 타겟을 0.3초 스턴시킵니다.");
    }
}
