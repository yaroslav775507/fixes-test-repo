public class Random {
    public static void main(String[] args) {
        //Приведите пример натурального числа, кратного 17 и при делении на 5 дающего в остатке 3.
        int n = 17;
        while (true) {
            if (n % 17 == 0 && n % 5 == 3) {
                break;
            }
            n++;
        }
        System.out.println(n);

    }

}
