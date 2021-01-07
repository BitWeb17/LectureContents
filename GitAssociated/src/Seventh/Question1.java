package Seventh;

public class Question1 {
    public static void main(String[] args) {
        final int FIXVALUE = 3;

        double[] testArr = new double[FIXVALUE];
        float[] testArr2 = new float[FIXVALUE];

        for(int i = 0; i < FIXVALUE; i++) {
            testArr[i] = Math.random();
        }

        for(int i = 0; i < FIXVALUE; i++) {
            testArr2[i] = (float)(Math.random());
        }
    }
}
