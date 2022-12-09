/*
 * Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
  */

package HomewWork_Lession4;

import java.util.*;

public class task1 {
    public static void main(String[] args) {
        LinkedList<String> stringLinkedList = new LinkedList<>();
        stringLinkedList.add("a");
        stringLinkedList.add("b");
        stringLinkedList.add("c");
        stringLinkedList.add("d");
        stringLinkedList.add("e");

        System.out.println(stringLinkedList);
        printDescending(stringLinkedList);
    }

    static void printDescending(LinkedList<String> stringLinkedList) {
        Iterator<String> itr = stringLinkedList.descendingIterator();
        LinkedList<String> descendingLinkedList = new LinkedList<>();
        while (itr.hasNext()) {
            String str = itr.next();
            descendingLinkedList.add(str);
        }
        System.out.println(descendingLinkedList);
    }
}
