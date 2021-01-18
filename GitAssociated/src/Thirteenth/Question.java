package Thirteenth;

public class Question {
    public static void main(String[] args) {
        int psg[] =new int[20];
        int cnt=0;

        for (int i =0; i <20;i++){
            psg[i]= 0;
        }

        for (int i =1;;){
            int randNum = (int)(Math.random()*50)+1;

            // 1 ~ 50 까지의 숫자가 나왔는데
            // 이걸 어디서 검사하고 있나요 ?
            // 중복 검사 루틴이 아예 없음

            // 1) 20개의 배열 전체를 순회하면서
            // randNum 값이 있는지 검사한다.
            //
            // ---------------------------
            // | 23 | 0 | 0 | 0 | 0 | 13 |
            // ---------------------------
            if(psg[i-1] !=0)
                continue;

            cnt++;
            psg[i-1] =1;

            System.out.printf("%d번 예약자= %d\n",i++,randNum);

            if (cnt == 20) {
                break;
            }
        }
    }
}
