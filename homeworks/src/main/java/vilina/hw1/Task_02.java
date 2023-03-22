package vilina.hw1;

import java.util.Scanner;

//Вывести все простые числа от 1 до 1000
public class Task_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число например 1000");
        int top = scanner.nextInt();
        for (int i = 1; i < top; i++) {
            if (checkSimple(i)) System.out.println(i);
        }
    }

    /**
     * Проверка на простое число
     *
     * @param i входное число
     * @return boolean
     */
    public static boolean checkSimple(int i) {
        if (i <= 1) return false;
        else if (i <= 3) return true;
        else if (i % 2 == 0 || i % 3 == 0) return false;
        int n = 5;
        while (n * n <= i) {
            if (i % n == 0 || i % (n + 2) == 0) return false;
            n = n + 6;
        }
        return true;
    }
}
