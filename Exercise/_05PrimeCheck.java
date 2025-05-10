//質數判斷

package Exercise;

public class _05PrimeCheck {
    public static void main(String[] args) {
        int number = 29;

        if (number <= 1) {
            System.out.println(number + " 不是質數");
            return;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                System.out.println(number + " 不是質數");
                return;
            }
        }  
         
        System.out.println(number + " 是質數");
      
    }
}
