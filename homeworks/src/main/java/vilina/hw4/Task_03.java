package vilina.hw4;
import java.util.Scanner;

//В калькулятор добавьте возможность отменить последнюю операцию.
public class Task_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int one, two;
        char oper;

        System.out.print("Введите первое число:");
        one = scan.nextInt();
        System.out.print("Введите второе число:");
        two = scan.nextInt();
        System.out.print("Введите операцию(+,-,*,/):");
        oper = scan.next().charAt(0);
        calculate(one, two, oper);
        System.out.println("нажмите ~ для отмены операции");
        oper = scan.next().charAt(0);
        if (oper == '~') {
            System.out.print("Введите операцию(+,-,*,/):");
            oper = scan.next().charAt(0);
            calculate(one, two, oper);
        }
        scan.close();
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
            case '+' -> answer = one + two;
            case '-' -> answer = one - two;
            case '*' -> answer = one * two;
            case '/' -> answer = checkZero(one, two, '/');
            default -> {
                answer = 0;
                correct = false;
            }
        }
        System.out.println(correct ? "Результат: " + answer : "Неверная операция!");
    }

    /**
     *   Проверка деления на 0
     * @param one  первое число
     * @param two  второе число
     * @param oper оператор +,-,*,/
     * @return int
     */
    private static int checkZero(int one, int two, char oper) {
        int result = 0;
        if (oper == '/' && (two != 0 && one !=0)) {
            result = one / two;
        }
        return result;
    }

}