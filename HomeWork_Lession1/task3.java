// Реализовать простой калькулятор

package HomeWork_Lession1;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите первое число: ");
        int num1 = iScanner.nextInt();
        iScanner.nextLine();
        System.out.printf("Введите знак выражения (+, -, *, /): ");
        String sign = iScanner.nextLine();
        System.out.printf("Введите второе число: ");
        int num2 = iScanner.nextInt();
        iScanner.nextLine();
        String result = Check(num1, num2, sign);
        System.out.printf("Результат вычисления: %s ", result);
        iScanner.close();
    }

    public static String Check(int value1, int value2, String sign) {
        String result = " ";
        if (sign.equals("+")) {
            String res = Integer.toString(Sum(value1, value2));
            result = res;
        } else if (sign.equals("-")) {
            String res = Integer.toString(Substraction(value1, value2));
            result = res;
        } else if (sign.equals("*")) {
            String res = Integer.toString(Multiplication(value1, value2));
            result = res;
        } else if (sign.equals("/")) {
            String res = Double.toString(Division(value1, value2));
            result = res;
        }
        return result;
    }

    public static int Sum(int value1, int value2) {
        int result = value1 + value2;
        return result;
    }

    public static int Substraction(int value1, int value2) {
        int result = value1 - value2;
        return result;
    }

    public static double Division(int value1, int value2) {
        double result = value1 / value2;
        return result;
    }

    public static int Multiplication(int value1, int value2) {
        int result = value1 * value2;
        return result;
    }
}
