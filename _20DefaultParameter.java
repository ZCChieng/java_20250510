public class _20DefaultParameter {
    public static void main(String[] args) {
        printHello();
    }

    ///透過多載實現預設值
    public static void printHello() {
        System.out.println("abc123");
    }

    public static void printHello(String text) {
        System.out.println(text);
    }
}
