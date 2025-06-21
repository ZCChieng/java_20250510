//使用 Scanner 讀取檔案
/* 用途: 用於從檔案、字串或標準輸入中讀取資料。
特點:
支援逐行或逐字詞讀取(中英文的觀念不同，與逐char讀取易混淆)。
提供方便的方法來解析基本資料型別(如 int、double)。
限制:
只能讀取，不能寫入。
不適合處理大型檔案，因為它是逐行讀取的。 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class _41ScannerExample {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(new File("Files/PrintWriterExample.txt"))) {
            // 逐行讀取檔案內容
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine()); // 輸出讀取的行
            }
        } catch (FileNotFoundException e) {
            System.out.println("檔案未找到: " + e.getMessage());
        }
    }
}
