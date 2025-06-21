import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class _52CallableExample {
    public static void main(String[] args) {
         // 建立執行緒池
        ExecutorService executor = Executors.newSingleThreadExecutor(); // 建立一個執行緒

        // 定義 Callable 任務
        Callable<Integer> task = () -> {

            int sum=0;
            for (int i = 1; i <= 10; i++) {
                sum += i; // 計算 1 到 10 的總和
                Thread.sleep(1000); // 模擬延遲
            }

          
            return sum; // 回傳結果
        };

        // 提交 Callable 任務並取得 Future
        Future<Integer> future = executor.submit(task);

        try{
            // 等待任務完成並取得結果
            Integer result = future.get(); // 阻塞直到任務完成
            System.out.println("任務結果: " + result); // 輸出結果
        }
        catch(InterruptedException| ExecutionException e) {
            System.out.println("任務執行時發生錯誤: " + e.getMessage());
        }
        finally {           
            // 關閉執行緒池
            executor.shutdown();

        }

    }
}

/*
 * Callable 和 Runable 的區別
 * 特性     |Callable                        |Runnable
 * 回傳值   |有回傳值，透過 call() 方法回傳。  |無回傳值，run() 方法不回傳任何值。
 * 例外處理 |可以throw Checked Exception。    |無法throw Checked Exception。
 * 使用情境 |適合需要回傳結果或拋出例外的任務。 |適合執行不需要回傳值的任務。
 * 
 * 
 * Future 的常用方法
 * get() 阻塞直到任務完成，並返回結果。
 * get(long timeout, TimeUnit unit) 在指定時間內等待結果，超時則拋出 TimeoutException。
 * isDone() 檢查任務是否完成（非阻塞）。
 * cancel(boolean mayInterruptIfRunning) 嘗試取消任務執行。
 * isCancelled() 檢查任務是否已被取消。
 */