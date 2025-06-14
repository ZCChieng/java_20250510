public class _27CharCount {
    public static void main(String[] args) {
        String str = "Hello, World!";

        char target = 'o';

        int Count=0;


        // 使用 for 迴圈計算字元出現次數
      /*   for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                Count++;
            }
        } */


        // 使用拜訪迴圈計算字元出現次數
        for(char c : str.toCharArray()) {
            if (c == target) {
                Count++;
            }
        }

        System.out.println("字元 '" + target + "' 在字串中出現的次數: " + Count);

    }
}
