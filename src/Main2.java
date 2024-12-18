public class Main2 {
    public static void main(String[] args) {

        // Объявляем переменные
        double currentBalance = 100.0;  // Начальный баланс на счету
        double topUpAmount = 1100.0;    // Сумма пополнения

        // Переменная для бонуса
        double bonus = 0.0;

        // Проверяем, превышает ли сумма пополнения 1000 рублей
        if (topUpAmount > 1000) {
            // Рассчитываем бонус: за каждые полные 100 рублей пополнения - 1 рубль бонуса
            bonus = (topUpAmount / 100) * 1;
        }

        // Вычисляем итоговую сумму на счету
        double totalBalance = currentBalance + topUpAmount + bonus;

        // Выводим итоговые данные
        System.out.println("Сумма пополнения: " + topUpAmount);
        System.out.println("Бонус: " + bonus);
        System.out.println("Итоговый баланс на счёте: " + totalBalance);
    }
}