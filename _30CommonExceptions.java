public class _30CommonExceptions {
    public static void main(String[] args) {

        try {
             String str = null;
             System.out.println(str.toUpperCase());

        } catch (NullPointerException e) {
           System.out.println("字串是空的" + e.getMessage());
        }



      

    }
}
