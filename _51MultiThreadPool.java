//多個執行緒池
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class _51MultiThreadPool {
    public static void main(String[] args) {
        // 第一個執行緒池，固定大小為 3
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(3);

        // 第二個執行緒池，動態大小
        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();

        // 提交任務到第一個執行緒池
        for (int i = 1; i <= 5; i++) {
            int taskId = i;
            fixedThreadPool.submit(() -> {
                System.out.println("固定執行緒池執行任務: " + taskId + " by " + Thread.currentThread().getName());
                try {
                    Thread.sleep(1000); // 模擬任務執行
                } catch (InterruptedException e) {
                    System.out.println("執行緒被中斷");
                }
            });
        }

        // 提交任務到第二個執行緒池
        for (int i = 6; i <= 10; i++) {
            int taskId = i;
            cachedThreadPool.submit(() -> {
                System.out.println("動態執行緒池執行任務: " + taskId + " by " + Thread.currentThread().getName());
                try {
                    Thread.sleep(1000); // 模擬任務執行
                } catch (InterruptedException e) {
                    System.out.println("執行緒被中斷");
                }
            });
        }

        // 關閉執行緒池
        fixedThreadPool.shutdown();
        cachedThreadPool.shutdown();

    }
}

/*
 * 特性       | newFixedThreadPool                            | newCachedThreadPool
 * 執行緒數量 | 固定大小（由初始化時指定）。                      |動態大小，根據需要創建執行緒。
 * 任務排隊   | 超過執行緒數量的任務會排隊等待執行。              |沒有排隊機制，會直接創建新的執行緒執行任務。
 * 執行緒回收 | 執行緒不會被回收，除非執行緒池被關閉。            |空閒超過 60 秒的執行緒會自動回收。
 * 適用情境   | 適合固定數量的任務，或需要穩定執行緒數量的場景。   |適合大量短時間任務，或任務數量不確定的場景。
 * 資源使用   | 控制執行緒數量，資源使用穩定。                   |如果任務過多，可能會創建大量執行緒，消耗更多資源。
 */

/* 
    執行緒數量沒有固定上限，會根據任務數量「動態增加」執行緒。
    如果有新任務且沒有可用的閒置執行緒，就會建立新的執行緒。
    閒置超過 60 秒的執行緒會自動回收（關閉）。
    理論上最大可以到 Integer.MAX_VALUE(約21億)，但實際上受限於系統資源。
    總結：
    動態大小的執行緒池「沒有固定大小」，會根據需求自動調整，任務多時執行緒就多，任務少時執行緒就少。

    多個執行緒池的目的是根據不同的任務類型或需求，分開管理與分配執行緒資源，提升效能與穩定性。
    常見原因：
    避免互相干擾：不同任務（如網路請求、檔案寫入、計算工作）用不同的執行緒池，避免一種任務塞滿所有執行緒，影響其他任務。
    資源分配更彈性：可以針對不同任務設定不同的執行緒數量，讓資源利用更有效率。
    提升效能：讓高優先權或即時性需求的任務有專屬執行緒池，避免被低優先權任務拖慢。
    易於管理與維護：每個執行緒池可以獨立監控、調整與關閉，方便管理。
    */