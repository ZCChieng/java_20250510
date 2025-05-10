public class _15CallByReference {
    public static void main(String[] args) {

        int[] a = {10}; //宣告陣列a宣告陣列a

        System.out.println("在主程式裡經方法運算前的a位置是" + a+"第一個值是"+a[0]);

        // 傳入 a 的位址 =>也就是陣列a物件本身       
        modifyValue(a);
        System.out.println("在主程式裡經方法運算完的a位置是" + a+"第一個值是"+a[0]);
    }

    public static void modifyValue(int[] a) {
        a[0] = 30; 
        System.out.println("在方法裡被運算的a位置是" + a+"第一個值是"+a[0]);
    }
}
