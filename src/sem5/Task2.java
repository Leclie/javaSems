package sem5;

import java.util.HashMap;
import java.util.Map;

public class Task2 {
//            Даны 2 строки, написать метод, который вернет true, если эти строки являются изоморфными и false, если нет.
//            Строки изоморфны, если одну букву в первом слове можно заменить на некоторую букву во втором слове, при этом
//
//            1. повторяющиеся буквы одного слова меняются на одну и ту же букву с сохранением порядка следования. (Например, add - egg изоморфны)
//            2. буква может не меняться, а остаться такой же. (Например, note - code)
//
//            Пример 1:
//
//            Input: s = "foo", t = "bar"
//
//            Output: false
//
//            Пример 2:
//
//            Input: s = "paper", t = "title"
//
//            Output: true

    public static boolean izomor(String str1, String str2){
        // Проверка на длину
        if (str1.length() != str2.length())
            return false;

        Map<Character, Character> map = new HashMap<>();

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        for (int i = 0; i < arr1.length; i++){
            // Содержится ли в словаре уже такой ключ
            if (map.containsKey(arr1[i])){
                // Если да то проверяем его значение с новым
                char temp = map.get(arr1[i]);
                // Если значение совпало, то пропускаем, иначе возвращаем false
                if (temp != arr2[i]){
                    return false;
                }
            } else {
                // Если такого ключа еще нет, то добавляем его
                map.put(arr1[i], arr2[i]);
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(izomor("add", "egg"));
        System.out.println(izomor("foo", "bar"));
        System.out.println(izomor("paper", "title"));
    }
}
