public class _05TypePromotion {

    public static void main(String[] args) {

        // java 型態運算規則(相同型態才能運算)
        byte a = 10;
        byte b = 20;

        // 1. byte、short、int 類型運算會自動提升為 int 類型
        // 這裡的 a + b 會自動提升為 int 類型
        // 因此不能直接賦值給 byte 類型的 c
        // byte c = a + b; // 編譯錯誤
        int c = a + b; // 正確
        System.out.println(c);// 30

        char ascii_a = 'a'; // 'a' 的 ASCII 碼是 97
        char ascii_b = 'b'; // 'b' 的 ASCII 碼是 98
        int ascii_c = ascii_a + ascii_b; // 正確，會轉成ASCII碼相加。
        System.out.println(ascii_c);// 195

        // 2.有一個運算元是long，計算結果為long。
        long d = 100L;
        int e = 200;
        // d + e 會自動提升為 long 類型
        long f = d + e; // 正確
        System.out.println(f);// 300

        // 3.有一個運算元是float，計算結果為float。
        float g = 100.0f;
        double h = 200.0;
        // g + h 會自動提升為 double 類型
        double i = g + h; // 正確
        System.out.println(i);// 300.0

        // 4.有一個運算元是double，計算結果為double。
        double j = 100.0;
        float k = 200.0f;
        // j + k 會自動提升為 double 類型
        double l = j + k; // 正確
        System.out.println(l);// 300.0

        // 優先級 : double > float > long > int > short > byte
        // 浮點數 > 整數 (因為整數的精準度是100%，但浮點數的精準度是有機率發生遺失的，所以只能精準度大的去「配合」精準度低的。)

        // 5.數值和字串運算，結果為字串。
        String m = "Hello";
        String n = "World ";
        int o = 100;
        // m + n + o 會自動提升為 String 類型
        String p = m + n + o; // 正確
        System.out.println(p);// HelloWorld 100

        // 6.數值和布林運算(不合法)
        // boolean q = 100 + true; // 編譯錯誤
        // boolean r = 100 + false; // 編譯錯誤

        //EXAMPLE
        byte s = 10;
        double t = 20.0;
        // s + t 會自動提升為 double 類型   
        double u = s + t; // 正確
        System.out.println(u);// 30.0
    }
}
