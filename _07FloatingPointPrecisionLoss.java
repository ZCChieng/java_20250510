// 浮點數運算精準度遺失的例子
public class _07FloatingPointPrecisionLoss {
    public static void main(String[] args) {

        double x = 0.1;
        double y = 0.2;
        double sum = x + y;

        System.out.println("0.1 + 0.2 = " + sum);

        ///////////////////////////////////////////////
        
        //EXAMPLE 1 : 浮點數運算精準度遺失的例子
        System.out.println("0.1 + 0.2 == 0.3 為 " + (sum == 0.3)); // 結果會是 false。

        //比較浮點數時，應該直接避免使用 == ，而是應進行「容許有誤差範圍」的比較。
        
        double epsilon = 0.000001; // 容許誤差範圍
        System.out.println("0.1 + 0.2 == 0.3 為"+ (Math.abs(sum - 0.3) < epsilon)); // 結果會是 true。
    }
}
