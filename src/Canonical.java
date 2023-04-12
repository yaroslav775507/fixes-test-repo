import java.util.Scanner;

public class Canonical {
    public static void main(String[] args){
        Scanner s =new Scanner(System.in);
        System.out.println("Введите 3 числа через enter");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        System.out.println("НОД(" + a + ", " + b + ", " + c + ") = " + gcd(a, b, c));
        System.out.println("НОК(" + a + ", " + b + ", " + c + ") = " + lcm(a, b, c));

    }
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static int gcd(int a, int b, int c) {
        return gcd(gcd(a, b), c);
    }

    public static int lcm(int a, int b) {
        return a * (b / gcd(a, b));
    }

    public static int lcm(int a, int b, int c) {
        return lcm(lcm(a, b), c);
    }

}
