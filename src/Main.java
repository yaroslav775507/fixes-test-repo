import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = Integer.parseInt(s.nextLine());
        int b = Integer.parseInt(s.nextLine());
        int m = Integer.parseInt(s.nextLine());

        // Находим НОД(m, a) и коэффициенты u и v такие, что um + va = НОД(m, a)
        int[] gcdCoefficients = extendedEuclideanAlgorithm(m, a);
        int u = gcdCoefficients[0];
        int v = gcdCoefficients[1];

        // Если b не кратно НОД(m, a), то уравнение не имеет решений
        if (b % gcdCoefficients[2] != 0) {
            System.out.println("Уравнение " + a + "x = " + b + "(mod " + m + ") не имеет решений");
            return;
        }

        // Вычисляем x = (b/НОД(m, a))*v (mod m/НОД(m, a))
        int x = (b / gcdCoefficients[2]) * v % (m / gcdCoefficients[2]);
        if (x < 0) {
            x += m / gcdCoefficients[2];
        }
        int y = (b-(a*x))/m;


        System.out.println("Решение уравнения " + a + "x = " + b + "(mod " + m + "): x = " + x + " y= "+ y);
    }

    // Расширенный алгоритм Евклида для нахождения НОД и коэффициенты u и v такие, что um + va = НОД(m, a)
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
