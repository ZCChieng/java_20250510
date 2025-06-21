import java.io.File;

//使用File類別檢查檔案是否存在
public class _35FCheckExample {
    public static void main(String[] args) {
        String path = "Files/text.txt";
        File file = new File(path);

        // 檢查檔案是否存在
        if (file.exists()) {
            System.out.println("檔案存在: " + file.getAbsolutePath());
        } else {
            System.out.println("檔案不存在 ");

        }
    }
}