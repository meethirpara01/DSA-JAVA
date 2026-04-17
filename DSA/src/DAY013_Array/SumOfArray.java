package DAY013_Array;

import java.util.Scanner;

public class SumOfArray {
    public static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Size Of Array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Provide input for index: " + i);
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        System.out.println("Your Array contain: ");
        for (int val : arr) {
            sum += val;
            System.out.print(val + " ");
        }
        System.out.println();
        System.out.println("Sum Of Array Is: " + sum);
    }
}
