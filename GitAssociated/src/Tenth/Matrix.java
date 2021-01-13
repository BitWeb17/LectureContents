package Tenth;

public class Matrix {
    private int row, col;
    private int[][] mat;

    public Matrix(int row, int col) {
        this.row = row;
        this.col = col;

        mat = new int[row][col];
    }

    /*
        Matrix wrong = new Matrix(arr1, 4);
        Matrix A = new Matrix(arr1, 3, 3);
        Matrix B = new Matrix(arr2, 3);
     */

    public Matrix(int[][] arr, int row) {
        if(checkAvailable(arr, row)) {
            mat = new int[row][col];

            // 4 by 3      ===>     3 by 4
            // 1 2 3 4              1 2 3
            // 2 4 6 8              4 2 4
            // 3 6 9 12             6 8 3
            //                      6 9 12
            int totalLen = row * col;
            int[] tmp = new int[totalLen];

            //System.out.println("arr.length = " + arr.length);
            //System.out.println("arr[0].length = " + arr[0].length);
            for(int i = 0; i < arr.length; i++) {
                for(int j = 0; j < arr[0].length; j++) {
                    tmp[i * arr[0].length + j] = arr[i][j];
                    //System.out.printf("tmp[%d] = %d\n",
                    //        i * arr[0].length + j,
                    //        tmp[i * arr[0].length + j]);
                }
            }

            for(int i = 0; i < row; i++) {
                for(int j = 0; j < col; j++) {
                    mat[i][j] = tmp[i * col + j];
                }
            }
        }
    }

    public Matrix(int[] arr, int row) {
        if(checkAvailable(arr, row)) {
            mat = new int[row][col];

            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    // 0 ~ 8:
                    // i                     = 0 ~ 2     x
                    // j                     = 0 ~ 2     x
                    // i + j                 = 0 ~ 4     x
                    // (i + 1)               = 1 ~ 3     x
                    // (i + 1) * j           = 0 ~ 6     x
                    // (i + 1) * (j + 1)     = 1 ~ 9     x
                    // (i + 1) * (j + 1) - 1 = 0 ~ 8     x
                    // (i + 1) * 3 + j       = 3 ~ 9 + j x
                    // i * 3 + j             = 0 ~ 8     o
                    mat[i][j] = arr[i * col + j];
                }
            }
        }
    }

    public Matrix(int[] arr, int row, int col) {
        if(checkAvailable(arr, row, col)) {
            System.out.println("A 처리 테스트");
            // 실제로 이 매서드 내의 모든 코드는
            // 단일 배열에서 넘어온 값들을 행렬로 변환한다는 취지를 가짐
            // 그러므로 동일하게 중복되는 코드들이 발생할 것이고
            // 별도의 매서드로 분리하여 관리할 수 있음
            mat = new int[row][col];

            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    mat[i][j] = arr[i * col + j];
                }
            }
        }
    }

    private boolean checkDivideElement(int len, int row) {
        if(len % row == 0) {
            this.row = row;
            this.col = len / row;
        } else {
            System.out.printf("행렬로 변환할 수 없습니다.\n");
            System.out.printf("올바른 차원을 입력하세요.\n");
            System.out.printf("혹은 적절한 숫자(행)를 입력하세요\n");
            return false;
        }

        return true;
    }

    private boolean checkAvailable(int[] arr, int row, int col) {
        int len = arr.length;

        boolean res = (len == row * col ? true : false);

        if(res) {
            this.row = row;
            this.col = col;
        }

        return res;
    }

    private boolean checkAvailable(int[][] arr, int num) {
        int row = arr.length;
        int col = arr[0].length;
        int len = row * col;
        // System.out.printf("[][] row = %d, col = %d\n", row, col);

        /*
        if(len % row == 0) {
            this.row = row;
            this.col = len / row;
        } else {
            System.out.printf("행렬로 변환할 수 없습니다.\n");
            System.out.printf("올바른 차원을 입력하세요.\n");
            System.out.printf("혹은 적절한 숫자(행)를 입력하세요\n");
            return false;
        }
         */

        return checkDivideElement(len, num);
    }

    private boolean checkAvailable(int[] arr, int row) {
        int len = arr.length;

        /*
        if(len % row == 0) {
            this.row = row;
            this.col = len / row;
        } else {
            System.out.printf("행렬로 변환할 수 없습니다.\n");
            System.out.printf("올바른 차원을 입력하세요.\n");
            System.out.printf("혹은 적절한 숫자(행)를 입력하세요\n");
            return false;
        }
         */

        return checkDivideElement(len, row);
    }

    public void allocRandomMatrix() {
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                mat[i][j] = (int)(Math.random() * 10);
            }
        }
    }

    public void printMatrix() {
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                System.out.printf("%3d", mat[i][j]);
            }
            System.out.println("");
        }
    }
}
