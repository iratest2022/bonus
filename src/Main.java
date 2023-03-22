public class Main {
    public static void main(String[] args) {

        int deposit = 1100;
        int account = 100;
        int bonus;
        System.out.println("Ваш счет: " + account + "руб.");
        System.out.println("Вы пополнили счет на: " + deposit + "руб.");

        if (deposit > 999) {
            bonus = deposit / 100;
        } else {
            bonus =0;
        }
        int balance = deposit + account + bonus;
        System.out.println("Итоговый счет: " + balance + "руб.");
        System.out.println("Ваш бонус: " + bonus + "руб.");
    }
}