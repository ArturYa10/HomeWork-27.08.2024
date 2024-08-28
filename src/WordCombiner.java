import java.util.Scanner;

public class WordCombiner  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод первого слова
        System.out.print("Введите первое слово:");
        String word1 = scanner.nextLine();

        // Ввод второго слова
        System.out.print("Введите второе слово: ");
        String word2 = scanner.nextLine();

        // Проверка на четность длины обоих слов
        if (word1.length() % 2 == 0 && word2.length() % 2 == 0) {
            // Создание нового слова из первой половины первого слова и второй половины второго слова
            String combinedWord = word1.substring(0, word1.length() / 2) + word2.substring(word2.length() / 2);
            System.out.println("Результат: " + combinedWord);
        } else {
            System.out.println("Оба слова должны содержать четное количество букв.");
        }

        scanner.close();
    }
}
