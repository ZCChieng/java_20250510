public class _13MethodExample {
    public static void main(String[] args) {

        // 無參數
        printHello();
        // 有參數 *多載(可透過參數不同或資料型態不同，來製作相同名稱但內容不同的方法)
        printHello("Hello World!!");
        printHello(callBackText());
        isHelloWorld(callBackText());
        printHello("99乘法表");
        printMultiplicationTable(); //呼叫方法(支語會說調用)
    }

    // 方法(Method) : 物件裡的某一種功能
    // 內建方法 => 程式里內建的方法(功能) ex : println(); => 輸出字串

    // void
    public static void printHello() {
        System.out.println("Hello World!!");
    }

    public static void printHello(String text) {
        System.out.println(text);
    }

    public static String callBackText() {
        return "Hello World!!";
    }

    public static boolean isHelloWorld(String text) {
        if (text == "Hello World!!") {
            printHello("yes");
            return true;
        } else {
            printHello("no");
            return false;
        }
    }

    public static void printMultiplicationTable()
    {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.print(i + " * " + j + " = " + (i * j) + "\t");
            }
            System.out.println();
        }
    }
}
