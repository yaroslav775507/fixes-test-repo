import java.util.Scanner;

public class Leftovers {
    public static void main(String[] args) {
        //Найти, не выполняя действий, остатки от деления на 9 и на 11 значения выражения
        //Сделать вывод о том, может ли это значение равняться 24667.
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int difference = a - b;
        int remainder9 = difference % 9;
        int remainder11 = difference % 11;

        System.out.println("Остаток от деления на 9: " + remainder9);
        System.out.println("Остаток от деления на 11: " + remainder11);
        System.out.println("Введите значение о котором можно сделать вывод: ");
        int x = s.nextInt();

        if(difference == x) {
            System.out.println("Значение "+ x + " может быть результатом");
        } else {
            System.out.println("Значение " + x + " не может быть результатом");
        }
    }

}
