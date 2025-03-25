public class Main {

    public static final int M = 4;
    public static final int N = 4;

    public static void printInteger(int[][] matrix) {
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static int[][] parseInteger(Matrix matrix) {
        if ((matrix.m != 4) || (matrix.n != 4)) {
            throw new MyArraySizeException("Массив должен быть 4 на 4");
        }
        int[][] matrix1 = new int[matrix.m][matrix.n];
        for (int i = 0; i < matrix.m; i++) {
            for (int j = 0; j < matrix.n; j++) {
                try {
                    matrix1[i][j] = Integer.parseInt(matrix.matrix[i][j]);
                } catch (NumberFormatException numberFormatException) {
                    throw new MyArrayDataException("Ошибка в строке " + (i + 1) + ", столбце " + (j + 1));
                }
            }
        }
        return matrix1;
    }

    public static void main(String[] args) {

        Matrix matrix = new Matrix(M, N);
        matrix.print();
        try {
            printInteger(parseInteger(matrix));

        } catch (MyArraySizeException myArraySizeException) {
            System.out.println(myArraySizeException.getMessage());
        } catch (MyArrayDataException myArrayDataException) {
            System.out.println(myArrayDataException.getMessage());
        }
    }
}