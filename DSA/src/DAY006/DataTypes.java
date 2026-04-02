package DAY006;

public class DataTypes {
    public static void main() {

        byte num = 127;
        System.out.println(num);

        short num1 = 5000;
        System.out.println(num1);

        int num2 = 5000;
        System.out.println(num2);

        long num3 = 50004978;
        System.out.println(num3);

        float num4 = 5.4f;
        System.out.println(num4);

        double num5 = 3.415648562698489;
        System.out.println(num5);

        boolean eligibleToVote = true;
        //boolean eligibleToVote = 1;
        System.out.println(eligibleToVote);

        char firstCharacter = 'M';
        System.out.println(firstCharacter);
        System.out.println((firstCharacter + 2));
        System.out.println("CHARATER IS:- " + (char) (firstCharacter + 5));

        //IMPLICIT - Automatically Type cast
        // EXPLICIT
        long value1 = 1654924658;
        int value2 = (int) value1;
        System.out.println(value2);

    }
}
