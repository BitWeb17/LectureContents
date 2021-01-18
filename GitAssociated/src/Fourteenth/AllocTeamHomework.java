package Fourteenth;

public class AllocTeamHomework {
    public static void main(String[] args) {
        final int TEAMNUMBER = 2;
        System.out.println("지금부터 랜덤 팀 구성을 시작합니다.");

        String[] nameA = {
                "고동영", "장해솔", "류슬기", "박재민", "한다은",
                "최현정", "오진욱", "조진형", "이정현"
        };
        String[] nameB = {
                "이범진", "박소현", "탁성진", "노찬욱",
                "박기범", "하진주", "이승윤", "최임식"
        };

        // 단순히 고정된 사람들을 받는 작업
        // CreateTeam ct = new CreateTeam(name);
        CreateTeam ct = new CreateTeam(nameA, nameB, TEAMNUMBER);

        ct.allocRandomTeam();
        ct.printArrayList(ct.getAteamArrayList());
        ct.printArrayList(ct.getBteamArrayList());
    }
}
