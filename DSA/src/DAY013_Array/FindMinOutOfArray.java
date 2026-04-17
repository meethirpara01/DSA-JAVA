package DAY013_Array;

import java.util.Scanner;

public class FindMinOutOfArray {
    public static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Size Of Array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Provide input for index: " + i);
            arr[i] = sc.nextInt();
        }

        int min = arr[0];
        System.out.println("Your Array contain: ");
        for (int val : arr) {
            System.out.print(val + " ");
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] <= min) {
                min = arr[i];
            }
        }
        System.out.println();
        System.out.println("Min Element Out Of Array Is: " + min);
    }
}
