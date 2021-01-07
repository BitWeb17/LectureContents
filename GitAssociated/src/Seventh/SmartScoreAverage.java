package Seventh;

class ScoreCalculator {
    // 개수가 미정이 배열 변수
    int[] scores;
    float avg;

    public void setRandomScores() {
        int loop = (int)(Math.random() * 11) + 10;

        scores = new int[loop];

        for(int i = 0; i < loop; i++) {
            scores[i] = (int)(Math.random() * 101);
        }
    }

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
