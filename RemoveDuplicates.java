import java.util.LinkedHashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 4, 4, 5, 1};

        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        // Add elements to LinkedHashSet
        for (int num : arr) {
            set.add(num);
        }

        System.out.print("Array after removing duplicates: ");

        for (int num : set) {
            System.out.print(num + " ");
        }
    }
}