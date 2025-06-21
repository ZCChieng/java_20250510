//基本執行緒的建立與執行
public class _46BasicThreadExample {
    public static void main(String[] args) {
        Thread myThread = new Thread(new Runnable() {
            @Override
            public void run() {
                // 這裡是執行緒要做的事情
                for (int i = 0; i < 5; i++) {
                    System.out.println("執行緒正在運行: " + i);
                    try {
                        // 模擬一些工作，讓執行緒暫停一段時間
                        Thread.sleep(1000); // 暫停1秒
                    } catch (InterruptedException e) {
                        System.out.println("執行緒被中斷: " + e.getMessage());
                    }
                }
            }

        });


        // 啟動執行緒
        myThread.start();
    }
}

/*
 * 執行緒（Thread） 是作業系統中用來執行程式的一個最小單位。
 * 你可以把它想像成程式裡的一條(執行路線)或「小分身」。
 * 
 * 主要特點
 * 一個程式(Process)可以同時有多個執行緒，每個執行緒可以同時做不同的事情。
 * 執行緒之間可以共享程式的記憶體資源(例如變數、物件)。
 * 多執行緒可以讓程式同時處理多項任務，提高效率(例如同時下載檔案、顯示動畫）。
 * 舉例
 * 假設你寫一個音樂播放器：
 * 
 * 一個執行緒負責播放音樂
 * 一個執行緒負責顯示動畫
 * 一個執行緒負責下載歌詞
 * 這樣各項工作就能同時進行，互不干擾。
 * 
 * 總結：
 * 執行緒就是程式中可以「同時」執行的工作單位，讓程式能夠並行處理多個任務。
 * 
 */
