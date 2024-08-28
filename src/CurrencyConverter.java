import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Запрос у пользователя суммы в евро
        System.out.print("Введите сумму в Евро:");
        double euroAmount = scanner.nextDouble();

        // Запрос у пользователя текущего курса обмена
        System.out.print("Введите текущий курс обмена Евро в Доллары США: ");
        double conversionRate = scanner.nextDouble();

        // Конвертация евро в доллары США
        double usdAmount = convertEuroToUsd(euroAmount, conversionRate);

        // Вывод результата на экран
        System.out.printf("Сумма в Долларах США: %.2f%n", usdAmount);

        scanner.close();
    }

    // Метод для конвертации евро в доллары США
    public static double convertEuroToUsd(double euroAmount, double conversionRate) {
        return euroAmount * conversionRate;
    }
}
