import java.util.Scanner;
public class second_task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Курс покупки
        final double ROUBLES_PER_YUAN = 11.91;
        //Сумма денег в китайских юанях
        int yuan = sc.nextInt();
        //Сумма денег в китайских рублях
        double rubles = yuan * ROUBLES_PER_YUAN;

        int digit = yuan % 10;
        //Для частных случаев 11-14
        int twoDigit = yuan % 100;
        //Проверка последнего значения для склонения
        if (digit == 1 && twoDigit != 11 ){
            System.out.println(yuan + " юань = " + rubles + " рублей.");
        } else if ((digit >=1 && digit <=4) && (twoDigit < 11 && twoDigit > 14)) {
            System.out.println(yuan + " юаня = " + rubles + " рублей.");
        } else {
            System.out.println(yuan + " юаней = " + rubles + " рублей.");
        }
    }
}
