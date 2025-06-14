//陣列的排序

import java.util.Arrays;

public class _25ArraySortingAndSearch {
    public static void main(String[] args) {

        int[] numbers = { 5, 2, 8, 1, 3 };

        // 遞增排序
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        for (int number : numbers) {
            System.out.println(number);
        }

        // 遞減排序
        Integer[] numbers2 = { 5, 2, 8, 1, 3 };
        Arrays.sort(numbers2, (a, b) -> b - a);

        System.out.println(Arrays.toString(numbers2));
        for (int number : numbers2) {
            System.out.println(number);
        }
       
        
        // 字串排序
        String[] names = { "klice", "Dob", "rharlie", "Bavid" };
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));


         // 以字串的長度排序
        String[] names2 = { "klice", "Dob", "rharlie", "Bavid" };
        Arrays.sort(names2, (a, b) -> a.length() - b.length());
        System.out.println(Arrays.toString(names2));


        // 搜尋
         int[] numbers3 = { 5, 2, 8, 1, 3 };
         int index = Arrays.binarySearch(numbers3, 8);
         System.out.println("8 的索引位置是: " + index);
    }
}
