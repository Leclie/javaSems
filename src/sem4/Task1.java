package sem4;

import java.util.LinkedList;
import java.util.List;

public class Task1 {
    //    Пусть дан LinkedList с несколькими элементами. Реализуйте метод(не void), который вернет “перевернутый” список.

    public static List reverseList(List list){
        List reversedList = new LinkedList();
        int n = list.size() - 1;
        for (int i = 0; i < list.size(); i++){
            reversedList.add(list.get(n - i));
        }
        return reversedList;
    }

    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(37);
        list.add(22);
        list.add(76);
        list.add(23);
        list.add(19);
        System.out.println("Наш список:");
        System.out.println(list);
        System.out.println("Перевернутый список:");
        System.out.println(reverseList(list));
    }
}
