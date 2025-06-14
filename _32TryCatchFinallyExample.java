public class _32TryCatchFinallyExample {
  public static void main(String[] args) {

    try{
        int a = 0;
        int result = 10 / a; // 這裡會產生 ArithmeticException
    }
    catch (ArithmeticException e) {
        System.out.println("除以零錯誤: " + e.getMessage());
    } finally {
        System.out.println("這段程式碼無論如何都會執行");
    }
    

  }
}
