package Seventh;

class TriangleBonus {
    float[] v1;
    float[] v2;

    public void setV1(float[] v1) {
        this.v1 = v1;
    }

    public void setV2(float[] v2) {
        this.v2 = v2;
    }

    public float calcArea() {
        // v11 v12 v13
        // v21 v22 v23
        return 0.5f * (float)Math.sqrt(
                Math.pow(v1[0] * v2[1] - v1[1] * v2[0], 2) +
                Math.pow(v1[2] * v2[1] - v1[1] * v2[2], 2) +
                Math.pow(v1[2] * v2[0] - v1[0] * v2[2], 2)
        );
    }
}

public class Quiz3_3 {
    public static void main(String[] args) {
        TriangleBonus tb = new TriangleBonus();

        float[] v1 = {3.0f, 0.0f, 0.0f};
        float[] v2 = {0.0f, 4.0f, 0.0f};

        tb.setV1(v1);
        tb.setV2(v2);

        System.out.println("면적은 = " + tb.calcArea());
    }
}
