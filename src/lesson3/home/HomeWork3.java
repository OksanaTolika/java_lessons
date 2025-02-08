import java.util.Random;

public class HomeWork3 {

    public static Random random = new Random();

    public static void main(String[] args) {

        System.out.println("<--First exercise-->");
        int[] array1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("Array before reverse");
        printArrayInLine(array1);
        System.out.println("Array after reverse");
        reverseArray(array1);
        printArrayInLine(array1);

        System.out.println("<--Second exercise-->");
        int[] array2 = new int[100];
        fillArray(array2);
        printArrayInLine(array2);

        System.out.println("<--Third exercise-->");
        int[] array3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Array before change");
        printArrayInLine(array3);
        changeArray(array3);
        System.out.println("Array after change");
        printArrayInLine(array3);

        System.out.println("<--Forth exercise-->");
        int[][] array4 = new int[5][5];
        setArray(array4);
        printArray(array4);

        System.out.println("<--Fifth exercise-->");
        printArrayInLine(setArrayInitialValue(8, 6));

        System.out.println("<--Sixth exercise-->");
        int[] array6 = new int[10];
        setArrayRandomInteger(array6, -20, 20);
        printArrayInLine(array6);
        int[] minMaxArray6 = getMinMaxElements(array6);
        System.out.println("Minimum = " + minMaxArray6[0]);
        System.out.println("Maximum = " + minMaxArray6[1]);

        System.out.println("<--Seventh exercise-->");
        int[] array7 = {4, 5, 3, 1, 1, 2, 2};
        printArrayInLine(array7);
        System.out.println(checkBalance(array7));
        System.out.println();
        int[] array8 = {2, 3, 1, 3, 2, 3};
        printArrayInLine(array8);
        System.out.println(checkBalance(array8));
    }

    public static void printArrayInLine(int[] input) {
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + "\t");
        }
        System.out.println();
    }

    public static void printArray(int[][] input) {
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                System.out.print(input[i][j] + "\t");
            }
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

    public static void setArray(int[][] array) {
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

    public static int[] getMinMaxElements(int[] array) {
        int[] minMaxElements = new int[2];
        minMaxElements[0] = array[0];
        minMaxElements[1] = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > minMaxElements[1]) {
                minMaxElements[1] = array[i];
            }
            if (array[i] < minMaxElements[0]) {
                minMaxElements[0] = array[i];
            }
        }
        return minMaxElements;
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
