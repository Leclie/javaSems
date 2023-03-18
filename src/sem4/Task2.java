package sem4;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
//    Реализуйте очередь с помощью LinkedList со следующими методами:
//    enqueue() - помещает элемент в конец очереди,
//    dequeue() - возвращает первый элемент из очереди и удаляет его,
//    first() - возвращает первый элемент из очереди, не удаляя.
    public static <T> void enqueue(List<T> list, T item){
        list.add(item);
    }

    public static <T> T dequeue(List<T> list){
        T firstItem = list.get(0);
        list.remove(0);
        return firstItem;
    }

    public static <T> T first(List<T> list){
        return list.get(0);
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        enqueue(list, 1);
        enqueue(list, 2);
        enqueue(list, 3);
        enqueue(list, 4);
        System.out.println(list);

        System.out.println(dequeue(list));
        System.out.println(list);

        System.out.println(first(list));
        System.out.println(list);
    }
}
