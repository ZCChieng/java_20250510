public class _19StaticAndNonStatic {
    public static void main(String[] args) {
        printHello();

        //物件實作
        _19StaticAndNonStatic a = new _19StaticAndNonStatic();
        a.printHello2();
    }

    // 有static => 靜態方法 => 不需要物件實作，就可以在類別裡面調用。
    public static void printHello() {
        System.out.println("Hello World!!");
    }

    // 無static => 非靜態方法 => 無法直接被呼叫，必須先要有物件實作，才可以透過物件呼叫。
    public void printHello2() {
        System.out.println("Hello World!!");
    }

}
