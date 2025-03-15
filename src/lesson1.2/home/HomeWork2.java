public class HomeWork2 {
    public static void main(String[] args) {

        System.out.println("<--Sum of two number-->");
        System.out.println(boolSumOfTwoNumber(10, 5));
        System.out.println();
        System.out.println("<--Positive or negative number-->");
        positiveOrNegativeNumber(-1);
        System.out.println();
        System.out.println("<--Is negative number-->");
        System.out.println(isNegativeNumber(10));
        System.out.println();
        System.out.println("<--Print word several times-->");
        printWord(4, "Hello world");
        System.out.println();
        System.out.println("<--Calculate leap year-->");
        System.out.println(leapYear(2024));
    }

    public static boolean boolSumOfTwoNumber(int a, int b) {
        int sum = a + b;
        return sum > 10 && sum <= 20;
    }

    public static void positiveOrNegativeNumber(int a) {
        if (a < 0) {
            System.out.println("Number is negative");
        } else {
            System.out.println("Number is positive");
        }
    }

    public static boolean isNegativeNumber(int a) {
        return a < 0;
    }

    public static void printWord(int a, String s) {
        for (int i = 0; i < a; i++) {
            System.out.println(s);
        }
    }

    public static boolean leapYear(int year) {
        return (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
    }
}
