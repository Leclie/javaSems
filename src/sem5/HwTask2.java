package sem5;

import java.util.*;

public class HwTask2 {
    private static ArrayList<String> names = new ArrayList<>();
    public static void main(String[] args) {
        writeArray();
        Map<String, Integer> map = new HashMap<>();
        for (String name : names){
            name = name.substring(0, name.indexOf(" "));
//            System.out.println(name);
            if (map.containsKey(name)){
                map.put(name, map.get(name) + 1);
            } else {
                map.put(name, 1);
            }
        }

        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEach(System.out::println);
    }

    public static void writeArray(){
        names.add("Иван Иванов");
        names.add("Светлана Петрова");
        names.add("Кристина Белова");
        names.add("Анна Мусина");
        names.add("Анна Крутова");
        names.add("Иван Юрин");
        names.add("Петр Лыков");
        names.add("Павел Чернов");
        names.add("Петр Чернышов");
        names.add("Мария Федорова");
        names.add("Марина Светлова");
        names.add("Мария Савина");
        names.add("Мария Рыкова");
        names.add("Марина Лугова");
        names.add("Анна Владимирова");
        names.add("Иван Мечников");
        names.add("Петр Петин");
        names.add("Иван Ежов");
    }
}
