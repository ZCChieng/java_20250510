class AgeAboveException extends Exception {

    public AgeAboveException(String message) { // 建構子
        super(message); // 呼叫父類別的建構子，傳遞錯誤訊息
    }

}

// 自訂例外的類別
public class _34CustomExceptionDemoUsingClass {

    public static void main(String[] args) {
        try {
            ageCheck(15);
        } catch (AgeAboveException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void ageCheck(int age) throws AgeAboveException {
        if (age < 18) {
            throw new AgeAboveException("Age must be 18 or above.");
        }
    }
}
