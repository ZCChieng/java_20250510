
//1.用於純文字資料寫入檔案(.txt、.csv)
//2.以字元(char)為單位寫入檔案，不支援逐行讀取
//3.自動處理字元編碼(會使用平台預設)
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class _36FileWriterExample {
    public static void main(String[] args) {

        writeLine();

        try (FileWriter fileWriter = new FileWriter("Files/output.txt", true)/* true => 追加模式已有檔案繼續追加 */) {
            fileWriter.write("這是filewriter寫入第一行\n");
            fileWriter.write("這是filewriter寫入第二行\n");
            System.err.println("檔案寫入完成。");
        } catch (IOException e) {
            System.out.println("寫檔發生錯誤。");
        }
    }

    public static void writeLine() {
        File dir = new File("files");
        if (!dir.exists()) {
            dir.mkdirs(); // 建立多層目錄
        }
    }
}
