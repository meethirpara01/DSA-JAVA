package DAY013_Array;

import java.util.Scanner;

public class TwoDimensionalArray {
    public static void main() {
        Scanner sc = new Scanner(System.in);

        int[][] arr;
        arr = new int[3][4];

        int[][] brr = {
                {1, 2},
                {1, 3, 4, 5},
                {5, 6, 7},
                {8},
        };

        int rowLength = brr.length;
        for (int i = 0; i < rowLength; i++) {
            int colLength = brr[i].length;
            for (int j = 0; j < colLength; j++) {
                System.out.print(brr[i][j] + " ");
            }
            System.out.println();
        }


        System.out.println();
        System.out.println("JAGGED ARRAY ALLOCATION AND PRINTING :");

        int[][] crr = new int[3][];
        crr[0] = new int[2];
        crr[1] = new int[4];
        crr[2] = new int[1];

        int value = 1;
        for (int i = 0; i < crr.length; i++) {
            for (int j = 0; j < crr[i].length; j++) {
                crr[i][j] = value++;
            }
        }

        for (int i = 0; i < crr.length; i++) {
            for (int j = 0; j < crr[i].length; j++) {
                System.out.print(crr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        int[][] drr = new int[3][4];
        for (int i = 0; i < drr.length; i++) {
            for (int j = 0; j < drr[i].length; j++) {
                System.out.print("Provide input for index [ROW][COL]: [" + i + "][" + j + "]: ");
                drr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < drr.length; i++) {
            for (int j = 0; j < drr[i].length; j++) {
                System.out.print(drr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
