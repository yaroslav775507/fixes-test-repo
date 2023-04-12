import java.math.BigInteger;
import java.util.Scanner;

public class Remainder {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//      Даже если одно значение подставляем вторым одинаковое первому
        int result = (lastTwoDigits(11, 7, 1841) + lastTwoDigits(11, 7, 1841)) % 7;//для двух чисел
        System.out.println("Остаток от деления равен " + result);

    }
    public static int lastTwoDigits(int base, int mod, int exponent) {
        int result = 1;
        for (int i = 1; i <= exponent; i++) {
            result = (result * base) % mod;
        }
        return result;
    }

}
