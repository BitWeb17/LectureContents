package Eighth;

public class RandomAlloc {
    public final int DUPLICATE = 1;
    public final int NONDUPLICATE = 2;

    int[] employee;

    public void prepareArray() {
        int randNum = (int)(Math.random() * 11) + 5;

        // 배열의 크기를 랜덤
        employee = new int[randNum];
    }

    public void setRandomArray() {
        for(int i = 0; i < employee.length; i++) {
            // 배열에 대입하는 값을 랜덤으로
            employee[i] = ((int)(Math.random() * 10) + 3) * 333;
        }
    }

    public int getArrayEvenNumberCount() {
        int cnt = 0;

        for(int i = 0; i < employee.length; i++) {
            if(employee[i] % 2 == 0) {
                cnt++;
            }
        }

        return cnt;
    }

    // prepareEmployee ---> prepareArray
    public void prepareEmployee(int num) {
        employee = new int[num];
    }

    public void setRandomNumber(final int ORDER) {
        int[] dupCheck;

        dupCheck = new int[employee.length];

        for (int i = 0; i < employee.length; i++) {
            dupCheck[i] = 0;
        }

        // 루프를 20번만 돌게 되므로
        // 중복시 continue 를 하게되면 반복 횟수가 차감되므로
        // 모든 값을 할당하지 못함!
        // 작업이 종료되었음을 알려주는 변수가 필요하다.
        boolean finish = false;
        // 중복되지 않는 케이스에서는 20 개의 할당이면 끝임을 알려야 한다.
        int cnt = 0;
        // for(int i = 0; i < employee.length; i++) {
        // 아래쪽의 employee[i] = randNum; 부분에서 배열 크기 문제 발생!
        // for(int i = 0; ; i++) {
        for(int i = 0; ;) {
            if(finish) {
                break;
            }

            switch (ORDER) {
                case DUPLICATE:
                    cnt++;
                    if(cnt == 20) {
                        finish = true;
                    }
                    //System.out.println("I'm DUPLICATE");
                    employee[i++] = (int) (Math.random() * 20) + 1;
                    break;

                case NONDUPLICATE:
                    //System.out.println("I'm NON-DUPLICATE");
                    int randNum = (int) (Math.random() * 20) + 1;

                    if(dupCheck[randNum - 1] != 0) {
                        System.out.println("중복 발생! = " + randNum);
                        continue;
                    }

                    employee[cnt++] = randNum;
                    dupCheck[randNum - 1] = 1;

                    if(cnt == 20) {
                        finish = true;
                    }

                    break;

                default:
                    System.out.println("잘못된 요청입니다!");
                    break;
            }
        }
    }

    public void printEmployee() {
        int cnt = 1;

        for(int i = 0; i < employee.length; i++) {
            System.out.printf("%5d", employee[i]);
            //System.out.printf("%3d", i);

            if(cnt % 5 == 0) {
                System.out.println("");
            }
            cnt++;
        }
    }

    public void printPrice() {
        // 규칙: 꽝 - 짝수
        //      7의 배수 - 1000만원
        //      3의 배수 - 100만원
        for(int i = 0; i < employee.length; i++) {
            if(employee[i] % 2 == 0) {
                System.out.println("내년을 기약하세요 ㅠㅠ 꽝입니다.");
            } else if(employee[i] % 7 == 0) {
                System.out.println(
                        "당첨입니다 - 통장으로 1000만원이 입금되었습니다.");
            } else if(employee[i] % 3 == 0) {
                System.out.println(
                        "당첨입니다 - 통장으로 100만원이 입금되었습니다.");
            }
        }
    }
}
