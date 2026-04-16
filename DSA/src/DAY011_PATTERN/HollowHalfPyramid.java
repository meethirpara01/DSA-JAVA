package DAY011_PATTERN;

import java.util.Scanner;

public class HollowHalfPyramid {
    public static void main() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number Of ROWS: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || i == 0 || j == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
