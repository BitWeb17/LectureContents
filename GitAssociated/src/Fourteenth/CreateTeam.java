package Fourteenth;

import java.util.ArrayList;
import java.util.Iterator;

public class CreateTeam {
    private ArrayList<String> AteamArrayList;
    private ArrayList<String> BteamArrayList;

    private String[] AteamArr;
    private String[] BteamArr;

    private int AnumOfPerson;
    private int numOfTeam;

    private int BnumOfPerson;

    public CreateTeam(String[] arrA, String[] arrB, final int TEAMNUMBER) {
        AteamArr = arrA;
        BteamArr = arrB;

        AnumOfPerson = arrA.length;
        BnumOfPerson = arrB.length;

        numOfTeam = TEAMNUMBER;

        AteamArrayList = new ArrayList<String>();
        BteamArrayList = new ArrayList<String>();
    }

    public void allocRandomTeam() {
        // 문제 풀 때 어떤식으로 접근을 해야할까요 ?
        // 1. 우선 이 문제를 풀기 위한 전략을 세워야 한다.
        // 2. 문제가 요구 사항을 파악해야한다.
        // 3. 요구 사항을 하나 하나 각개 격파한다.

        // 위의 방식을 따라서 현재 문제에 대한 요구 사항을 파악해보자!
        // 문제: 우리반 사람들을 4개의 팀으로 랜덤하게 할당한다.
        // 1) 랜덤을 사용해야 한다(Math.random() 혹은 Random 클래스)
        // 2) 우리반 사람들이 몇 명 있는가 ? 17명
        // 2-2) 현재 교차 대면 수업을 하므로
        //      A조, B조가 구별되어 있는 상태다.
        //      A조는 A조 내에서 분할, B조도 B조 내에서 분할
        //      입력 배열이 1개가 아니고 2개의 입력 배열이 필요하다.
        // 2-3) 현재 케이스는 굉장히 특수한 케이스이므로
        //      일반적인 상황에서 배열 1개면 충분할 것이다.
        // 3) 몇 개의 팀으로 구성해야 하는가 ? 4개의 팀
        // 4) 만약 상황이 바뀐다면 n 개의 팀도 가능할까 ? 여기까지 고려하면 좋음
        // 5) 그렇다면 17명을 어떻게 4개의 팀으로 나눌까 ?
        //    17 나누기 4 를 하고 랜덤한 특정 번호에 5명을 배치하게 해볼까 ?
        // 6) 랜덤한 팀원수를 가지는 팀을 분할 했다면
        //    이제 실제 random 값을 추출하여
        //    ArrayList에 정보를 배치한다.
        // 7) 중복이 되면 안되므로 중복을 판정하는 루틴이 추가적으로 필요하다.

        // 프로젝트: ~~을 만들어서 돈을 법시다.
        // *: ~ 을 어떻게 만들까 ?
        // 앞으로 숙제할 때 요구 사항을 분석하는 연습을 해보면 좋을것 같습니다.

        // 1) 배열을 백업 받았으므로 랜덤값을 뽑아서
        //    해당 값을 인덱스로 특정 인물을 추출하여 ArrayList에 설정한다.

        /*
        for(int i = 0; i < AnumOfPerson; i++) {
            int randNum = (int)(Math.random() * AnumOfPerson);

            AteamArrayList.add(AteamArr[randNum]);
        }

        for(int i = 0; i < BnumOfPerson; i++) {
            int randNum = (int)(Math.random() * BnumOfPerson) + AnumOfPerson;

            BteamArrayList.add(BteamArr[randNum]);
        }
         */

        allocArrayList(
                AteamArrayList, AteamArr, AnumOfPerson
        );
        allocArrayList(
                BteamArrayList, BteamArr, BnumOfPerson
        );
    }

    public void allocArrayList(
            ArrayList<String> al,
            String[] arr,
            int loopNum) {

        boolean isDup = false;

        for(int i = 0; i < loopNum; i++) {
            // 우리는 A 배열, B 배열이 나눠진 케이스를 받으므로
            // 하나의 배열에서 모든 값을 처리하지 않는다.
            // 그러므로 start를 별도로 만들 필요가 없었다.
            // int randNum = (int)(Math.random() * loopNum) + start;
            do {
                int randNum = (int)(Math.random() * loopNum);

                if(al.contains(arr[randNum])) {
                    isDup = true;
                    continue;
                } else {
                    isDup = false;
                }

                al.add(arr[randNum]);
            } while(isDup);
        }
    }

    public void printArrayList(ArrayList<String> al) {
        String name;
        // ticketArrayList를 순회할 수 있는 정보를 얻음
        Iterator e = al.iterator();

        int cnt = 1;
        int divNum;
        int quot = al.size() / numOfTeam;
        int remain = al.size() % numOfTeam;
        boolean needException =
                (remain > 0) ? true : false;

        int randValue = 0;
        // 현재 발생하는 문제
        // 1) 매 반복마다 randValue가 0, 1, 0, 1 스위칭되고 있음

        // 순회할 수 있는가 ?
        // 데이터가 없으면 루프 진행 x
        // 데이터가 하나라도 있으면 루프 진행 o
        while(e.hasNext()) {
            // 존재하는 값을 가져와서 Integer 형식으로 저장합니다.
            name = (String) e.next();
            System.out.printf("%s ", name);

            // 현재 케이스에서는 무조건 앞에 5명이 나온다.
            // 그러므로 이것도 랜덤하게 4, 5 혹은 5, 4가 나오게 해줘야 한다.
            if(needException) {
                randValue = (int)(Math.random() * 2);
                needException = false;
            }

            /*
            System.out.printf("cnt = %d, quot + randValue = %d\n",
                    cnt, quot + randValue);
             */

            if((cnt % (quot + randValue)) == 0) {
                System.out.println("");

                if(cnt == 4) {
                    randValue = 1;
                } else {
                    randValue = 0;
                }

                cnt = 0;
            }

            cnt++;
        }

        System.out.println("");
    }

    public ArrayList<String> getAteamArrayList() {
        return AteamArrayList;
    }

    public ArrayList<String> getBteamArrayList() {
        return BteamArrayList;
    }
}
