/* 用途
用於將物件序列化後寫入檔案或其他輸出流。
通常與 FileOutputStream 搭配使用。
寫入的物件需要實現 Serializable 介面。
特點
支援將整個物件序列化為二進位格式，並寫入檔案。
適合需要儲存複雜資料結構（如物件、集合）的場景。
寫入的物件需要用 ObjectInputStream 來讀取。 */

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class _45DataInputStreamExample {
    public static void main(String[] args) {
        try (DataInputStream dis = new DataInputStream(new FileInputStream("Files/Data.dat"))) {
            int intValue = dis.readInt();
            double doubleValue = dis.readDouble();
            String utfValue = dis.readUTF();
            System.out.println("讀取的整數: " + intValue);
            System.out.println("讀取的浮點數: " + doubleValue);
            System.out.println("讀取的字串: " + utfValue);
        } catch (IOException e) {
            System.out.println("讀取檔案時發生錯誤: " + e.getMessage());
        }
    }
}
