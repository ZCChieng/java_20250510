//做一個簡單的計算器，能夠進行加、減、乘、除運算。
//使用者輸入兩個數字和一個運算符，然後計算並顯示結果。

package Exercise;
import java.util.Scanner;

public class _01SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("輸入第一個數字: ");
        double num1 = scanner.nextDouble();

        System.out.print("輸入運算符 (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        System.out.print("輸入第二個數字: ");
        double num2 = scanner.nextDouble();

        double result;
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("錯誤: 除數不能為零");
                    return;
                }
                break;
            default:
                System.out.println("無效的運算符");
                return;
        }

        System.out.println("結果是: " + result);

       
    }
}