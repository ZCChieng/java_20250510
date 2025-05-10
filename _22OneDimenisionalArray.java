
public class _22OneDimenisionalArray {
    public static void main(String[] args) {

        // 宣告包含11、222、3333、44444、555555的陣列
        int[] numbers = { 11, 222, 3333, 44444, 555555 };

        // 從0開始算索引
        // 使用計數器迴圈抓取陣列值
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println("----------------------我是分隔線----------------------");

        // 使用拜訪迴圈抓取陣列值
        for (int item : numbers) {
            System.out.println(item);
        }
    }
}
