/* FileInputStream
用途
用於讀取二進位檔案(如圖片、音訊、影片、壓縮檔等）。
也可以用於讀取文字檔案，但需要手動處理字元編碼。
特點
以位元組(byte)為單位讀取檔案內容。
適合處理非文字檔案(如 .jpg、.mp3 等)。
不會自動處理字元編碼，讀取文字檔案時需要手動轉換位元組為字元。 */

import java.io.FileInputStream;
import java.io.IOException;

public class _43FileInputStreamExample {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("Files/BinaryFile.bin")) {
            int data;
            while ((data = fis.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            System.out.println("讀取檔案時發生錯誤: " + e.getMessage());
        }
    }
}
