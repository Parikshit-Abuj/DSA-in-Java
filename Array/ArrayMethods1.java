import java.util.Arrays;

public class ArrayMethods1 {

    public static void main(String[] args) {

        // -------------------------------
        // 1. DECLARE & INITIALIZE ARRAY
        // -------------------------------
        int[] arr = {50, 40, 10, 90, 3, 89};

        // -------------------------------
        // 2. SORT ARRAY (REQUIRED for binarySearch)
        // -------------------------------
        Arrays.sort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));

        // -------------------------------
        // 3. ELEMENT TO SEARCH
        // -------------------------------
        int key = 90;

        // -------------------------------
        // 4. BINARY SEARCH (FULL ARRAY)
        // Time Complexity: O(log n)
        // -------------------------------
        int index1 = Arrays.binarySearch(arr, key);
        System.out.println(key + " found at index (full search): " + index1);

        // -------------------------------
        // 5. BINARY SEARCH WITH RANGE
        // Syntax:
        // binarySearch(array, fromIndex, toIndex, key)
        // NOTE:
        // fromIndex = inclusive
        // toIndex = exclusive
        // -------------------------------
        int fromIndex = 3;
        int toIndex = 6;

        int index2 = Arrays.binarySearch(arr, fromIndex, toIndex, key);

        // -------------------------------
        // 6. PRINT RESULT
        // -------------------------------
        if (index2 >= 0) {
            System.out.println(key + " found in range at index: " + index2);
        } else {
            System.out.println(key + " not found in given range");
        }
    }
}
