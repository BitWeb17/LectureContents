package Eighth;

class ScoreCalculator {
    int studentNum;
    int[] score;
    float mean;
    float variance;
    float stdDeviation;

    // 생성자(Constructor)
    // 사실은 new 를 할 때 이 코드가 눈에 보이지 않게 내부적으로 동작한다.
    // 그러나 이와 같이 명시를 해주면 사용자가 생성자를 호출할 수 있게 된다.

    // 생성자를 작성하는 방법
    // 1) 클래스 내부에서 매서드를 작성하는 방법과 아래의 사항을 제외하고 동일하다.
    // 2) return 타입이 없다.
    // 3) 그리고 매서드 이름이 클래스 이름과 같아야 한다.
    public ScoreCalculator(int studentNum) {
        System.out.println("안녕 ~ 나는 생성자야!");
        this.studentNum = studentNum;

        score = new int[studentNum];

        for(int i = 0; i < studentNum; i++) {
            score[i] = (int)(Math.random() * 51) + 50;
        }
    }

    public void calcMean() {
        int sum = 0;

        for(int i = 0; i < studentNum; i++) {
            sum += score[i];
        }

        mean = sum / (float)studentNum;
    }

    public float getMean() {
        return mean;
    }

    public void calcVariance() {
        float sum = 0;

        // sigma (샘플 - 평균)^2 / 전체숫자 = 분산
        for(int i = 0; i < studentNum; i++) {
            // 제곱
            sum += Math.pow(score[i] - mean, 2);
        }

        variance = sum / (float)studentNum;
    }

    public float getVariance() {
        return variance;
    }

    public void calcStdDeviation() {
        // 루트
        stdDeviation = (float)Math.sqrt(variance);
    }

    public float getStdDeviation() {
        return stdDeviation;
    }

    public void printScores() {
        int cnt = 1;

        for(int i = 0; i < studentNum; i++) {
            System.out.printf("%4d", score[i]);

            if(cnt % 10 == 0) {
                System.out.println("");
            }

            cnt++;
        }
    }
}

public class Exercise3 {
    public static void main(String[] args) {
        // 3) 학급에 학생이 20 명 있다.
        //    각 학생의 성적을 랜덤으로 기록해준다(입력으로 받으면 힘드니까)
        //    전체 학생들의 평균을 구하고 표준편차와 분산을 구해보자
        //    (분산과 표준편차 공식을 잘 모른다면 패스해도 OK)
        ScoreCalculator sc = new ScoreCalculator(20);

        System.out.println("학생들의 점수를 출력합니다.");
        sc.printScores();
        sc.calcMean();
        System.out.println("이 반의 평균은 = " + sc.getMean());

        sc.calcVariance();
        System.out.println("이 반의 분산은 = " + sc.getVariance());

        sc.calcStdDeviation();
        System.out.println(
                "이 반의 표준편차는 = " + sc.getStdDeviation());
    }
}
