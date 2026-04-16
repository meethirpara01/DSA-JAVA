package DAY011_PATTERN;

import java.util.Scanner;

public class HollowDiamond {
    public static void main() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number Of ROWS: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("  ");
            }

            for (int j = 0; j < 2 * i + 1; j++) {
                if (j == 0 || i == 0 || j == 2 * i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        for (int i = n - 1; i > 0; i--) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("  ");
            }

            for (int j = 0; j < (2 * i - 1); j++) {
                if (j == 0 || j == (2 * i - 2)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}
