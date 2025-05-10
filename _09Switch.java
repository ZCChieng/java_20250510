import java.util.Scanner;

public class _09Switch {
    public static void main(String[] args) {
        // 建立輸入物件
        Scanner scanner = new Scanner(System.in); // 鑄造物件, System.in:讀取鍵盤輸入的值

        // 範例 1: 判斷星期幾
        System.out.print("請輸入0-6的數字:");
        int day = scanner.nextInt(); // 0-6的整數

        switch (day) {
            case 0:
                System.out.println("今天星期天");
                break;
            case 1:
                System.out.println("今天星期一");
                break;
            case 2:
                System.out.println("今天星期二");
                break;
            case 3:
                System.out.println("今天星期三");
                break;
            case 4:
                System.out.println("今天星期四");
                break;
            case 5:
                System.out.println("今天星期五");
                break;
            case 6:
                System.out.println("今天星期六");
                break;
            default:
                System.out.println("未知的日期");
        }

        System.out.println("===================================");
        // 範例 2: 判斷成績等級
        // 假設成績範圍: 90-100: A, 80-89: B, 70-79: C, 60-69: D, 0-59: E

        // 90
        // 91
        // 92
        // 93

        // 75
        // 74
        // 73
        System.out.print("請輸入成績(0-100):");
        int score = scanner.nextInt(); // 0-100的整數

        switch (score / 10) {
            case 10:
            case 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("c");
                break;
            case 6:
                System.out.println("D");
                break;
            default:
                System.out.println("E");
                break;

        }


        scanner.close();



    }
}
