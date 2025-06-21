package Exercise;

import java.util.HashMap;

public class _10MostFrequentElement {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4};
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : numbers) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        int mostFrequent = numbers[0];
        int maxCount = 0;

        for (int key : frequencyMap.keySet()) {
            if (frequencyMap.get(key) > maxCount) {
                mostFrequent = key;
                maxCount = frequencyMap.get(key);
            }
        }

        System.out.println("出現次數最多的元素是: " + mostFrequent + "，次數: " + maxCount);
    }
}