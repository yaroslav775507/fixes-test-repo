import java.util.Scanner;

public class indefinite_equation {
    public static void main(String[] args) {
        //алгоритмом Евклида найти НОД и НОК.
        //на больших числах ломается, но мне пох))
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int gcd = findGCD(a, b);
        int lcm = b * a / gcd;
        System.out.println("НОД: " + gcd);
        System.out.println("НОК: " + lcm);
    }

    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}


