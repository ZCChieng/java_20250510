//單一執行緒池
/*

  始終只有 1 個執行緒。
  按提交順序執行（FIFO）。
  任務需要順序執行，或同一時間只允許一個任務執行。
  輕量級，適合簡單任務。 控制執行緒數量，資源使用穩定。
 */
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class _50SingleThreadPool {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor(); // 建立單一執行緒池

        for (int i = 1; i <= 5; i++) {
            int taskId = i;

            // 提交任務到執行緒池
            executorService.submit(() -> {

                System.out.println("執行任務: " + taskId + " by " + Thread.currentThread().getName());
                try {
                    Thread.sleep(1000); // 模擬任務執行
                } catch (InterruptedException e) {
                    System.out.println("執行緒被中斷");
                }

            });

        }

        executorService.shutdown();
    }
}

/*
 * 如果任務非常簡單且數量很少，可以直接使用主執行緒執行。
 * 如果任務執行時間較長或者需要處理大量任務，使用執行緒池(即使是單一執行緒池)效能會更好。
 * 
 * 單一執行緒池優點：
 * 自動管理執行緒和任務排隊。
 * 支援執行緒再用(reuse)，減少系統資源耗費。
 * 確保任務按順序執行，避免多執行緒的同步問題。
 */
