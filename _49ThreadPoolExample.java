
//使用 ExecutorService 管理執行緒池
//每次執行都會是不同的結果
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class _49ThreadPoolExample {
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(3); // 建立一個固定可放置3個執行緒大小的池

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
 * 結論
 * 執行緒池：適合需要執行大量任務的情境，提供了更高的效能和更好的資源管理。
 * 手動建立執行緒：適合簡單的場景，但不適合處理大量任務，因為它缺乏執行緒重用和資源管理機制。
 * 
 * 如果程式需要執行多個任務，建議使用執行緒池來管理執行緒，這樣可以提高效能並簡化程式設計。
 */