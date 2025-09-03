import java.util.Scanner;

public class first_task{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Курс покупки
        final double ROUBLES_PER_YUAN = 11.91;
        //Сумма денег в китайских юанях
        int yuan = sc.nextInt();
        //Сумма денег в китайских рублях
        double rubles = yuan * ROUBLES_PER_YUAN;

        System.out.println(Math.floor(rubles));

    }
}