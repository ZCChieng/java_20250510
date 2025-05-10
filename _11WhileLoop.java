public class _11WhileLoop {
    public static void main(String[] args) {
        /*
         * while (條件){
         * 條件成立時要執行的內容
         * }
         */

        // 前測
        int a = 1;
        while (a < 10) {
            System.out.println("a=" + a);
            a++;
        }

        System.out.println("===================================");

        // 後測
        int b = 1;
        do {
            System.out.println("b=" + b);
            b++;
        } while (b < 10);

        System.out.println("===================================");
        int number = 65217;
        int result = 0;

        while (number != 0) {
            int digit = number % 10; // 5
            result = result * 10 + digit;
            number = number / 10; // 1234
        }

        System.out.println("反轉後的數字是:" + result);

    }

}
