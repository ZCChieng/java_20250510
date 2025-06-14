public class _33MultipleExceptions {
      public static void main(String[] args) {
        try{
          int[] numbers = {1, 2, 3};
          System.out.println(numbers[5]); // 陣列索引超出範圍 這裡會觸發 ArrayIndexOutOfBoundsException
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("陣列索引超出範圍: " + e.getMessage());
        }
        catch(ArithmeticException e){
            System.out.println("算術錯誤: " + e.getMessage());
        }
        catch(NullPointerException e){
            System.out.println("空指針異常: " + e.getMessage());
        }
        catch(Exception e){
            System.out.println("捕捉到其他異常: " + e.getMessage());
        }

    }
}
