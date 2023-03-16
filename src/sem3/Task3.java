package sem3;

import java.util.ArrayList;
import java.util.Random;

public class Task3 {
//    Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее ариф. из этого списка
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        Random random = new Random();
        for(int i = 0; i < 10; i++){
            list.add(random.nextInt(100 - 0) + 0);
        }

        System.out.println("Наш список: " + list);

        int min = 101;
        int max = -1;
        int sum = 0;
        for (int i = 0; i < list.size(); i++){
            int temp = list.get(i);

            if (temp < min){
                min = list.get(i);
            }

            if (temp > max){
                max = list.get(i);
            }

            sum += temp;
        }
        sum = sum / list.size();
        System.out.println("Макс: " + max);
        System.out.println("Мин: " + min);
        System.out.println("Среднее ариф: " + sum);
    }
}
