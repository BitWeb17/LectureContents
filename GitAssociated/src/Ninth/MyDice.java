package Ninth;

import java.util.Scanner;

public class MyDice {
    int ruleNum;
    int playerNum;
    int numOfDice;
    int[] sumOfDice;
    int[] playerArr;

    boolean octahedronGame;
    Scanner scan;

    public MyDice(int playerNum, int numOfDice, int ruleNum) {
        this.playerNum = playerNum;
        this.numOfDice = numOfDice;
        this.ruleNum = ruleNum;
        // playerNum: 사용자 숫자를 받기 위한 변수
        // numOfDice: 주사위 숫자
        // ruleNum: 6이 나오면 0으로 만들기 위한 특수 규칙이 적용되는 수

        playerArr = new int[playerNum];
        sumOfDice = new int[playerNum];
        // 정렬을 하다보니까 주사위 합산 배열 정렬할 때
        // 사용자를 같이 이동시켜줘야 하므로 사용자 배열도 같이 만듬

        for(int i = 0; i < playerNum; i++) {
            // 초기 합산을 하기 위해서 0 으로 초기화
            sumOfDice[i] = 0;
            // 사용자 번호를 1 ~ 순서대로 배치하기 위한 작업
            playerArr[i] = i + 1;
        }
    }

    public MyDice(int playerNum) {
        this.playerNum = playerNum;

        sumOfDice = new int[playerNum];
        scan = new Scanner(System.in);

        System.out.println("생성자 호출");
    }

    // 무한루프 돌리는 조건 Game을 참, 두번째 반복에서 옵션 여부를 줄 Option을 거짓
    public void playOctahedron() {
        int octahedronDice;
        int cnt = 0;

        for(int i = 0; i < playerNum; i++) {
            System.out.printf("%d번 사용자 게임 시작!\n", i);
            octahedronGame = true;

            while (octahedronGame) {
                octahedronDice = (int) (Math.random() * 8) + 1;
                cnt++;

                if(cnt == 3) {
                    cnt = 0;
                    break;
                }

                System.out.printf("%d번 사용자, %d번째 시도, 주사위 눈금 = %d\n",
                        i, cnt, octahedronDice);

                sumOfDice[i] += octahedronDice;

                if (cnt == 1 && octahedronDice % 2 == 0) {
                    octahedronGame = false;
                    cnt = 0;
                } else if(cnt == 2 && octahedronDice % 2 == 0) {
                    switch (octahedronDice) {
                        // 2: 이미 주사위를 얻은 사람의 주사위 값을 3 파괴한다.
                        case 2:
                            for(int j = i - 1; j >= 0; j--) {
                                sumOfDice[j] -= 3;
                            }
                            break;
                        // 4: 지정한 사용자의 주사위 값을 0 으로 만든다.
                        case 4:
                            System.out.print("누굴 작살낼까요 ? ");
                            int tmp = scan.nextInt();
                            sumOfDice[tmp] = 0;
                            break;
                        // 6: 모든 플레이어의 주사위 값을 2 파괴한다.
                        case 6:
                            for(int j = i; j >= 0; j--) {
                                sumOfDice[j] -= 2;
                            }
                            break;
                        // 8: 자신을 제외한 모든 플레이어의 주사위 값을 3 상승시킨다.
                        case 8:
                            for(int j = 0; j <= 2; j++) {
                                if(j == i) {
                                    continue;
                                }

                                sumOfDice[j] += 3;
                            }
                            break;
                    }
                }
            }
        }
    }

    public void playGame() {
        // 사용자 숫자만큼 반복
        for(int i = 0; i < playerNum; i++) {
            // 사용자가 가지고 있는 주사위 숫자만큼 반복
            for(int j = 0; j < numOfDice; j++) {
                int dice = (int) (Math.random() * 6) + 1;

                // 6 이면 제끼고
                if (dice == ruleNum) {
                    continue;
                }

                // 아니면 합산
                sumOfDice[i] += dice;
            }
        }
    }

    public void printSumOfOctahedronDice() {
        for(int i = 0; i < playerNum; i++) {
            System.out.printf(
                    "%d 번째 사용자의 주사위 눈금합 = %d\n",
                    i, sumOfDice[i]);
        }
    }

    // 통합을 위해 수정이 필요한 매서드
    public void printSumOfDice() {
        for(int i = 0; i < playerNum; i++) {
            // sumOfDice[playerArr[i] - 1]
            // playerArr[i] = 1 ~ 5 전체 - 1 = 0 ~ 4
            // sumOfDice[0 ~ 4]
            // 여기 나오는 숫자 0 ~ 4는 플레이어 번호가 되므로
            // 결국 플레이어의 출력 숫자가 그대로 유지한 상태로 나온다.
            // 사용자 번호는 바뀌지만 sumOfDice 값은 그대로 유지되어 나왔음
            // 정렬을 안했다면 괜찮지만 정렬을 했기 때문에
            // 정렬된 상태인 sumOfDice 를 그대로 뿌려야 정렬값을 볼 수 있었음
            System.out.printf(
                "%d 번째 사용자의 주사위 눈금합 = %d\n",
                    playerArr[i], sumOfDice[i]);
        }
    }

    // 오직 개수가 적은것에서만 유리한 정렬 알고리즘(삽입 정렬)
    public void insertSort() {
        int i, j, numKey, playerNoKey, len = sumOfDice.length;

        // numKey 값은 교체 대상의 백업
        // playerNoKey 도 마찬가지

        // 현재 케이스에서는 숫자만 정렬하면 안되고
        // 사용자 번호를 같이 처리(핸들링)해줘야 한다.

        //  1      2      3     - 사용자 번호
        //  8      4      6     - 주사위 눈금
        // [0]    [1]    [2]    - 배열의 인덱스

        for(i = 1; i < len; i++) {
            numKey = sumOfDice[i];
            playerNoKey = playerArr[i];

            // (j != -1) 은 sumOfDice[-1] 에 의해 배열 인덱스 오류를 방지하기 위해 도입
            for(j = i - 1; (j != -1) && (sumOfDice[j] > numKey); j--) {
                sumOfDice[j + 1] = sumOfDice[j];
                playerArr[j + 1] = playerArr[j];
            }

            // 1 번째
            //  1      1      3     - 사용자 번호
            //  8      8      6     - 주사위 눈금
            // [0]    [1]    [2]    - 배열의 인덱스

            // 2 번째
            //  2      1      1     - 사용자 번호
            //  4      8      8     - 주사위 눈금
            // [0]    [1]    [2]    - 배열의 인덱스

            sumOfDice[j + 1] = numKey;
            playerArr[j + 1] = playerNoKey;

            // 1 번째
            //  2      1      3     - 사용자 번호
            //  4      8      6     - 주사위 눈금
            // [0]    [1]    [2]    - 배열의 인덱스

            // 2 번째
            //  2      3      1     - 사용자 번호
            //  4      6      8     - 주사위 눈금
            // [0]    [1]    [2]    - 배열의 인덱스

            // 카드 주어졌을때
            // 카드를 순서대로 배치한다고 생가했을때 동작하는 메커니즘과 동일
        }
    }
}
