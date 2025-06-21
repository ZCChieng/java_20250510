/* FileOutputStream
用途
用於將資料以二進位格式寫入檔案。
適合處理非文字檔案(如圖片、音訊、影片等)。
特點
以位元組(byte)為單位寫入資料。
適合處理二進位檔案（如 .jpg、.mp3 等）。
如果用於文字檔案，必須手動處理字元編碼（例如 UTF-8）。 */

import java.io.FileOutputStream;
import java.io.IOException;

public class _42FileOutputStreamExample {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("Files/BinaryFile.bin")) {
            fos.write(65); // 寫入字元 'A' 的 ASCII 值
            fos.write(66); // 寫入字元 'B' 的 ASCII 值
            fos.write(67); // 寫入字元 'C' 的 ASCII 值
        } catch (IOException e) {
            System.out.println("寫入檔案時發生錯誤: " + e.getMessage());
        }
    }
}
