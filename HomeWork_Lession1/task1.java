// Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

package HomeWork_Lession1;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = in.nextInt();
        int sum = sumFunction(num);
        int mult = multFunction(num);
        System.out.printf("Сумма чисел от 1 до n: %d \n", sum);
        System.out.printf("Произведение чисел от 1 до n: %d \n", mult);
        in.close();
    }

    public static int sumFunction(int value) {
        int result = 0;
        for (int i = 1; i <= value; i++) {
            result += i;
        }
        return result;
    }

    public static int multFunction(int value) {
        int result = 1;
        for (int i = 1; i <= value; i++) {
            result *= i;
        }
        return result;
    }
}
