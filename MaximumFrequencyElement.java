import java.util.HashMap;

public class MaximumFrequencyElement {
    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 3, 3, 4, 2};

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency of each element
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int maxFreq = 0;
        int maxElement = 0;

        // Find element with maximum frequency
        for (int key : map.keySet()) {
            if (map.get(key) > maxFreq) {
                maxFreq = map.get(key);
                maxElement = key;
            }
        }

        System.out.println("Maximum Frequency Element: " + maxElement);
        System.out.println("Frequency: " + maxFreq);
    }
}
    