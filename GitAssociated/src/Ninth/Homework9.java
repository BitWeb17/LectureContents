package Ninth;

public class Homework9 {
    // static 키워드가 붙으면 메모리에 상주하게 된다.
    // 원래는 자바의 클래스 로더가 클래스를 찾아서 메모리에 로드(적재)해야한다.
    // 그러나 static 키워드가 붙어있으면 JVM이 동작할때
    // static 영역의 메모리가 같이 잡혀서 올라가므로
    // 별도의 new 과정이 필요없어진다.
    public static void insertSort(float[] arr, int[] cn) {
        int i, j, classKey, len = arr.length;
        float arrKey;

        for(i = 1; i < len; i++) {
            arrKey = arr[i];
            classKey = cn[i];

            for(j = i - 1; (j != -1) && (arr[j] > arrKey); j--) {
                arr[j + 1] = arr[j];
                cn[j + 1] = cn[j];
            }

            arr[j + 1] = arrKey;
            cn[j + 1] = classKey;
        }
    }

    public static void printMax(ScoreCalculator[] arr) {
        System.out.printf("\n뭐야 ? 나 호출된거임 ?\n");

        int len = arr.length;

        float[] mean = new float[len];
        float[] stdDev = new float[len];
        int[] classArr = new int[len];


        for(int i = 0; i < len; i++) {
            classArr[i] = i + 1;
            mean[i] = arr[i].getMean();
            stdDev[i] = arr[i].getStdDeviation();
        }

        insertSort(mean, classArr);
        System.out.printf(
                "\n%d 반이 평균 최고점(%f)을 받았습니다.\n\n",
                classArr[len - 1], mean[len - 1]);

        for(int i = 0; i < len; i++) {
            classArr[i] = i + 1;
        }

        insertSort(stdDev, classArr);
        System.out.printf(
                "\n%d 반이 표준편차 최저점(%f)을 받았습니다.\n\n",
                classArr[0], stdDev[0]);
    }

    public static void main(String[] args) {
        final int FIXSIZE = 3;

        // 클래스 배열을 작성하는 방법
        // 1. 우선 배열을 선언하는것과 동일하게 접근한다.
        //    ex) int[] arr = new int[공간개수]
        //    클래스 배열도 위의 방식과 똑같다.
        //    ScoreCalculator[] scArr = new ScoreCalculator[FIXSIZE]
        //    단순히 공간만 만들었다 - 클래스가 사용할 수 있는 상태는 아니다.
        ScoreCalculator[] scArr = new ScoreCalculator[FIXSIZE];

        for(int i = 0; i < FIXSIZE; i++) {
            // 실제 생성자를 호출해서 배열 인덱스에 값을 할당하는 순간이 중요
            // 이렇게 할당하고나면 기존의 클래스 문제들에서 활용했듯이
            // 내부에 있는 매서드들을 활용할 수 있게 된다.
            scArr[i] = new ScoreCalculator();
            System.out.printf("\n%d 반\n", i + 1);
            scArr[i].printScores();
            scArr[i].calcMean();
            scArr[i].calcVariance();
            scArr[i].calcStdDeviation();
            System.out.printf("\n평균 = %f, 분산 = %f, 표준편차 = %f\n",
                    scArr[i].getMean(),
                    scArr[i].getVariance(),
                    scArr[i].getStdDeviation());
        }

        // 이건 뭐지 ?
        // 얘는 new 도 안했고
        // 어디서 갑자기 튀어나왔지 ?
        printMax(scArr);

        // 가만 생각해보자!
        // Math.random() 이건 ??????
        // Q: static 으로해서 갖다 쓰는 것들은 어떤 용도인가 ?
        // A: 보통 유틸리티용 라이브러리로 사용한다.
        //    어떤 특정한것에 국한되지 않고
        //    어디서든 사용할 수 있게 만들겠다면
        //    static 키워드를 붙이고 만들어라!
    }
}
