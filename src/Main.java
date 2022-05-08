public class Main {
    public static void main(String[] args) {
        int depositAmount = 1243;
        int initialAmount = 230;

        int totalAmount;
        int bonus;

        System.out.println("Начальная сумма на счету у клиента: " + initialAmount + " руб.");
        System.out.println("Клиент пополнил счет на " + depositAmount + " руб.");

        if (depositAmount > 1000) {
            bonus = depositAmount / 100;
            totalAmount = initialAmount + depositAmount + bonus;
            System.out.println("Начислено бонусов: " + bonus);
            System.out.println("Итоговая сумма на счету у клиента: " + totalAmount);
        } else {
            totalAmount = initialAmount + depositAmount;
            System.out.println("Начислено бонусов: 0");
            System.out.println("Итоговая сумма на счету у клиента: " + totalAmount);
        }
    }
}