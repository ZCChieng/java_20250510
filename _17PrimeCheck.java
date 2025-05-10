public class _17PrimeCheck {
    public static void main(String[] args) {
        // 主程式只寫主要功能表達
        int num = 577;
        if (isPrime(num)) {
            System.out.println(num + "是質數。");
        } else {
            System.out.println(num + "不是質數。");
        }
    }

    // 演算法與演算式應獨立為方法
    public static boolean isPrime(int num) {

        // 小於1 => 不是質數
        if (num <= 1) {
            return false;
        }

        int i = 2;
        // Math.sqrt() 取根號
        while (i <= Math.sqrt(num)) {
            if (num % i == 0) {
                // 不是質數
                return false;
            }

            i++;
        }
        return true;
    }
}