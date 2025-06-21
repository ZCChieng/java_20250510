//使用 BufferedReader 讀取檔案
/* 用途: 用於高效地逐行讀取文字檔案。
特點:
使用緩衝區來提高讀取效率，適合處理大型檔案。
支援逐行讀取(readLine() 方法)。
限制:
只能讀取文字檔案，對於二進位檔案不適用。 */

import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class _39BufferedReaderExample {
    public static void main(String[] args) {
      try(BufferedReader reader = new BufferedReader(new FileReader("Files/BufferedWriterExample.txt"))){
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line); // 輸出讀取的每一行
            
        }
      }
      catch(IOException e){
         System.out.println("寫入檔案時發生錯誤: " + e.getMessage());
      }
    }
}
