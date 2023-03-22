package vilina.hw2;

import java.io.IOException;
import java.util.Arrays;
import java.util.logging.*;

// Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
public class Task_02 {
    public static void main(String[] args) throws IOException {
        int[] array = { 4, 9, 3, 12, 21, 7, 1, 47 };

        Logger logger = Logger.getLogger(Task_02.class.getName());
        FileHandler handler = new FileHandler("logfile.log");

        SimpleFormatter sFormat = new SimpleFormatter();
        handler.setFormatter(sFormat);
        logger.addHandler(handler);

        int temp; // переменная для замены
        for (int i = array.length - 1; i > 0; i--) { // внешний цикл
            for (int j = 0; j < i; j++) { // внутренний цикл
                if (array[j] > array[j + 1]) { // сравнение
                    temp = array[j]; // если истино, то меняем
                    array[j] = array[j + 1]; // местами элементы
                    array[j + 1] = temp;
                }
                logger.info(Arrays.toString(array));
            }
        }
        System.out.println(Arrays.toString(array)); // выводим результат в консоль
    }
}
