/* 
使用 PrintWriter 寫入檔案
用途: 用於寫入文字檔案。
特點:
提供方便的方法來寫入文字資料(如 println())。
自動處理換行符號。
限制:
只能寫入文字檔案，不適合處理二進位檔案。 */

import java.io.IOException;
import java.io.PrintWriter;

public class _40PrintWriterExample {
    public static void main(String[] args) {
        try (PrintWriter writer = new PrintWriter("Files/PrintWriterExample.txt")) {
            // 寫入文字到檔案
            writer.println("這是使用 PrintWriter 寫入的第一行文字。");
            writer.println("這是使用 PrintWriter 寫入的第二行文字。");
            writer.println("這是使用 PrintWriter 寫入的第三行文字。");
            System.out.println("檔案寫入成功！");
          
        } catch (IOException e) {
            System.out.println("寫入檔案時發生錯誤: " + e.getMessage());
        }
    }
}
