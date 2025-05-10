public class _06Expression {
    public static void main(String[] args) {

        //算術運算子
        int a = 10;
        int b = 3;

        System.out.println("  加法 : a + b = " + (a + b)); // 13
        System.out.println("  減法 : a - b = " + (a - b)); // 7
        System.out.println("  乘法 : a * b = " + (a * b)); // 30
        System.out.println("  除法 : a / b = " + (a / b)); // 3
        System.out.println("取餘數 : a % b = " + (a % b)); // 1

        System.out.println("----------------------");

        //比較運算子(結果為布林值)
        System.out.println("a 和 b 是否相等 ? : " + (a == b));  //等於比較
        System.out.println("a 和 b 是否不相等 ? : " + (a != b)); //不等於比較
        System.out.println("a 是否大於 b ? : " + (a > b)); //大於比較
        System.out.println("a 是否小於 b ? : " + (a < b)); //小於比較
        System.out.println("a 是否大於等於 b ? : " + (a >= b)); //大於等於比較
        System.out.println("a 是否小於等於 b ? : " + (a <= b)); //小於等於比較
    
        System.out.println("----------------------");
        //邏輯運算子(兩側運算元 和 運算結果皆為 布林值)
        boolean x = true;   
        boolean y = false;

        System.out.println("x 「和」 y 是否為 true ? : " + (x && y));  // AND 運算 // 結果 為 false。
        System.out.println("x 「或」 y 是否為 true ? : " + (x || y));  // OR 運算  // 結果 為 true。
        System.out.println("x   是否「不」為 true ? : " + (!x)); // NOT 運算 // 結果 為 false。
    
        //當比較和邏輯運算同時出現?
        //優先級 : 比較運算 > 邏輯運算
        int z = 5;
        int w = 10;
        System.out.println("z 和 w 是否相等且Z>0 ? : " + (z == w && z > 0)); // false
    
        System.out.println("----------------------");
        
        //位元運算子(效率高，可以提升效能，計算時要轉二進位且要補到同樣位數)
        //a = 10 => (二進位) 1010
        //b = 3  => (二進位) 0011 
        System.out.println("位元與" + (a & b)); // (二進位) 1010 & 0011 = 0010 => (十進位) 2
        System.out.println("位元或" + (a | b)); // (二進位) 1010 | 0011 = 1011 => (十進位) 11 
        System.out.println("位元非" + (~a));    // (二進位) ~1010 = 0101 => (十進位) -11
        System.out.println("位元或" + (a | b)); // (二進位) 1010 | 0011 = 1011 => (十進位) 11
        System.out.println("位元異或" + (a ^ b)); // // (二進位) 1010 ^ 0011 = 1001 => (十進位) 9
        System.out.println("位元左移" + (a << 2)); // (二進位) 1010 << 2 = 101000 => (十進位) 40
        System.out.println("位元右移" + (a >> 2)); // (二進位) 1010 >> 2 = 0010 => (十進位) 2
        System.out.println("位元無符號右移" + (a >>> 2)); // (二進位) 1010 >>> 2 = 0010 => (十進位) 2

        System.out.println("----------------------");
    
        //EXAMPLE 1 : 取代算術運算，提升效能。
        System.out.println("a*2 "+ (a << 1)); // a*2 和 a<<1 等價。
        System.out.println("a/2 "+ (a >> 1)); // a/2 和 a>>1 等價。
        System.out.println("a/4 "+ (a >> 2)); // a/4 和 a>>2 等價。
        System.out.println("a*4 "+ (a << 2)); // a*4 和 a<<2 等價。

        //EXAMPLE 2 : 狀態標示
        //例 : 使用位元與(&)，檢查每位是否為1。
        // 狀態標誌-使用位元與（&）檢查某一位是否為 1
        // 位元運算可以用來操作二進位的每一位，適合用來表示和操作多個布林值（如開關狀態）。
        // 0b用來表示二進位數字
        int flags = 0b1010; // 二進位表示，十進位是 10
        int mask = 0b0010; // 遮罩位元，檢查第二位是否為 1，十進位是 2。
        System.out.println("第二位是否為 1: " + ((flags & mask) != 0)); // true
     
        // 狀態標誌-簡單加密與解密
        // 位元異或（^）常用於簡單的加密和解密，因為同一個數字進行兩次異或運算會還原原始值。
        int data = 123; // 原始數據
        int key = 7533967; // 加密密鑰

        int encrypted = data ^ key; // 加密
        System.out.println("加密後: " + encrypted);

        int decrypted = encrypted ^ key; // 解密
        System.out.println("解密後: " + decrypted);

        // 位元壓縮-將兩個數字壓縮到一個整數
        // 位元運算可以用來壓縮數據，例如將多個小範圍的數字存儲到一個整數中。

        int m = 15; // 4 位數字
        int n = 3; // 4 位數字

        int compressed = (m << 4) | n; // 將 m 存在高 4 位，n 存在低 4 位
        System.out.println("壓縮後: " + Integer.toBinaryString(compressed));

        // 解壓縮
        int extractedM = (compressed >> 4) & 0b1111; // 提取高 4 位
        int extractedN = compressed & 0b1111; // 提取低 4 位
        System.out.println("解壓後 m: " + extractedM + ", n: " + extractedN);

        ///////////////////////////////////////////////////////////////////////

        System.out.println("=========================");
        a++; // a = a+1 // 自增運算子
        System.out.println("自增後的 a: " + a);

        a = a + 2;
        System.out.println("a=a+2後的 a: " + a);

        a += 3; // a = a + 3
        System.out.println("a+=3後的 a: " + a);

        System.out.println("=========================");

        a--; // a=a-1 a:15

        System.out.println("=========================");

        int c = 0;
        c = a++ +2; // a先加2丟給c後, a才自身加1
        System.out.println("自減後的 c: " + c);


        c = ++a +2; // a才自身加1後,再加2,才丟給c
        System.out.println("自減後的 c: " + c);
    }
}
