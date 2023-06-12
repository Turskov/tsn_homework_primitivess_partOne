import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите цену билета: ");
        int price_ticket = in.nextInt();
        in.close();

        int bonus_price = 20;

        System.out.println("Вы набрали " + (price_ticket / bonus_price) + " балл(а/ов)");

        // Объявляете переменные для входных данных и
        // параметров программы: одну для хранения
        // стоимости билета, другую для хранения количества
        // рублей для одной бонусной мили

        // Рассчитываете количество бонусных миль, используя
        // значения заведённых переменных. Ответ сохраняете в
        // новую переменную и выводите на экран
    }
}