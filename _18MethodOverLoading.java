public class _18MethodOverLoading {
    public static void main(String[] args) {

    }

    // 只能整數
    public static int add(int a, int b) {
        return a + b;
    }
    // 透過回傳資料型態不同，進行多載實作。
    public static double add(double a, double b) {
        return a + b;
    }
}
