import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод двух чисел
        System.out.print("Введите первое число: ");
        double num1 = scanner.nextDouble();

        System.out.print("Введите второе число: ");
        double num2 = scanner.nextDouble();

        // Выполнение и вывод результатов арифметических операций
        System.out.println("Сложение: " + add(num1, num2));
        System.out.println("Вычитание: " + subtract(num1, num2));
        System.out.println("Умножение: " + multiply(num1, num2));
        System.out.println("Деление: " + divide(num1, num2));

        scanner.close();
    }
    // Метод для сложения двух чисел
    public static double add(double a, double b) {
        return a + b;
    }

    // Метод для вычитания второго числа из первого
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Метод для умножения двух чисел
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Метод для деления первого числа на второе
    public static double divide(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Ошибка: Деление на ноль невозможно.");
            return Double.NaN; // Возвращаем "не число" (NaN) в случае деления на ноль
        }
    }
}
