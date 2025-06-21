/* 用途
用於將基本資料型別(如 int、float、double、boolean 等)以二進位格式寫入檔案或其他輸出流。
通常與 FileOutputStream 搭配使用。
特點
資料以二進位格式存儲，資料較密集節省空間。
適合需要高效儲存和讀取基本資料型別的場景。
寫入的資料需要用 DataInputStream 來讀取。 */

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class _44DataOutputStreamExample {
    public static void main(String[] args) {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("Files/Data.dat"))) {
            dos.writeInt(123);
            dos.writeDouble(45.67);
            dos.writeUTF("Hello, DataOutputStream!");
            System.out.println("二進位檔案寫入完成");
        } catch (IOException e) {
            System.out.println("寫入檔案時發生錯誤: " + e.getMessage());
        }
    }
}
