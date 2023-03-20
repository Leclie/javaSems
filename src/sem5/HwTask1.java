package sem5;

import java.util.*;

public class HwTask1 {

//    Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
//    Добавить функции 1) Добавление номера
//    2) Вывод всего

    private static Map<Integer, String> map = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Введите:\n1) Добавление номера\n" +
                    "2) Вывод всего");

            String chose = scanner.next();

            switch (chose){
                case "1":
                    addNumber();
                    break;
                case "2":
                    print();
                    break;
            }
        }
    }

    private static void addNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите фамилию: ");
        String name = scanner.next();
        System.out.println("Введите номер: ");
        int number = scanner.nextInt();

        map.put(number, name);
    }

    private static void print(){
        Set<String> names = new HashSet<>();
        for(Map.Entry entry : map.entrySet()){
            names.add((String) entry.getValue());
        }

        for (String name : names){
            System.out.print(name + ": ");
            for (Map.Entry entry : map.entrySet()){
                if (entry.getValue().equals(name)){
                    System.out.print(entry.getKey() + " ");
                }
            }
            System.out.println();
        }
    }
}
