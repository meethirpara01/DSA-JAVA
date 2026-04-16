package DAY011_PATTERN;

import java.util.Scanner;

public class SolidPyramidCHAR {
    public static void main() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number Of ROWS: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("  ");
            }

            char ch = 'A';
            for (int j = 0; j <= i; j++) {
                System.out.print(ch++ + " ");
            }

            ch--;
            for (int j = 0; j <= i - 1; j++) {
                System.out.print(--ch + " ");
            }
            System.out.println();
        }

    }
}
