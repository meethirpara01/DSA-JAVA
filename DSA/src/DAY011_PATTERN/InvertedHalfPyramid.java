package DAY011_PATTERN;

import java.util.Scanner;

public class InvertedHalfPyramid {
    public static void main() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number Of ROWS: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
