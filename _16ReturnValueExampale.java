public class _16ReturnValueExampale {
    public static void main(String[] args) {
        int num = 5;
        int area = square(num);
        System.out.println("邊長為" + num + "的正方形，面積是" + area+"。");
    }

    // 回傳執行結果的「值」，在設計方法時需要先宣告型態。
    public static int square(int num) {
        num = num * num;
        return num;
    }
}
