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
        //для проверки склонения
        int digit = yuan % 10;
    
        //проверка склонения валюты
        String okonchanieYuan;
        String okonchanieRubles;

        if (yuan % 100 >= 11 && yuan % 100 <= 14) {
            okonchanieYuan = "юаней";
        }
        else {
            switch (digit) {
                case 1:
                    okonchanieYuan = "юань";
                    break;
                case 2:
                case 3:
                case 4:
                    okonchanieYuan = "юаня";
                    break;
                default:
                    okonchanieYuan = "юаней";
            }
        }

        if (rubles % 100 >= 11 && rubles % 100 <= 14) {
            okonchanieRubles = "рублей";
        }
        else {
            switch (digit) {
                case 1:
                    okonchanieRubles = "рубль";
                    break;
                case 2:
                case 3:
                case 4:
                    okonchanieRubles = "рубля";
                    break;
                default:
                    okonchanieRubles = "рублей";
            }
        }


        System.out.println(yuan + " " + okonchanieYuan + " = " + Math.floor(rubles) + " " + okonchanieRubles);
                
            }
}
