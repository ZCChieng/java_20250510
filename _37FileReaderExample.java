import java.io.FileReader;
import java.io.IOException;

public class _37FileReaderExample {
    public static void main(String[] args) {
       //讀取檔案
        fileRead();
    }

    public static void fileRead() {
        try(FileReader fileReader = new FileReader("Files/output.txt")) {
        int character;

        // 逐字元讀取檔案內容
        while ((character = fileReader.read()) != -1) {
            System.out.print((char) character); // 將讀取的字元轉換為 char 並輸出
        }
       
      }
      catch(IOException e) {
            System.out.println("讀取檔案時發生錯誤: " + e.getMessage());

      }
    }
}
