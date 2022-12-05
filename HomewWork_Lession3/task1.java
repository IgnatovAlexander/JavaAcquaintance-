//Реализовать алгоритм сортировки слиянием

package HomewWork_Lession3;
import java.util.Arrays;

public class task1 {
    public static void main(String[] args) {
        int[] listOfInteger = new int[10];
        for (int i = 0; i < 10; i++) {
            listOfInteger[i] = (int) Math.round((Math.random() * 30) - 15);
        }
        System.out.printf("Исходный список значений: \n");
        for(int i = 0; i < listOfInteger.length; i++){
            System.out.print(listOfInteger[i] + " ");
        }
        int[] resultList = mergeList(listOfInteger);
        System.out.printf("\n Измененный список значений: \n");
        for(int i = 0; i < resultList.length; i++){
            System.out.print(resultList[i] + " ");
        }
    }

    public static int[] mergeList(int[] array1) {
        int[] buffer1 = Arrays.copyOf(array1, array1.length);
        int[] buffer2 = new int[array1.length];
        int[] result = mergeInner(buffer1, buffer2, 0, array1.length);
        return result;
    }

    public static int[] mergeInner(int[] buffer1, int[] buffer2,
            int startIndex, int endIndex) {
        if (startIndex >= endIndex - 1) {
            return buffer1;
        }

        int middle = startIndex + (endIndex - startIndex) / 2;
        int[] sorted1 = mergeInner(buffer1, buffer2, startIndex, middle);
        int[] sorted2 = mergeInner(buffer1, buffer2, middle, endIndex);

        int index1 = startIndex;
        int index2 = middle;
        int destIndex = startIndex;
        int[] result = sorted1 == buffer1 ? buffer2 : buffer1;
        while (index1 < middle && index2 < endIndex) {
            result[destIndex++] = sorted1[index1] < sorted2[index2]
                    ? sorted1[index1++]
                    : sorted2[index2++];
        }
        while (index1 < middle) {
            result[destIndex++] = sorted1[index1++];
        }
        while (index2 < endIndex) {
            result[destIndex++] = sorted2[index2++];
        }
        return result;
    }

}
