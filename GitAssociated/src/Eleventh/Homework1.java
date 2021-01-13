package Eleventh;

import Tenth.Matrix;

public class Homework1 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[][] arr2 = {
                {1, 2, 3},
                {2, 4, 6},
                {3, 6, 9}
        };
        int[][] arr3 = {
                {1, 2, 3, 4},
                {2, 4, 6, 8},
                {3, 6, 9, 12}
        };

        Matrix wrong = new Matrix(arr1, 4);
        wrong.allocRandomMatrix();
        wrong.printMatrix();

        System.out.println("Matrix A:");
        Matrix A = new Matrix(arr1, 3, 3);
        A.printMatrix();

        System.out.println("Matrix B:");
        Matrix B = new Matrix(arr2, 3);
        B.printMatrix();

        System.out.println("Matrix C:");
        Matrix C = new Matrix(arr3, 4);
        C.printMatrix();

        // Q: 지금 당장 이런식으로 짤 수 있어야 하나요 ?
        // A: 당장 이렇게 못짜도 됩니다.
        //    어떻게든 풀 수만 있으면 됩니다.
        //    신입에게 이 정도 수준을 요구하지는 않아요.
        //    사실 프로젝트 아웃풋 어느정도 나오면 다들 취업은 어느정도 됩니다.
        //    문제가 취업을 하는게 아니라 취업 이후입니다.
        //    끝도 없는 야근에 치어죽을 가능성이 높음(보통 3년 못채움)
        //    야근을 최소화 할려면 유지보수가 쉬운 코드를 작성해야합니다.
        //    그래서 코드를 함축시키고 묶어서 관리할 수 있는 능력이 필요합니다.
        //    못짠 코드를 보면 이런 실력이 생기지 않아요.
        //    잘 만든 코드를 봐야 당장은 못 짜더라도
        //    아 ... 저런식으로 짜야 하는구나란 것을 알 수 있습니다.
        System.out.println("R = A + B");
        Matrix R = new Matrix(3, 3);
        R.addMatrix(A, B);
        R.printMatrix();

        System.out.println("A = A + B");
        A.addMatrix(B);
        A.printMatrix();

        System.out.println("R = A - B");
        R.subMatrix(A, B);
        R.printMatrix();

        System.out.println("A = A - B");
        A.subMatrix(B);
        A.printMatrix();

        System.out.println("R = A * B");
        R.mulMatrix(A, B);
        R.printMatrix();
    }
}
