//join作用的展示

package Exercise;

public class _11JoinExample {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("子執行緒 1 執行中: " + i);
                try {
                    Thread.sleep(500); // 暫停 500 毫秒
                } catch (InterruptedException e) {
                    System.out.println("執行緒被中斷");
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("子執行緒 2 執行中: " + i);
                try {
                    Thread.sleep(500); // 暫停 500 毫秒
                } catch (InterruptedException e) {
                    System.out.println("執行緒被中斷");
                }
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join(); // 等待 thread1 完成
            thread2.join(); // 等待 thread2 完成
        } catch (InterruptedException e) {
            System.out.println("主執行緒被中斷");
        }

        System.out.println("所有子執行緒執行完成");
    }
}
