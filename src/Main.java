import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите цену билета: ");
        int priceTicket = in.nextInt();
        in.close();

        int bonusPrice = 20;

        System.out.println("Вы набрали " + (priceTicket / bonusPrice) + " балл(а/ов)");
    }
}