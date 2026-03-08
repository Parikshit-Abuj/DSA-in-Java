import java.util.Scanner;

public class ArrayInsertion {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n + 1]; // extra space for insertion

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element to insert: ");
        int element = sc.nextInt();

        System.out.print("Enter index to insert at: ");
        int pos = sc.nextInt();

        // Shift elements to the right
        for (int i = n; i > pos; i--) {
            arr[i] = arr[i - 1];
        }

        // Insert element
        arr[pos] = element;
        n++;

        // Print new array
        System.out.println("Array after insertion:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
