// Вывести все простые числа от 1 до 1000

package HomeWork_Lession1;

public class task2 {
    public static void main(String[] args) {
        boolean simple = true;
        for (int i = 2; i <= 1000; i++) {
            simple = Check(i);
            if (simple) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean Check(int number) {
        int value;
        for (int i = 2; i <= number / 2; i++) {
            value = number % i;
            if (value == 0) {
                return false;
            }
        }
        return true;

    }
}
