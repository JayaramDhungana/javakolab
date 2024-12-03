import java.util.HashSet;

public class AllPossibilitiesArray {
    public static void main(String[] args) {
        // Example usage
        int[] array1 = {0, 1, 2, 3}; // Example: Array of all possibilities
        int[] array2 = {0, 2, 3, 4}; // Example: Not an array of all possibilities

        System.out.println("Is array1 an array of all possibilities? " + isAllPossibilities(array1)); // Output: 1
        System.out.println("Is array2 an array of all possibilities? " + isAllPossibilities(array2)); // Output: 0
    }

    public static int isAllPossibilities(int[] array) {
        if (array == null || array.length == 0) {
            return 0; // An empty array cannot be an array of all possibilities
        }

        int n = array.length; 
        HashSet<Integer> set = new HashSet<>();

        // Add all elements to the set
        for (int num : array) {
            if (num < 0 || num >= n) {
                return 0; // Element out of range
            }
            set.add(num);
        }

        // Check if the set contains exactly n unique numbers (0 to n-1)
        return set.size() == n ? 1 : 0;
    }
}
