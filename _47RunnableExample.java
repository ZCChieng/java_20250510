//使用 Runnable 介面建立執行緒
//Runnable:建立「執行緒要做的事情」
/* 
Runnable 是一個介面，裡面只有一個 run() 方法。
實作(implement)這個介面，把「執行緒要做的事情」寫在 run() 方法裡。
把這個 Runnable 物件交給 Thread，讓執行緒去執行這段程式碼。
*/
public class _47RunnableExample {
    public static void main(String[] args) {
        /*
          Runnable task=new Runnable() {
          
          @Override
          public void run() {
            // 這裡是執行緒要做的事情
            for (int i = 0; i < 5; i++) {
                System.out.println("Runnable 運行: " + i);
                try {
                    // 模擬一些工作，讓執行緒暫停一段時間
                    Thread.sleep(1000); // 暫停1秒
                } 
                catch (InterruptedException e) {
                    System.out.println("執行緒被中斷: " + e.getMessage());
                    }
                }
            }
          
          };
         */

         // 使用 Lambda 表達式來簡化 Runnable 的實作
        Runnable task = () -> {

            // 這裡是執行緒要做的事情
            for (int i = 0; i < 5; i++) {
                System.out.println("Runnable 運行: " + i);
                try {
                    // 模擬一些工作，讓執行緒暫停一段時間
                    Thread.sleep(1000); // 暫停1秒
                } catch (InterruptedException e) {
                    System.out.println("執行緒被中斷: " + e.getMessage());
                }
            }

        };

        Thread myThread = new Thread(task); // 將 Runnable 物件傳給 Thread

        // 啟動執行緒
        myThread.start();
    }
}

/*
 * Lambda (->) 寫法 Override 寫法
 * 只適用於單一方法介面 適用於所有覆寫方法
 * 語法簡潔，無需類別名稱 需寫完整類別與方法結構
 * 常用於簡單、臨時的任務 常用於複雜或多方法的類別
 */