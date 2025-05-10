import java.math.BigInteger;

public class _12BigInteger {
    public static void main(String[] args) {
        // 定義兩個 BigInteger 數字
        BigInteger num1 = new BigInteger("12345678901234567890");
        BigInteger num2 = new BigInteger("98765432109876543210");

        // 加法
        BigInteger sum = num1.add(num2);
        System.out.println("加法結果: " + sum);

        // 減法
        BigInteger difference = num1.subtract(num2);
        System.out.println("減法結果: " + difference);

        // 乘法
        BigInteger product = num1.multiply(num2);
        System.out.println("乘法結果: " + product);

        // 除法
        BigInteger quotient = num2.divide(num1);
        System.out.println("除法結果: " + quotient);

        // 餘數
        BigInteger remainder = num2.remainder(num1);
        System.out.println("餘數結果: " + remainder);

        // 次方運算
        BigInteger power = num1.pow(2);
        System.out.println("次方結果 (num1^2): " + power);

        // 絕對值
        BigInteger absoluteValue = num1.abs();
        System.out.println("絕對值結果: " + absoluteValue);

        // 最大值
        BigInteger max = num1.max(num2);
        System.out.println("最大值: " + max);

        // 最小值
        BigInteger min = num1.min(num2);
        System.out.println("最小值: " + min);

        // 比較運算
        int comparison = num1.compareTo(num2);
        if (comparison < 0) {
            System.out.println("num1 小於 num2");
        } else if (comparison > 0) {
            System.out.println("num1 大於 num2");
        } else {
            System.out.println("num1 等於 num2");
        }

        // 邏輯運算 (BigInteger 沒有直接的邏輯運算，但可以透過比較來實現)
        boolean isNum1Positive = num1.signum() > 0;
        boolean isNum2Positive = num2.signum() > 0;

        if (isNum1Positive && isNum2Positive) {
            System.out.println("num1 和 num2 都是正數");
        } else if (isNum1Positive || isNum2Positive) {
            System.out.println("num1 或 num2 是正數");
        } else {
            System.out.println("num1 和 num2 都不是正數");
        }
    }
}
