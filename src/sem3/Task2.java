package sem3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Task2 {
//    Пусть дан произвольный список целых чисел, удалить из него чётные числа
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        Random random = new Random();
        for(int i = 0; i < 10; i++){
            list.add(random.nextInt(100 - 0) + 0);
        }

        System.out.println("Наш список: " + list);

        for(int i = 0; i < list.size(); i++){
            if (list.get(i) % 2 == 0){
                list.remove(i);
            }
        }

        System.out.println("Наш обновленный список: " + list);
    }
}
