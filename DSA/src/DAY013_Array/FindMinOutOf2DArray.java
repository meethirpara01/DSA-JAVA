package DAY013_Array;

import java.util.Scanner;

public class FindMinOutOf2DArray {
    public static void main() {
        Scanner sc = new Scanner(System.in);

        int[][] drr = new int[3][4];
        for (int i = 0; i < drr.length; i++) {
            for (int j = 0; j < drr[i].length; j++) {
                System.out.print("Provide input for index [ROW][COL]: [" + i + "][" + j + "]: ");
                drr[i][j] = sc.nextInt();
            }
        }

        int min = drr[0][0];
        for (int i = 0; i < drr.length; i++) {
            for (int j = 0; j < drr[i].length; j++) {
                if (drr[i][j] <= min) {
                    min = drr[i][j];
                }
                System.out.print(drr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Max Element Out Of Array Is: " + min);
    }
}
