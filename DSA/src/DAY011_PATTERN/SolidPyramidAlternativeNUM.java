package DAY011_PATTERN;

import java.util.Scanner;

public class SolidPyramidAlternativeNUM {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number Of ROWS: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("  ");
            }

            int counter = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(counter++ + " ");
            }

            counter--;
            for (int j = 0; j <= i - 1; j++) {
                System.out.print(--counter + " ");
            }
            System.out.println();
        }
    }
}
