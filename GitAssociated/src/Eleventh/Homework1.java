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
    }
}
