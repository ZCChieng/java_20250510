/**
 * 使用 synchronized 關鍵字來確保呼叫 counter 的執行是安全的(不會互相打架)。
 * 當多個執行緒同時訪問這個方法時，只有一個執行緒可以進入這個方法，
 * 其他執行緒將被阻塞，直到當前執行緒完成。
 */
public class _48SynchronizedExample {

  private static int counter = 0;

  /**
   * 使用 synchronized 關鍵字來確保呼叫 counter 的執行是安全的(不會互相打架)。
   * 當多個執行緒同時訪問這個方法時，只有一個執行緒可以進入這個方法，
   * 其他執行緒將被阻塞，直到當前執行緒完成。
   */
  public static synchronized void increment() {
    counter++;

  }

  public static void main(String[] args) {

    Runnable task = () -> {
      for (int i = 0; i < 1000; i++) {
        increment();
      }
    };

    Thread thread1 = new Thread(task);
    Thread thread2 = new Thread(task);
    Thread thread3 = new Thread(task);

    thread1.start();
    thread2.start();
    thread3.start();

    /*
     * 為什麼需要 `join()`？**
     * 當程式中有多個執行緒時，執行緒是並行執行的，主執行緒不會自動等待子執行緒完成。
     * 如果主執行緒在子執行緒完成之前就執行了後續程式碼，可能會導致不正確的結果。
     * 
     * 使用 `join()` 可以確保主執行緒在子執行緒完成後再繼續執行，
     * 從而避免競態條件（Race Condition）或不完整的結果。
     * 請參考Exercise裡的 _11JoinExample.java 的範例。
     */

    try {
      thread1.join();
      thread2.join();
      thread3.join();
    } catch (InterruptedException e) {
      System.out.println("主執行緒被中斷: " + e.getMessage());
    }

    System.out.println("最終計數器值: " + counter);

  }
}
