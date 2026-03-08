import java.util.Scanner;

public class ArrayDeletion {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter index to delete: ");
        int pos = sc.nextInt();

        // shift elements left
        for(int i = pos; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }

        n--; // reduce size

        System.out.println("Array after deletion:");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
