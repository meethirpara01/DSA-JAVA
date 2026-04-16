package DAY012_Methos;

public class Methos {
    static void printtable(int num) {
        for (int i = 0; i < 10; i++) {
            System.out.println(num + " X " + (i + 1) + " = " + num * (i + 1));
        }
    }

    static int sumTwoNumbrs(int a, int b) {
        return a + b;
    }

    public static void main() {
        printtable(5);
        int answer = sumTwoNumbrs(5, 10);
        System.out.println("SUM: " + answer);
    }
}
