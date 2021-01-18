package Fourteenth;

public class Test {
    public static void main(String[] args) {
        RandomTeamSelection rt = new RandomTeamSelection(17);

        rt.allocArrTeamMemberZeroValue();
        System.out.println("------------------");
        rt.allocArrTeamChoice();
        System.out.println("------------------");
        rt.printRandomTeamArr();
        System.out.println("------------------");
    }
}
