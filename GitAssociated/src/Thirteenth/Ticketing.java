package Thirteenth;

public class Ticketing {
    private int numOfHuman;
    private int numOfTicket;

    private int[] personNumberArr;
    private int[] ticketNumberArr;

    public Ticketing(int numOfHuman, int numOfTicket) {
        this.numOfHuman = numOfHuman;
        this.numOfTicket = numOfTicket;

        personNumberArr = new int[50];
        ticketNumberArr = new int[20];
    }

    public int allocRandomPersonNumber() {
        boolean isDup = false;
        int randNum;

        do {
            randNum = (int) (Math.random() * 50);

            if (personNumberArr[randNum] != 0) {
                isDup = true;
            } else {
                isDup = false;
                personNumberArr[randNum] = 1;
            }
        } while(isDup);

        return randNum;
    }

    public void allocTicket(int personNum) {
        boolean isDup = false;
        int randNum;

        do {
            randNum = (int) (Math.random() * 20) + 1;

            if (ticketNumberArr[randNum - 1] != 0) {
                isDup = true;
            } else {
                isDup = false;
                ticketNumberArr[randNum - 1] = personNum;
            }
        } while(isDup);
    }

    public void ticketingTicket() {
        // 1) 랜덤한 중복되지 않는 0 ~ 49까지의 값으로 사람 번호 매기기
        // 2) 랜덤한 중복되지 않는 0 ~ 19까지의 값으로 예매하기
        int personNum;
        //int cnt = 1;

        for(int i = 0; i < numOfTicket; i++) {
            personNum = allocRandomPersonNumber();
            //System.out.printf("%3d", personNum);

            //if(cnt % 5 == 0) {
            //    System.out.println("");
            //}

            //cnt++;

            allocTicket(personNum);
        }
    }

    /*
    public void printPersonNumber() {
        int cnt = 1;

        for(int i = 0; i < personNumberArr.length; i++) {
            System.out.printf("%3d", personNumberArr[i]);

            if(cnt % 5 == 0) {
                System.out.println("");
            }

            cnt++;
        }
    }
     */

    public void printArr(int[] arr) {
        int cnt = 1;

        for(int i = 0; i < arr.length; i++) {
            System.out.printf("%3d", arr[i] + 1);

            if(cnt % 5 == 0) {
                System.out.println("");
            }

            cnt++;
        }
    }

    public int[] getPersonNumberArr() {
        return personNumberArr;
    }

    public int[] getTicketNumberArr() {
        return ticketNumberArr;
    }
}
