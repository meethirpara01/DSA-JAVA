package DAY008;

import java.util.Scanner;

public class IO {
    public static void main() {
        int a = 5;
        int b = 4;
        System.out.println(a + b);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for FisrtNum:");
        int firstNum = sc.nextInt();
        System.out.println("Enter the value for SecondNum");
        int secondNum = sc.nextInt();
        System.out.println(firstNum + secondNum);

        sc.close();
    }
}
