package DAY011_PATTERN;

import java.util.Scanner;

public class HalfPyramidWithCharFromLast {
    public static void main() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number Of ROWS: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int alphbet = 'A' + n - 1;
            char ch = (char) alphbet;

            for (int j = 0; j <= i; j++) {
                System.out.print(ch-- + " ");
            }
            System.out.println();
        }
    }
}
