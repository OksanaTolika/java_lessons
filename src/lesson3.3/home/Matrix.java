import java.util.Random;

public class Matrix {

    public static Random random = new Random();

    public static final int minBound = 48;
    public static final int maxBound = 58;

    public int m;
    public int n;
    public String[][] matrix;

    public Matrix(int M, int N) {
        m = M;
        n = N;
        matrix = new String[M][N];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = String.valueOf((char) myRandomInteger(minBound, maxBound));
            }
        }
    }

    public void print() {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static int myRandomInteger(int minBound, int maxBound) {
        return random.nextInt(maxBound - minBound + 1) + minBound;
    }
}

