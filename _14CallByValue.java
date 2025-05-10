public class _14CallByValue {

    public static void main(String[] args) {
        int a;
        // 宣告a變數，會執行兩件事 =>
        // 1.在記憶體定義a這個空間(記憶體位置)
        // 2.能夠放入一個 int 的值，名稱為「a」的格子
        a = 10;

        // 傳入 a 的值 =>也就是10
        System.out.println("在主程式裡經方法運算前的a值是"+a);


        modifyValue(a);
        System.out.println("在主程式裡經方法運算完的a值是"+a);

    }

    public static void modifyValue(int a) {
        a = 30; 
        //在方法裡創建一個名稱為 a 的格子把30放進去格子裡面(指定運算) 
        //其所在記憶體位置與主程式不同(想成主程式是一個地址、方法為一個地址，他們是住在不同地方但名字剛好一樣的不同人。)
       System.out.println("在方法裡被運算的a位置值是"+a);

    }
}