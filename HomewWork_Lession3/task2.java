// Пусть дан произвольный список целых чисел, удалить из него четные числа

package HomewWork_Lession3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class task2 {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> listOfInteger = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            listOfInteger.add(random.nextInt(1, 20));
        }
        System.out.printf("Исходный список значений: \n" + listOfInteger);

        removeEvenNumbers(listOfInteger);

        System.out.printf("\n Скорректированный список значений: \n" + listOfInteger);
    }

    public static void removeEvenNumbers(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            int chekNumber = list.get(i);
            if (chekNumber % 2 == 0) {
                list.remove(i);
                i--;
            }
        }
    }
}
