package random;
import java.util.*;


public class MinNonZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // number of test cases

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt(); // length of the array
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = scanner.nextInt(); // elements of the array
            }
            performOperations(arr);
        }

        scanner.close();
    }

    private static void performOperations(int[] arr) {
        List<Integer> operations = new ArrayList<>();
        int minNonZero = Integer.MAX_VALUE;

        // Find the minimum non-zero element
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0 && arr[i] < minNonZero) {
                minNonZero = arr[i];
            }
        }

        // Perform operations until all elements are zero
        while (minNonZero != 0) {
            operations.add(minNonZero);

            // Subtract the minimum non-zero element from all non-zero elements
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != 0) {
                    arr[i] -= minNonZero;
                }
            }

            // Find the new minimum non-zero element
            minNonZero = Integer.MAX_VALUE;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != 0 && arr[i] < minNonZero) {
                    minNonZero = arr[i];
                }
            }
        }

        // Print the minimum non-zero element before each operation
        for (int i = 0; i < operations.size(); i++) {
            System.out.print(operations.get(i) + " ");
        }
        System.out.println();
    }
}