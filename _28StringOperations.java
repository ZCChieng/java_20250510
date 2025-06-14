public class _28StringOperations {
    public static void main(String[] args) {
        // 字串的長度
        String str = "Hello, World!";
        System.out.println("字串長度: " + str.length());

        // 字串轉換為大寫
        String upperStr = str.toUpperCase();
        System.out.println("大寫字串: " + upperStr);

        // 字串轉換為小寫
        String lowerStr = str.toLowerCase();
        System.out.println("小寫字串: " + lowerStr);

        // 字串連接
        String additionalStr = " How are you?";
        String combinedStr = str.concat(additionalStr);
        System.out.println("連接後的字串: " + combinedStr);

        // 字串替換
        String replacedStr = str.replace("World", "Java");
        System.out.println("替換後的字串: " + replacedStr);

        // 字串分割
        String[] splitStr = str.split(",");
        System.out.println("分割後的字串:");
        for (String s : splitStr) {
            System.out.println(s);
        }


        // 字串反轉
        String reversedStr = new StringBuilder(str).reverse().toString();
        System.out.println("反轉後的字串: " + reversedStr);

    }
}
