package vilina.hw1;

import java.util.Scanner;

//Вычислить [n-ое треугольного число](сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
public class Task_01 {

    /**
     * Решение первой задачи
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Введите число:");
        Scanner entered_number = new Scanner(System.in);
        int n = entered_number.nextInt();
        entered_number.close();

        for (int i = 1; i < n; i++) {
            //    i*(i+1)/2  формула
            System.out.println(i * (i + 1) / 2);
        }
    }
}
