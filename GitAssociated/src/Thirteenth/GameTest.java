package Thirteenth;

public class GameTest {
    public static void main(String[] args) {
        // interface를 사용하기 가장 좋은 예는 게임이다.
        // 아래와 같은 상황을 구현해보도록 한다.
        //
        // 시작 ---> 1차 전직 ---> 2차 전직
        //
        // 모험가 ---> 전사 ------> 워 로드
        //      ---> 도적 ------> 어쌔신
        //     ---> 마법사 ------> 위자드
        //
        // 각각의 캐릭터들은 공격 스킬을 두 개씩 가지고 있다.
        // 전직을 할 때마다 추가적인 전직 스킬 두 개를 얻게 된다.
        //
        // 스킬을 사용할 때 모두가 일관되게
        // skill1(), skill2(), skill3() 형식으로
        // 데미지가 계산되도록 만들어보자!

        /* 전사, 어쌔신, 워 로드, 위자드도 있는 상황이라 가정
           오토 사냥 클릭시 전부 1, 2, 3, 4 순서로 스킬을 사용한다 가정
           skill1() 으로 모든 캐릭터들이 알아서 1 번 스킬 사용
           skill2() 로 모든 캐릭터가 알아서 2 번 스킬 사용
           skill3() .... skill4() .....

           1: PowerSlash(), FireBall(), BackStep(), Bash()

           필요한 클래스:
           모험가, 전사, 워 로드, 도적, 어쌔신, 마법사, 위자드
           Adventurer, Warrior, WarLoad, Theif, Assassin, Mage, Wizard

           필요한 인터페이스:
           스킬트리
           SkillTree
         */

        Adventurer adv = new Adventurer(
                10, 0, 10,
                10, 10, 0
        );
        Warrior war = new Warrior(
                50, 20, 20,
                15, 30, 10, 100
        );
        WarLoad wl = new WarLoad(
                150, 70, 30, 20,
                60, 30, 200, 50
        );
        Theif t = new Theif(
                20, 10, 70,
                15, 20, 0, 0.1f
        );
        Assassin a = new Assassin(
                70, 30, 200, 40,
                30, 20, 0.2f, 10
        );
        Mage mag = new Mage(
                15, 5, 15,
                80, 20, 50, 1000
        );
        Wizard wiz = new Wizard(
                20, 30, 30, 200,
                30, 100, 2000, 3
        );

        for(;;) {
            adv.skill1();
            System.out.println("********************");
            war.skill1();
            war.subSkill();
            System.out.println("********************");
            System.out.println("--------------------");
            wl.skill1();
            wl.subSkill();
            wl.subSubSkill();
            System.out.println("--------------------");
            t.skill1();
            a.skill1();
            mag.skill1();
            wiz.skill1();

            adv.skill2();
            war.skill2();
            wl.skill2();
            t.skill2();
            a.skill2();
            mag.skill2();
            wiz.skill2();
        }
    }
}
