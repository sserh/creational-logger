package ru.raccoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        Scanner scanner = new Scanner(System.in);
        List<Integer> source = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        Random random = new Random();

        logger.log("Запуск программы.");
        logger.log("Просим пользователя ввести входные данные для списка.");
        System.out.print("Введите размер списка: ");
        int counter = scanner.nextInt();
        System.out.print("Введите верхнюю границу для значений: ");
        int hiLimit = scanner.nextInt();

        logger.log("Создаём и наполняем список.");
        for (int i = 0; i < counter; i++) {
            source.add(random.nextInt(hiLimit));
        }
        System.out.print("Вот случайный список: ");
        for (int value :
                source) {
            System.out.print(value + " ");
        }
        System.out.println();

        logger.log("Просим пользователя ввести входные данные для фильтрации.");
        System.out.print("Введите порог для фильтра: ");
        Filter filter = new Filter(scanner.nextInt());
        result = filter.filterOut(source);

        logger.log("Прошло фильтр " + result.size() + " элементов из " + source.size());
        logger.log("Выводим результат на экран");
        System.out.print("Отфильтрованный список: ");
        for (int value :
                result) {
            System.out.print(value + " ");
        }
        System.out.println();

        logger.log("Завершаем программу");
    }
}