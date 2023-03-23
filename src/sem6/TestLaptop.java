package sem6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TestLaptop {

    public static void main(String[] args) {

        Laptop laptop1 = new Laptop("ad245w", "intel", 16, 256, "nvidia", 7.0, 4800, 1.8, 80000);
        Laptop laptop2 = new Laptop("89af9d", "amd", 8, 128, "nvidia", 12.1, 4000, 2.0, 60000);
        Laptop laptop3 = new Laptop("ljax12", "intel", 16, 64, "nvidia", 14.1, 2000, 3.0, 40000);
        Laptop laptop4 = new Laptop("sa2da1", "amd", 4, 32, "nvidia", 11.6, 7000, 1.5, 30000);
        Laptop laptop5 = new Laptop("dbf900", "intel", 16, 128, "nvidia", 15.1, 5000, 2.5, 50000);

        ArrayList<Laptop> laptops = new ArrayList<>();
        laptops.add(laptop1);
        laptops.add(laptop2);
        laptops.add(laptop3);
        laptops.add(laptop4);
        laptops.add(laptop5);

        int chose = -1;
        Map<Integer, Double> map = new HashMap<>();

        Scanner scanner = new Scanner(System.in);

        while (chose != 0) {
            System.out.println("Введите критерий фильтрации");
            System.out.println("1 - ОЗУ");
            System.out.println("2 - Стоимость");
            System.out.println("3 - Размер экрана");
            System.out.println("4 - Размер диска");
            System.out.println("5 - Вес");
            System.out.println("0 - Показать результат");

            chose = scanner.nextInt();

            double min = 0;

            if (chose > 0 && chose < 6){
                System.out.println("Введите минимальное значение для выбранного критерия:");
                min = scanner.nextDouble();
                map.put(chose, min);
            }
        }

        System.out.println(filter(laptops, map));
    }

    public static ArrayList<Laptop> filter(ArrayList<Laptop> laptops, Map<Integer, Double> map){
        ArrayList<Laptop> goodLaptops = new ArrayList<>();
        for (Laptop laptop : laptops){
            boolean isGood = true;

            for (Map.Entry<Integer, Double> entry : map.entrySet()){
                int criterion = entry.getKey();
                double value = entry.getValue();
                switch (criterion){
                    case 1:
                        if (laptop.getRam() < value){
                            isGood = false;
                        }
                        break;
                    case 2:
                        if (laptop.getPrice() < value){
                            isGood = false;
                        }
                        break;
                    case 3:
                        if (laptop.getDisplaySize() < value){
                            isGood = false;
                        }
                        break;
                    case 4:
                        if (laptop.getStorage() < value){
                            isGood = false;
                        }
                        break;
                    case 5:
                        if (laptop.getWeight() < value){
                            isGood = false;
                        }
                        break;
                }
            }

            if (isGood)
                goodLaptops.add(laptop);
        }
        return goodLaptops;
    }
}
