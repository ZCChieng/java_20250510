package Exercise;

public class _08FunctionalProgramming {
    public static void main(String[] args) {
        checkEvenNumber(10);
        System.out.println("===================================");

        checkOddOrEven(7);
        System.out.println("===================================");

        checkTriangleType(3, 4, 5);
        System.out.println("===================================");

        checkGrade(85);
        System.out.println("===================================");

        checkLeapYear(2024);
    }

    // 判斷是否為偶數
    public static void checkEvenNumber(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " 是偶數");
        }
    }

    // 判斷是否為奇數還是偶數
    public static void checkOddOrEven(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " 是偶數");
        } else {
            System.out.println(number + " 是奇數");
        }
    }

    // 判斷三角形類型
    public static void checkTriangleType(int a, int b, int c) {
        if (a == b && b == c) {
            System.out.println("等邊三角形");
        } else if (a == b || b == c || a == c) {
            System.out.println("等腰三角形");
        } else {
            System.out.println("不等邊三角形");
        }
    }

    // 判斷成績等級
    public static void checkGrade(int score) {
        if (score >= 90) {
            System.out.println("等級: A");
        } else if (score >= 80) {
            System.out.println("等級: B");
        } else if (score >= 70) {
            System.out.println("等級: C");
        } else if (score >= 60) {
            System.out.println("等級: D");
        } else {
            System.out.println("等級: E");
        }
    }

    // 判斷是否為閏年
    public static void checkLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " 是閏年");
        } else {
            System.out.println(year + " 不是閏年");
        }
    }
}
