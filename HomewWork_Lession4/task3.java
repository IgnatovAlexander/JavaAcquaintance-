/*
 * 1) Написать метод, который принимает массив элементов, помещает их в стэк и выводит на консоль содержимое стэка. 
 * 2) Написать метод, который принимает массив элементов, помещает их в очередь и выводит на консоль содержимое очереди.
 */

package HomewWork_Lession4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class task3 {
    public static void main(String[] args) {
        String[] array = { "a", "b", "c", "d", "e", "f", "d", "h", "i", "j" };
        printStack(array);
        printQueue(array);
    }

    public static void printStack(String[] array) {
        Stack<String> stack = new Stack<>();
        for (String s : array) {
            stack.push(s);
        }
        while (!stack.empty()){
            System.out.println(stack.pop());
        }
    }

    public static void printQueue(String[] array) {
        Queue<String> queue = new LinkedList<>();
        for (String s : array) {
            queue.add(s);
        }

        while (!queue.isEmpty()) {
            System.out.println(queue.remove());
        }
    }
}
