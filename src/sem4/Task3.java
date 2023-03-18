package sem4;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Task3 {
    private static Deque<Double> results = new LinkedList<>();
    private static Scanner scanner = new Scanner(System.in);

    private static double enterNumber(){
        System.out.println("Введите число b: ");
        return scanner.nextInt();
    }

    public static void main(String[] args) {
        System.out.println("Введите число а: ");
        results.addLast(scanner.nextDouble());
        double b = 0;
        String operation = "";
        while (true){
            System.out.println("Введите операцию или введите \"отмена\"");
            operation = scanner.next();

            switch (operation){
                case "+":
                    b = enterNumber();
                    results.addLast(results.getLast() + b);
                    break;
                case "-":
                    b = enterNumber();
                    results.addLast(results.getLast() - b);
                    break;
                case "*":
                    b = enterNumber();
                    results.addLast(results.getLast() * b);
                    break;
                case "/":
                    b = enterNumber();
                    results.addLast(results.getLast() / b);
                    break;
                case "отмена":
                    results.removeLast();
                    break;
            }
            if (results.isEmpty())
                return;
            System.out.println("Вывод: " + results.getLast());
        }
    }
}
