import java.util.Random;

public class HomeWork3 {

    public static Random random = new Random();

    public static void main(String[] args) {

        System.out.println("<--First exercise-->");
        int[] array1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        printArrayWithTitle("Array before reverse", array1, false);
        reverseArray(array1);
        printArrayWithTitle("Array after reverse", array1, true);

        System.out.println("<--Second exercise-->");
        int[] array2 = new int[100];
        fillArray(array2);
        printArrayWithTitle("Array with integer from 1 to 100", array2, true);

        System.out.println("<--Third exercise-->");
        int[] array3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        printArrayWithTitle("Array before change", array3, false);
        changeArray(array3);
        printArrayWithTitle("Array after change", array3, true);

        System.out.println("<--Forth exercise-->");
        int[][] array4 = new int[5][5];
        fillDiagonals(array4);
        printArrayWithTitle("Matrix with diagonals equals 1", array4, true);

        System.out.println("<--Fifth exercise-->");
        printArrayWithTitle("Array:", setArrayInitialValue(8, 6), true);

        System.out.println("<--Sixth exercise-->");
        int[] array6 = new int[10];
        setArrayRandomInteger(array6, -20, 20);
        printArrayWithTitle("Array:", array6, false);
        System.out.println("Minimum = " + getMinElement(array6));
        System.out.println("Maximum = " + getMaxElement(array6) + "\n");

        System.out.println("<--Seventh exercise-->");
        int[] array7 = {4, 5, 3, 1, 1, 2, 2};
        printArrayWithTitle("Array:", array7, false);
        System.out.println("CheckBalance: " + checkBalance(array7));
        int[] array8 = {2, 3, 1, 3, 2, 3};
        printArrayWithTitle("Array:", array8, false);
        System.out.println("CheckBalance: " + checkBalance(array8));
    }

    public static void printArrayWithTitle(String title, int[][] input, boolean needNewEmptyLine) {
        System.out.println(title);
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                System.out.print(input[i][j] + "\t");
            }
            System.out.println();
        }
        if (needNewEmptyLine) {
            System.out.println();
        }
    }

    public static void printArrayWithTitle(String title, int[] input, boolean needNewEmptyLine) {
        System.out.println(title);
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + "\t");
        }
        System.out.println();
        if (needNewEmptyLine) {
            System.out.println();
        }
    }

    public static void reverseArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                array[i] = 0;
            } else {
                array[i] = 1;
            }
        }
    }

    public static void fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
    }

    public static void changeArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }
    }

    public static void fillDiagonals(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            array[i][i] = 1;
            array[i][array.length - 1 - i] = 1;
        }
    }

    public static int[] setArrayInitialValue(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = initialValue;
        }
        return array;
    }

    public static int myRandomInteger(int minBound, int maxBound) {
        return random.nextInt(maxBound - minBound + 1) + minBound;
    }

    public static void setArrayRandomInteger(int[] array, int min, int max) {
        for (int i = 0; i < array.length; i++) {
            array[i] = myRandomInteger(min, max);
        }
    }

    public static int getMinElement(int[] array) {
        int minElement = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minElement) {
                minElement = array[i];
            }
        }
        return minElement;
    }

    public static int getMaxElement(int[] array) {
        int maxElement = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxElement) {
                maxElement = array[i];
            }
        }
        return maxElement;
    }

    public static boolean checkBalance(int[] array) {
        int sum = 0;
        int sumFringe = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        if (sum % 2 != 0) {
            return false;
        } else {
            for (int i = 0; i < array.length; i++) {
                sumFringe += array[i];
                if (sumFringe == sum / 2) {
                    return true;
                }
            }
            return false;
        }
    }
}
