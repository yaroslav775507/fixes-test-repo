import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Поиск сравнения
        Scanner s = new Scanner(System.in);
        int a = Integer.parseInt(s.nextLine());
        int b = Integer.parseInt(s.nextLine());
        int m = Integer.parseInt(s.nextLine());

        int[] gcdCoefficients = extendedEuclideanAlgorithm(m, a);
        int u = gcdCoefficients[0];
        int v = gcdCoefficients[1];

        if (b % gcdCoefficients[2] != 0) {
            System.out.println("Уравнение " + a + "x = " + b + "(mod " + m + ") не имеет решений");
            return;
        }

        int x = (b / gcdCoefficients[2]) * v % (m / gcdCoefficients[2]);
        if (x < 0) {
            x += m / gcdCoefficients[2];
        }
        int y = (b-(a*x))/m;


        System.out.println("Решение уравнения " + a + "x = " + b + "(mod " + m + "): x = " + x + " y= "+ y);
    }

    private static int[] extendedEuclideanAlgorithm(int m, int a) {
        if (a == 0) {
            return new int[] { 1, 0, m };
        } else {
            int[] coefficients = extendedEuclideanAlgorithm(a, m % a);
            int u = coefficients[0];
            int v = coefficients[1];
            int gcd = coefficients[2];
            return new int[] { v, u - (m / a) * v, gcd };
        }
    }
}
