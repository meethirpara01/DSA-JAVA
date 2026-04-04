package DAY009;

import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Age: ");
        int age = sc.nextInt();
        String ans = (age > 18) ? "Eligible to vote" : "Not eligible to vote";
        System.out.println(ans);
    }
}
