package DAY011_PATTERN;

import java.util.Scanner;

public class SolidAndInvertedPyramid {
    public static void main() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number Of ROWS: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }

            for (int j = 0; j < (2 * n - 2 * i - 1); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            if (i == 0) {
                continue;
            }
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("  ");
            }

            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
