package vilina.hw3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

// Урок 3. Коллекции JAVA: Введение
// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
public class Task_03 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int temp = random.nextInt(10);
            list.add(temp);
        }

        for (int el : list) {
            System.out.print(el + " ");
        }

        System.out.println();
        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));

        double avg = getAverage(list);
        System.out.println(avg);
    }

    /**
     * Поиск среднего
     * @param list входной числовой массив
     * @return  вывод среднего арифметического
     */
    public static double getAverage(List<Integer> list) {
        long sum = 0;
        for (int i : list) {
            sum += i;
        }
        return list.size() > 0 ? (double) sum / list.size() : 0;
    }

}
