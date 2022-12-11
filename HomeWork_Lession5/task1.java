/*
 * Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
 */

package HomeWork_Lession5;

import java.util.HashMap;
import java.util.Map;

public class task1 {
    public static void main(String[] args) {
        Map<String, String> phone = new HashMap<>();
        phone.put("(926) 111-222-333","Иван Иванов");
        phone.put("(926) 222-333-111","Светлана Петрова");
        phone.put("(926) 222-222-333","Кристина Белова");
        phone.put("(926) 222-222-111","Анна Мусина");
        phone.put("(926) 111-222-111","Иван Иванов");

        for (String key : phone.keySet()) {
            System.out.println("Номер телефона: " + key + " Имя: " + phone.get(key));
        }
    }
}
