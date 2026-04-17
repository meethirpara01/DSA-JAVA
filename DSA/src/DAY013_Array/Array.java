package DAY013_Array;

import java.util.Scanner;

public class Array {
    public static void main() {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int brr[] = {10, 20, 30, 40, 50};
        for (int val : brr) {
            System.out.print(val + " ");
        }

        System.out.println();
        System.out.println("Enter Value Of Array: ");
        int crr[] = new int[5];
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.println("Provide input for index: " + i);
            crr[i] = sc.nextInt();
        }

        System.out.println("Your Array contain: ");
        for (int val : crr) {
            System.out.print(val + " ");
        }
        System.out.println();


    }
}
