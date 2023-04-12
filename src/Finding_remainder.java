import java.util.Scanner;

public class Finding_remainder {
    public static void main(String[] args) {
        //Поиск последней цифры числа в степени
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число a:");
        int a = scanner.nextInt();
        System.out.println("Введите степень b:");
        int b = scanner.nextInt();

        int lastDigit = a % 10;
        if (b == 0) {
            System.out.println("Последняя цифра числа a^b равна 1");
        } else {
            int cycle = b % 4;
            if (cycle == 0) {
                cycle = 4;
            }
            int result = (int) Math.pow(lastDigit, cycle) % 10;
            System.out.println("Последняя цифра числа a^b равна " + result);
        }

}
}
