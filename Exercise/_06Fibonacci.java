//Fibonacci 數列

package Exercise;

public class _06Fibonacci {
    public static void main(String[] args) {
        int n = 50;
        int a = 0, b = 1;

        System.out.print("Fibonacci 數列: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " , ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}
