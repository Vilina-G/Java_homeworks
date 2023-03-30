package vilina.hw4;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

// Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
public class Task_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите минимальное число: ");
        int minNumber = input.nextInt();
        System.out.print("Введите максимальное число: ");
        int maxNumber = input.nextInt();
        System.out.print("Введите размер списка: ");
        int listSize = input.nextInt();
        input.close();

        LinkedList<Integer> listNumber = getRandomLinkedList(minNumber, maxNumber, listSize);
        System.out.println(listNumber);
        reverseLinkedList(listNumber);
        System.out.println(listNumber);
    }

    /**
     * Генерация рандомного числа
     *
     * @param minimum минимальное число
     * @param maximum максимальное число
     * @return число
     */
    static int getRandomNumberInt(int minimum, int maximum) {
        Random random = new Random();
        return random.ints(minimum, maximum)
                .findFirst()
                .getAsInt();
    }

    /**
     * Получение списка сгенерированых случайных чисел
     * @param minimum минимальное число
     * @param maximum максимальное число
     * @param size размер массива
     * @return массив чисел
     */
    static LinkedList<Integer> getRandomLinkedList(int minimum, int maximum, int size) {
        LinkedList<Integer> array = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            array.add(getRandomNumberInt(minimum, maximum));
        }
        return array;
    }

    /**
     * разворот массива в обратную сторону
     * @param array массив
     */
    static void reverseLinkedList(LinkedList<Integer> array) { // через цикл
        List<Integer> temp = new LinkedList<>(array);
        int j = 0;
        for (int i = temp.size() - 1; i >= 0; i--) {
            array.set(j, temp.get(i));
            j++;
        }
    }
}
