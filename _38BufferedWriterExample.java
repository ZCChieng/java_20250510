//使用 BufferedWriter 寫入檔案
/* 用途: 用於高效地寫入文字檔案。
特點:
使用緩衝區來提高寫入效率，適合處理大量文字資料。
限制:
需要手動處理換行符號(使用 newLine() 方法）。 */

import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class _38BufferedWriterExample {
    public static void main(String[] args) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Files/BufferedWriterExample.txt"))) {
            // 寫入文字到檔案
            writer.write("Hello, World!");
            writer.newLine(); // 換行
            writer.write("This is a BufferedWriter example.");
            writer.newLine(); // 換行
            System.out.println("文字已成功寫入檔案。");
            // 刷新緩衝區，確保所有資料都寫入檔案
            writer.flush();

        } catch (IOException e) {
            System.out.println("寫入檔案時發生錯誤: " + e.getMessage());
        }
    }
}
