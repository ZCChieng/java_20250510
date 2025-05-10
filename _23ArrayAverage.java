public class _23ArrayAverage {
    public static void main(String[] args) {

        int[] scores1 = { 99, 88, 75, 66, 85 };
        int[] scores2 = { 49, 84, 95, 76, 88 };
        int[] scores3 = { 55, 75, 75, 78, 66 };

        calculation(scores1);
        calculation(scores2);
        calculation(scores3);
    }

    public static void calculation(int[] scores) {
        int sum = 0; // 總分
        double avg = 0.0; // 平均分

        for (int i : scores) {
            sum += i;
        }

        // int/int = int， 之後才隱含轉換double。
        avg = sum / scores.length;
        System.out.println("總分是" + sum + "分，平均分數是" + avg + "分。");

        System.out.println("-------------------------------我是分隔線-------------------------------");
        // 要用double/int 才會一開始計算出來就是double。
        avg = (double) sum / scores.length;
        System.out.println("總分是" + sum + "分，平均分數是" + avg + "分。");

    }
}
