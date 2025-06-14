public class _33CustomExceptionExample {
  public static void main(String[] args) {
      try{
        checkAge(15); // 這裡會觸發自定義例外);
      }catch(Exception e) {
        System.out.println("捕捉到例外: " + e.getMessage());

      }
  }

  // 自定義例外
  public static void checkAge(int age) {
    if (age < 18) {
      throw new IllegalArgumentException("年齡必須大於或等於 18 歲");
    }
  }

}
