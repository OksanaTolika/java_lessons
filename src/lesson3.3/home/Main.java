import java.util.Random;

public class Main {

    public static Random random = new Random();

    public static final int minBound = 48;
    public static final int maxBound = 58;

    public static void main(String[] args) {

        String[][] matrix = createRandomMatrix(4, 4);
        print(matrix);

        try {
            printInteger(parseInteger(matrix));
        } catch (MyArraySizeException myArraySizeException) {
            System.out.println(myArraySizeException.getMessage());
        } catch (MyArrayDataException myArrayDataException) {
            System.out.println(myArrayDataException.getMessage());
        }
    }

    public static String[][] createRandomMatrix(int n, int m) {
        String[][] matrix = new String[n][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = String.valueOf((char) myRandomInteger(minBound, maxBound));
            }
        }
        return matrix;
    }

    public static void printInteger(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void print(String[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static int[][] parseInteger(String[][] matrix) {
        if (matrix.length != 4) {
            throw new MyArraySizeException("Массив должен быть 4 на 4");
        }
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i].length != 4) {
                throw new MyArraySizeException("Массив должен быть 4 на 4");
            }

        }
        int[][] matrix1 = new int[matrix.length][];
        for (int i = 0; i < matrix.length; i++) {
            matrix1[i] = new int[matrix[i].length];
            for (int j = 0; j < matrix[i].length; j++) {
                try {
                    matrix1[i][j] = Integer.parseInt(matrix[i][j]);
                } catch (NumberFormatException numberFormatException) {
                    throw new MyArrayDataException("Ошибка в строке " + (i + 1) + ", столбце " + (j + 1));
                }
            }
        }
        return matrix1;
    }

    public static int myRandomInteger(int minBound, int maxBound) {
        return random.nextInt(maxBound - minBound + 1) + minBound;
    }
}