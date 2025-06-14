public class _24DynamicArray {

    public static void main(String[] args) {
        int[] numbers = new int[5];//建立長度5的陣列，索引值0~4。


        for(int i =0; i < numbers.length; i++)
        {
            numbers[i] = (i+1)*2;
        }

        for(int j :numbers)
        {
            System.out.println(j);
        }
    }
}