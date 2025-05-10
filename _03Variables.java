public class _03Variables {
    public static void main(String[] args) {
        // 宣告變數 + 指定運算
        char letter = 'A'; //字元
                           // = : 指定運算子，把右邊放入左邊的變數中。
                           // (由右邊記憶體位置把資料複製一分到左邊記憶體位置中。)
        int num = 123;   // int 整數(interger) 
        double pi = 3.1415926; //雙精(準)浮點數
        boolean isN = true; //布林值(True or False)

        num = 456;

        System.out.println('A');   //A
        System.out.println(letter);  //A
        System.out.println(num);     //456 (Note : 最後指定進去的值)
        System.out.println(pi);      //3.1415926
        System.out.println(isN);     //true

    }
}
