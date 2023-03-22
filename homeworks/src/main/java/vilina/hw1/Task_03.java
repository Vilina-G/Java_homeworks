package vilina.hw1;

import java.util.Scanner;

//Реализовать простой калькулятор
public class Task_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int one, two;
        char oper;

        System.out.print("Введите первое число:");
        one = scan.nextInt();
        System.out.print("Введите оперцию(+,-,*,/):");
        oper = scan.next().charAt(0);
        System.out.print("Введите второе число:");
        two = scan.nextInt();
        scan.close();

        calculate(one, two, oper);
    }

    /**
     * Функция подсчета и вывода результата
     *
     * @param one  первое число
     * @param two  второе число
     * @param oper оператор +,-,*,/
     */
    private static void calculate(int one, int two, char oper) {
        int answer;
        boolean correct = true;
        switch (oper) {
            case '+':
                answer = one + two;
                break;
            case '-':
                answer = one - two;
                break;
            case '*':
                answer = one * two;
                break;
            case '/':
                answer = one / two;
                break;
            default:
                answer = 0;
                correct = false;
        }

        System.out.println(correct ? "Результат: " + answer : "Неверная операция!");
    }
}
