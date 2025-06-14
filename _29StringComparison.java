public class _29StringComparison {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "java";

        System.out.println("使用 == 比較: " + (str1 == str2)); // 比較參考是否相同

        System.out.println("使用 equals 比較: " + str1.equals(str2)); // 比較內容是否相同

        //忽略大小寫比較內容是否相同
        System.out.println("使用 equalsIgnoreCase 比較: " + str1.equalsIgnoreCase(str2)); 
    }
}
