import java.text.MessageFormat;
import java.util.stream.IntStream;  //引入物件參考

public class _08IfElse {
    public static void main(String[] args) {

        // 條件判斷敘述句(if-else)
        // EXAMPLE 1 : 判斷是否為偶數

        int number = 10;
        if (number % 2 == 0) {
            System.out.println(number + " 是偶數。");
        } else {
            System.out.println(number + " 是奇數。");
        }

        // EXAMPLE2 : 判斷3角形的類型(if - else if - else)
        int a = 30;
        int b = 60;
        int c = 90;

        if (a + b + c == 180) {
            if (c == 60 && b == 60 && a == 60) {
                System.out.println("這是一個正三角形。");
            } else if (a == 90 || b == 90 || c == 90) {
                // System.out.println("這是一個" + f_checkequals(a, b, c) + "直角三角形。");
                System.out.println(MessageFormat.format("這是一個{0}直角三角形。", f_checkequals(a, b, c)));
            } else if (a > 90 || b > 90 || c > 90) {
                System.out.println("這是一個" + f_checkequals(a, b, c) + "鈍角三角形。");
            } else {
                System.out.println("這是一個" + f_checkequals(a, b, c) + "銳角三角形。");
            }
        } else {
            System.out.println("abc內角和不為180， 該形狀不是一個三角形。");
        }

        // EXAMPLE3 : 閏年判斷
        int year = 1704;

        // 閏年條件 1. 被4整除 2. 不被100整除 3.被400整除
        // 從最嚴苛開始判斷
        if (year % 400 == 0) {
            System.out.println(year + "年是閏年。");
        } else {
            if (year % 100 == 0) {
                System.out.println(year + "年是平年。");
            } else {
                if (year % 4 == 0) {
                    System.out.println(year + "年是閏年。");
                } else {
                    System.out.println(year + "年是平年。");
                }
            }
        }
    }

    // int... 和 C# 的 params int[] 意思一樣。
    public static String f_checkequals(int... items) {
        // IntStream.distinct() 去除重複
        long distinctCount = IntStream.of(items)
                .distinct()
                .count();

        if (distinctCount < items.length) {
            return "等腰";
        } else {
            return "不等腰";
        }
    }
}
