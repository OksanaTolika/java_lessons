import java.util.Random;

public class HomeWork3 {

    public static Random random = new Random();

    public static void main(String[] args) {

        System.out.println("<--First exercise-->");
        int[] array1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("Array before reverse");
        printOneArray(array1);
        System.out.println("Array after reverse");
        reverseOneArray(array1);
        printOneArray(array1);
        System.out.println();

        System.out.println("<--Second exercise-->");
        int[] array2 = new int[100];
        setOneArray(array2);
        printOneArrayInLine(array2);
        System.out.println();

        System.out.println("<--Third exercise-->");
        int[] array3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Array before change");
        printOneArrayInLine(array3);
        changeOneArray(array3);
        System.out.println("Array after change");
        printOneArrayInLine(array3);
        System.out.println();

        System.out.println("<--Forth exercise-->");
        int[][] array4 = new int[5][5];
        setTwoArray1(array4);
        printTwoArray(array4);
        System.out.println();

        System.out.println("<--Fifth exercise-->");
        printOneArrayInLine(setOneArrayInitialValue(8, 6));
        System.out.println();

        System.out.println("<--Sixth exercise-->");
        int[] array6 = new int[10];
        setOneArrayRandomInteger(array6, -20, 20);
        printOneArrayInLine(array6);
        printMinMaxElements(array6);
        System.out.println();

        System.out.println("<--Seventh exercise-->");
        int[] array7 = {4, 5, 3, 1, 1, 2, 2};
        printOneArrayInLine(array7);
        System.out.println(checkBalance(array7));
        System.out.println();
        int[] array8 = {2, 3, 1, 3, 2, 3};
        printOneArrayInLine(array8);
        System.out.println(checkBalance(array8));
        System.out.println();
    }

    public static void printOneArray(int[] input) {
        for (int i = 0; i < input.length; i++) {
            System.out.println("Index #" + i + " = " + input[i]);
        }
    }

    public static void printOneArrayInLine(int[] input) {
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + "\t");
        }
        System.out.println();
    }

    public static void printTwoArray(int[][] input) {
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                System.out.print(input[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void reverseOneArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                array[i] = 0;
            } else {
                array[i] = 1;
            }
        }
    }

    public static void setOneArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
    }

    public static void changeOneArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }
    }

    public static void setTwoArray(int[][] array) { //не использую этот метод
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j || i + j == array.length - 1) {
                    array[i][j] = 1;
                } else {
                    array[i][j] = 0;
                }
            }
        }
    }

    public static void setTwoArray1(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            array[i][i] = 1;
            array[i][array.length - 1 - i] = 1;
        }
    }

    public static int[] setOneArrayInitialValue(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = initialValue;
        }
        return array;
    }

    public static int myRandomInteger(int minBound, int maxBound) {
        return random.nextInt(maxBound - minBound + 1) + minBound;
    }

    public static void setOneArrayRandomInteger(int[] array, int min, int max) {
        for (int i = 0; i < array.length; i++) {
            array[i] = myRandomInteger(min, max);
        }
    }

    public static void printMinMaxElements(int[] array) {
        int min = array[0];
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Minimum = " + min);
        System.out.println("Maximum = " + max);
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
