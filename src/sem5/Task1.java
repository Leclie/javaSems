package sem5;

import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(123456, "Иванов");
        map.put(321456, "Васильев");
        map.put(234561, "Петрова");
        map.put(234432, "Иванов");
        map.put(654321, "Петрова");
        map.put(345678, "Иванов");

        for (Map.Entry<Integer, String> entry : map.entrySet()){
            if (entry.getValue().equals("Иванов"))
                System.out.println("Иванов: " + entry.getKey());
        }
    }
}
