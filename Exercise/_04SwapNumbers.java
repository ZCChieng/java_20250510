package Exercise;

import java.util.Scanner;

public class _04SwapNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入第一個數字: ");
        int a = scanner.nextInt();
        System.out.print("請輸入第二個數字: ");
        int b = scanner.nextInt();

        System.out.println("交換前：");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // 使用第三個變數進行交換
        int temp = a;
        a = b;
        b = temp;

        System.out.println("交換後：");
        System.out.println("a = " + a);
        System.out.println("b = " + b);


        // 不使用第三個變數進行交換
        System.out.print("請輸入第一個數字: ");
        a = scanner.nextInt();
        System.out.print("請輸入第二個數字: ");
        b = scanner.nextInt();

        System.out.println("交換前：");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        a = a + b; // a 現在是兩個數字的和
        b = a - b; // b 現在是原來的 a
        a = a - b; // a 現在是原來的 b
        System.out.println("交換後：");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // 使用xor進行交換
        System.out.print("請輸入第一個數字: ");
        a = scanner.nextInt();
        System.out.print("請輸入第二個數字: ");
        b = scanner.nextInt();

        System.out.println("交換前：");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        a = a ^ b; // a 現在是兩個數字的互斥或
        b = a ^ b; // b 現在是原來的 a
        a = a ^ b; // a 現在是原來的 b  
        // 注意：這種方法在某些情況下可能會導致錯誤，特別是當 a 和 b 是相同的時候
        // 因為 a = 0，b = 0，這樣會導致無法交換

        System.out.println("交換後：");
        System.out.println("a = " + a);
        System.out.println("b = " + b);


        scanner.close();
    }
}
