public class _10ForLoop {
    public static void main(String[] args) {
        // 迴圈
        // 計數器迴圈
        /*
         * for(起始值;結束值;增量值){
         * 要執行的程式寫在這裡
         * }
         */

        // 假設有一段程式需要重複被執行若干次
        // 可使用迴圈敘述

        // 要有計數器:宣告一個整數變數
        for (int i = 1; i <= 5; i++) {
            System.out.println("今天天氣真不好!!");
        }

        System.out.println("===================================");

        for (int i = 1; i <= 10; i++) {
            System.out.println("i=" + i);
        }

        System.out.println("===================================");

        for (int i = 10; i >= 1; i--) {
            System.out.println("i=" + i);
        }

        System.out.println("===================================");

        // 巢狀迴圈
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println("i=" + i + ", j=" + j);
            }

        }
        System.out.println("===================================");
        // 任意數 到 任意數 的總和

        int sum = 0;
        int num = 100; 
        int initial = 1;

        for (int i = initial; i <= num; i++) {
            sum = sum + i;
        }

        System.out.println("1 到 "+ num +" 的總和 sum=" + sum);

        System.out.println("===================================");

        // 1 到 100 的奇數總和

        int sum2 = 0;

        for (int i = 1; i <= 100; i += 2) {

            sum2 = sum2 + i;

        }

        System.out.println("1 到 100 的奇數總和 sum2=" + sum2);

    }

}
