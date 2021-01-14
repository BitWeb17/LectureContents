package Twelveth;

class MT {
    private int age = 3;

    int[][] arr1 = {
            {2, 1},
            {1, 2}
    };
    int[][] arr2 = {
            {1, 0},
            {0, 1}
    };
    int[][] res;

    public MT() {
        res = new int[2][2];

        res[0][0] = arr1[0][0] * arr2[0][0] + arr1[0][1] * arr2[1][0];
    }

    public void printMT() {
        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 2; j++) {
                System.out.printf("%3d", res[i][j]);
            }
            System.out.println("");
        }
    }

    public int getAge() {
        return age;
    }
}

public class MatrixTest {
    public static void main(String[] args) {
        //    arr1            arr2
        // ---------       ---------
        // | 2   1 | [0]   | 1   0 | [0]
        // | 1   2 | [1]   | 0   1 | [1]
        // ---------       ---------
        //  [0] [1]         [0] [1]
        //arr1[0][0] * arr2[0][0] + arr1[0][1] * arr[1][0];
        //arr1 * arr2
        MT mt = new MT();

        mt.printMT();

        // 현재 작성된 코드
        for(int i = 0; i < 3; i++) {
            int diceSum = 0;
            for(int j = 0; j < 3; j++) {
                // 처음 주사위가 5가 나오고 다음에 1이 나오면
                // 4가 나오고 다음이 2, 3 이 나오고 또 3이 나오면
                // 2가 나오고 4가 나오면, 1 이 나오고 5가 나오면
                diceSum += (int)(Math.random() * 6) + 1;
                if(diceSum == 6) {
                    diceSum = 0;
                }
            }
        }

        // 보완할 코드
        for(int i = 0; i < 3; i++) {
            int diceSum = 0;
            for(int j = 0; j < 3; j++) {
                // 처음 주사위가 5가 나오고 다음에 1이 나오면
                // 4가 나오고 다음이 2, 3 이 나오고 또 3이 나오면
                // 2가 나오고 4가 나오면, 1 이 나오고 5가 나오면
                int dice = (int)(Math.random() * 6) + 1;
                if(dice == 6) {
                    dice = 0;
                }

                diceSum += dice;
            }
        }

        System.out.println(mt.getAge());
    }
}
