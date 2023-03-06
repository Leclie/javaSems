package sem1;

import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
//        1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), а так же n! (произведение чисел от 1 до n)
//        Ввод:5
//        Треугольное число 1 + 2 + 3 + 4 + 5 = 15
//        n! 1 * 2 * 3 * 4 * 5 = 120
        System.out.println("Задание 1.");
        System.out.print("Введите число n: ");
        int n = new Scanner(System.in).nextInt();
        int sum = 0;
        int mult = 1;
        for (int i = 1; i <= n; i++) {
            sum += i;
            mult *= i;
        }
        System.out.println("Sum: " + sum);
        System.out.println("Mult: " + mult);



//        2. Вывести все простые числа от 1 до 1000
        System.out.println();
        System.out.println("Задание 2.");
        System.out.print("Простые числа от 1 до 1000: ");
        boolean fl = false;
        for (int i = 2; i < 1000; i++){
            for (int j = 2; j < i; j++){
                if (i % j == 0){
                    // Число простое
                    fl = true;
                }
            }
            if (!fl){
                System.out.print(i + " ");
            }
            fl = false;
        }



//        Реализовать простой калькулятор (+ - / *)
        System.out.println();
        System.out.println("Задание 3.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int x = sc.nextInt();
        System.out.println("Введите операцию(+, -, *, /): ");
        String oper = sc.next();
        System.out.println("Введите второе число: ");
        int y = sc.nextInt();

        if (oper.equals("+")){
            System.out.println(x + y);
        }
        if (oper.equals("-")){
            System.out.println(x - y);
        }
        if (oper.equals("*")){
            System.out.println(x * y);
        }
        if (oper.equals("/")){
            System.out.println(x / y);
        }
    }
}
