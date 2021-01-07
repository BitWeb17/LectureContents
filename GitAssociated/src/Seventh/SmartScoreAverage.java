package Seventh;

class ScoreCalculator {
    // 개수가 미정이 배열 변수
    int[] scores;
    float avg;

    public void setRandomScores() {
        // (int)(Math.random() * 11): 0 ~ 10 + 10 -> 10 ~ 20
        // 더하는 숫자 10은 최소 학급 인원
        // 학급 인원의 유동 숫자는 0 ~ 10
        int loop = (int)(Math.random() * 11) + 10;

        scores = new int[loop];

        for(int i = 0; i < loop; i++) {
            scores[i] = (int)(Math.random() * 101);
        }
    }

    // Alt + Insert 이후
    // 생성자(Constructor), Getter & Setter 를 선택해서
    // 필요한 정보에 대한 자동완성 기능을 활용할 수 있다.

    // 매서드의 구성
    // public 은 무조건 붙는다고 가정
    // 좀 더 디테일하게 보자면 public 자리는 접근제한자
    // public 리턴타입 매서드이름(입력인자) {
    //     매서드의 본문(내용: 알고리즘)
    // }
    public float calcAverage() {
        int sum = 0;

        for(int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }

        avg = sum / scores.length;

        return avg;
    }
}

public class SmartScoreAverage {
    public static void main(String[] args) {
        ScoreCalculator sc = new ScoreCalculator();

        sc.setRandomScores();
        System.out.println("3반 평균을 구합니다.");
        System.out.println("평균 = " + sc.calcAverage());

        ScoreCalculator sc2 = new ScoreCalculator();
        sc2.setRandomScores();
        System.out.println("7반 평균을 구합니다.");
        System.out.println("평균 = " + sc2.calcAverage());
    }
}
