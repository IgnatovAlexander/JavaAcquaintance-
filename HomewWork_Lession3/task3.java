// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.

package HomewWork_Lession3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class task3 {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> listOfInteger = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            listOfInteger.add(random.nextInt(1, 20));
        }
        System.out.printf("Исходный список значений: \n" + listOfInteger);
        System.out.printf("\n Минимальное значение: \n" + maxValueOperator(listOfInteger));
        System.out.printf("\n Максимальное значение: \n" + minValueOperator(listOfInteger));
        System.out.printf("\n Среднее значение: \n" + arrMeanOperator(listOfInteger));
    }

    public static int maxValueOperator(List<Integer> list) {
        int maxValue = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            int chekNumber = list.get(i);
            if (chekNumber > maxValue) {
                maxValue = chekNumber;
            }
        }
        return maxValue;
    }

    public static int minValueOperator(List<Integer> list) {
        int minValue = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            int chekNumber = list.get(i);
            if (chekNumber < minValue) {
                minValue = chekNumber;
            }
        }
        return minValue;
    }

    public static double arrMeanOperator(List<Integer> list) {
        double sumOfValue = 0;
        double arrMean;
        for (int i = 0; i < list.size(); i++) {
            sumOfValue = sumOfValue + list.get(i);
        }
        arrMean = sumOfValue / list.size();
        return arrMean;
    }
}
